import { Component } from '@angular/core';

@Component({
  selector: 'app-customer-list-page',
  standalone: true,
  template: `
    <section>
      <!-- TODO: add data-testid="customer-list" -->
      <h2>Customers</h2>
      <div>CUS-1001 Amina Khan</div>
      <div>CUS-1002 Ravi Singh</div>
      <input><!-- TODO: data-testid="customer-create-name" -->
      <button>Create</button>
    </section>
  `,
})
export class CustomerListPageComponent {}
