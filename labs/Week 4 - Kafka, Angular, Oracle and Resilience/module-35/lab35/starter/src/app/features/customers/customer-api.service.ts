import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Customer } from './customer.model';

@Injectable({ providedIn: 'root' })
export class CustomerApiService {
  // TODO: inject HttpClient; base = `${environment.apiBaseUrl}/api/customers`

  getAll(): Observable<Customer[]> {
    // TODO: return this.http.get<Customer[]>(this.base);
    return of([]);
  }

  getById(id: string): Observable<Customer> {
    // TODO: return this.http.get<Customer>(`${this.base}/${id}`);
    return of({ id, name: '', email: '', status: '' });
  }

  create(customer: Customer): Observable<Customer> {
    // TODO: return this.http.post<Customer>(this.base, customer);
    return of(customer);
  }
}
