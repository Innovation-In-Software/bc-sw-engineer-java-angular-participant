import { HttpInterceptorFn } from '@angular/common/http';

export const correlationInterceptor: HttpInterceptorFn = (req, next) => {
  // TODO: clone req and set header X-Correlation-Id: lab-request-001
  return next(req);
};
