import { Routes } from '@angular/router';
import { authGuard } from './core/auth/auth.guard';
import { CustomerListPageComponent } from './features/customers/customer-list-page.component';
import { LoginPageComponent } from './features/login/login-page.component';

export const routes: Routes = [
  { path: 'login', component: LoginPageComponent },
  // TODO: add canActivate: [authGuard]
  { path: 'customers', component: CustomerListPageComponent, canActivate: [authGuard] },
  { path: '', pathMatch: 'full', redirectTo: 'customers' },
];
