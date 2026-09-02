export interface Interaction {
  id: string;
  customerId: string;
  interactionType: string;
  summary: string;
  correlationId: string;
  createdAt: string;
}

export interface CreateInteractionRequest {
  customerId: string;
  interactionType: string;
  summary: string;
  correlationId?: string;
}
