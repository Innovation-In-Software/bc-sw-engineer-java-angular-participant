import { provideHttpClient, withInterceptors } from '@angular/common/http';
import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';
import { routes } from './app.routes';
import { authInterceptor } from './core/auth/auth.interceptor';
import { unauthorizedInterceptor } from './core/auth/unauthorized.interceptor';
import { correlationInterceptor } from './core/correlation.interceptor';

export const appConfig: ApplicationConfig = {
  providers: [
    provideZoneChangeDetection({ eventCoalescing: true }),
    provideRouter(routes),
    provideHttpClient(
      withInterceptors([correlationInterceptor, authInterceptor, unauthorizedInterceptor]),
    ),
  ],
};
