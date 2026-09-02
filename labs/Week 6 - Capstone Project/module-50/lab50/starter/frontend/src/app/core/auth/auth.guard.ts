import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { AuthSessionService } from './auth-session.service';

export const authGuard: CanActivateFn = () => {
  const token = inject(AuthSessionService).accessToken();
  const router = inject(Router);
  return token ? true : router.parseUrl('/login');
};
