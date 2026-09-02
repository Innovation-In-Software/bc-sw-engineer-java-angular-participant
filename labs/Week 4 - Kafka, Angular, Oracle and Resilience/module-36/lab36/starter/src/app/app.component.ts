import { Component, inject } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import { AuthSessionService } from './core/auth/auth-session.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  readonly session = inject(AuthSessionService);
  private readonly router = inject(Router);

  logout(): void {
    this.session.logout();
    void this.router.navigate(['/login']);
  }
}
