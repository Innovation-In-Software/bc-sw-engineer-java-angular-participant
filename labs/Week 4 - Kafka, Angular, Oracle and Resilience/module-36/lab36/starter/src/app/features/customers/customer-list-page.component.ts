import { Component, computed, inject, signal } from '@angular/core';
import { takeUntilDestroyed } from '@angular/core/rxjs-interop';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { catchError, of } from 'rxjs';
import { CustomerApiService } from './customer-api.service';
import { CustomerListItemComponent } from './customer-list-item.component';
import { Customer } from './customer.model';

type StatusFilter = 'ALL' | 'ACTIVE' | 'PROSPECT';

@Component({
  selector: 'app-customer-list-page',
  standalone: true,
  imports: [CustomerListItemComponent, ReactiveFormsModule],
  template: `
    <section>
      <h2>Customers</h2>
      <form [formGroup]="filterForm">
        <label>
          Status
          <select formControlName="status">
            <option value="ALL">ALL</option>
            <option value="ACTIVE">ACTIVE</option>
            <option value="PROSPECT">PROSPECT</option>
          </select>
        </label>
        <button type="button" (click)="loadCustomers()">Reload</button>
        <button type="button" (click)="createMaya()">Create Maya (CUS-1003)</button>
        <button type="button" (click)="simulateError()">Simulate error</button>
      </form>

      @if (loading()) {
        <p>Loading customers…</p>
      } @else if (error()) {
        <p role="alert">{{ error() }}</p>
      } @else if (filteredCustomers().length === 0) {
        <p>No customers match this filter.</p>
      } @else {
        @for (c of filteredCustomers(); track c.id) {
          <app-customer-list-item [customer]="c" (select)="onSelect($event)" />
        }
      }
      <p class="detail">Selected: {{ selectedId ?? 'none' }}</p>
    </section>
  `,
})
export class CustomerListPageComponent {
  private readonly api = inject(CustomerApiService);

  customers = signal<Customer[]>([]);
  loading = signal(true);
  error = signal<string | null>(null);
  statusFilter = signal<StatusFilter>('ALL');
  selectedId: string | null = null;

  filterForm = new FormGroup({
    status: new FormControl<StatusFilter>('ALL', { nonNullable: true }),
  });

  filteredCustomers = computed(() => {
    const f = this.statusFilter();
    const list = this.customers();
    return f === 'ALL' ? list : list.filter((c) => c.status === f);
  });

  constructor() {
    this.filterForm.controls.status.valueChanges
      .pipe(takeUntilDestroyed())
      .subscribe((status) => this.statusFilter.set(status));

    this.loadCustomers();
  }

  loadCustomers(): void {
    this.loading.set(true);
    this.error.set(null);
    this.api
      .getAll()
      .pipe(
        catchError((err: { message?: string }) => {
          this.error.set(err.message ?? 'lab-request-001 failed');
          return of([] as Customer[]);
        }),
      )
      .subscribe((list) => {
        this.customers.set(list);
        this.loading.set(false);
      });
  }

  createMaya(): void {
    this.error.set(null);
    this.api
      .create({
        id: 'CUS-1003',
        name: 'Maya Chen',
        email: 'maya@example.com',
        status: 'PROSPECT',
      })
      .subscribe({
        next: () => this.loadCustomers(),
        error: (err: { message?: string }) =>
          this.error.set(err.message ?? 'lab-request-001 failed'),
      });
  }

  simulateError(): void {
    this.loading.set(false);
    this.error.set('lab-request-001 failed');
  }

  onSelect(id: string): void {
    this.selectedId = id;
  }
}
