# Lab 36 — Integration notes

Fill after HttpClient + auth work.

## Path

Browser (`lab36-crm-ui` at `:4200`) → Angular HttpClient + Bearer interceptor → Spring Boot REST (`:8080`) → PostgreSQL (or this lab’s in-memory mock).

## Auth

Where is `Authorization: Bearer lab-demo-token` attached? Where does Boot reject missing Bearer?

## Token storage

Confirm the token is memory-only (not localStorage).
