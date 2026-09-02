import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { environment } from '../../../environments/environment';
import { AuthSessionService } from './auth-session.service';

export const authInterceptor: HttpInterceptorFn = (req, next) => {
  const token = inject(AuthSessionService).accessToken();
  // TODO: if token is present and req.url starts with environment.apiBaseUrl,
  // clone the request with Authorization: Bearer <token>
  if (!token || !req.url.startsWith(environment.apiBaseUrl)) {
    return next(req);
  }
  return next(req);
};
