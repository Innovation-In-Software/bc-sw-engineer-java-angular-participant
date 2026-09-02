import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { environment } from '../../../environments/environment';
import { AuthSessionService } from './auth-session.service';

export const authInterceptor: HttpInterceptorFn = (req, next) => {
  const token = inject(AuthSessionService).accessToken();
  // TODO: if token and req.url starts with environment.apiBaseUrl, clone Authorization: Bearer …
  void token;
  void environment;
  return next(req);
};
