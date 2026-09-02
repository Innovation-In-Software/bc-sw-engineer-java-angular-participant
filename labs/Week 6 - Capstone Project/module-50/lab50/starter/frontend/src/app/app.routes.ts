import { Routes } from '@angular/router';
import { authGuard } from './core/auth/auth.guard';
import { InteractionListPageComponent } from './features/interactions/interaction-list-page.component';
import { LoginPageComponent } from './features/login/login-page.component';

export const routes: Routes = [
  { path: 'login', component: LoginPageComponent },
  { path: 'interactions', component: InteractionListPageComponent, canActivate: [authGuard] },
  { path: '', pathMatch: 'full', redirectTo: 'interactions' },
];
