export interface Customer {
  id: string;
  name: string;
  email: string;
  status: string;
}

export const SEED_CUSTOMERS: Customer[] = [
  {
    id: 'CUS-1001',
    name: 'Amina Khan',
    email: 'amina.khan@example.com',
    status: 'ACTIVE',
  },
  {
    id: 'CUS-1002',
    name: 'Ravi Singh',
    email: 'ravi.singh@example.com',
    status: 'PROSPECT',
  },
];
