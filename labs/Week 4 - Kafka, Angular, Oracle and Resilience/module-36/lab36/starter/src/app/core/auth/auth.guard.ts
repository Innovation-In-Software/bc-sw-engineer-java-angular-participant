import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { AuthSessionService } from './auth-session.service';

export const authGuard: CanActivateFn = () => {
  const token = inject(AuthSessionService).accessToken();
  const router = inject(Router);
  // TODO: if no token, return router.parseUrl('/login')
  void token;
  void router;
  return true;
};
