import { Component, computed, signal } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CustomerListItemComponent } from './customer-list-item.component';
import { Customer, SEED_CUSTOMERS } from './customer.model';

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
        <button type="button" (click)="simulateError()">Simulate error</button>
      </form>

      <!-- TODO: @if loading / error / empty / @for filteredCustomers() -->
      <p class="detail">Selected: {{ selectedId ?? 'none' }}</p>
    </section>
  `,
})
export class CustomerListPageComponent {
  // TODO: customers / loading / error Signals; loadSeeds() with a short delay
  customers = signal<Customer[]>([]);
  loading = signal(false);
  error = signal<string | null>(null);
  statusFilter = signal<StatusFilter>('ALL');
  selectedId: string | null = null;

  filterForm = new FormGroup({
    status: new FormControl<StatusFilter>('ALL', { nonNullable: true }),
  });

  // TODO: computed filter from statusFilter + customers
  filteredCustomers = computed(() => this.customers());

  constructor() {
    // TODO: valueChanges -> statusFilter.set; call loadSeeds()
  }

  loadSeeds(): void {
    this.customers.set([...SEED_CUSTOMERS]);
  }

  simulateError(): void {
    this.error.set('lab-request-001 failed');
  }

  onSelect(id: string): void {
    this.selectedId = id;
  }
}
