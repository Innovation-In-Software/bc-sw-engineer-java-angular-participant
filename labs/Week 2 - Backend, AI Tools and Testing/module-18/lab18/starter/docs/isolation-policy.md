# Lab 18 — isolation policy

## What we mock

- `CustomerRepository` (I/O boundary)

## What we keep real

- `CustomerValidator` (domain rules)
- `DefaultCustomerService` (class under test — never mock it)

## TODO

Add one paragraph: when you prefer Lab 17 real-repo tests vs Lab 18 mocks.
