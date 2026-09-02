import { HttpInterceptorFn } from '@angular/common/http';

export const correlationInterceptor: HttpInterceptorFn = (req, next) =>
  next(
    req.clone({
      setHeaders: { 'X-Correlation-Id': 'lab-request-001' },
    }),
  );
