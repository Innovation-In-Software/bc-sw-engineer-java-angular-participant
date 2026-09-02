import { Injectable, signal } from '@angular/core';

/** Demo-only. Matches Boot `DemoBearerFilter`. Not a production secret. */
export const LAB_DEMO_TOKEN = 'lab-demo-token';

@Injectable({ providedIn: 'root' })
export class AuthSessionService {
  readonly accessToken = signal<string | null>(null);

  loginMock(): void {
    // TODO: this.accessToken.set(LAB_DEMO_TOKEN); do NOT use localStorage
  }

  logout(): void {
    this.accessToken.set(null);
  }
}
