import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable, of } from 'rxjs';
import { environment } from '../../../environments/environment';
import { CreateInteractionRequest, Interaction } from './interaction.model';

@Injectable({ providedIn: 'root' })
export class InteractionApiService {
  private readonly http = inject(HttpClient);
  private readonly base = `${environment.apiBaseUrl}/api/v1/interactions`;

  list(customerId: string): Observable<Interaction[]> {
    // TODO: GET this.base with query param customerId via HttpClient
    void this.http;
    void HttpParams;
    void customerId;
    return of([]);
  }

  create(body: CreateInteractionRequest): Observable<Interaction> {
    // TODO: POST this.base with JSON body
    throw new Error('TODO: implement InteractionApiService.create');
  }
}
