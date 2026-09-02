# Module 16 — HTTP Status & Error Codes

**Topic:** Exception Handling in Distributed APIs  
**Use when:** mapping failures in pre-lab exercises or Lab 16; keep client-facing status and `errorCode` consistent.

_Transcribed from curriculum slide diagrams under `curriculum/.../module-16/slide_diagrams/` (especially **175 — HTTP Status Codes**, plus **171**, **174**, **176–178**, **180–181**). Full curriculum README: [`SLIDE-TEXT-README.md`](../../../../curriculum/Week 2 - Backend, AI Tools and Testing/module-16/SLIDE-TEXT-README.md)._

---

## HTTP status code classes (slide 175)

| Class | Range | Description |
| --- | --- | --- |
| **1xx Informational** | 100–199 | Request received; process continuing |
| **2xx Success** | 200–299 | Request successfully received, understood, and accepted |
| **3xx Redirection** | 300–399 | Further action needed by the client |
| **4xx Client Error** | 400–499 | Bad syntax or request cannot be fulfilled |
| **5xx Server Error** | 500–599 | Server failed to fulfill a valid request |

---

## All common HTTP codes (slide 175)

| Code | Name | Class | Meaning / when to use |
| --- | --- | --- | --- |
| **100** | Continue | 1xx | Request received; client should continue |
| **101** | Switching Protocols | 1xx | Switching to a different protocol |
| **102** | Processing | 1xx | Processing request; no response yet |
| **200** | OK | 2xx | Request successful |
| **201** | Created | 2xx | Resource created successfully |
| **204** | No Content | 2xx | Request successful; no content to return |
| **206** | Partial Content | 2xx | Partial content returned |
| **301** | Moved Permanently | 3xx | Resource permanently moved |
| **302** | Found | 3xx | Resource temporarily moved |
| **304** | Not Modified | 3xx | Resource not modified; use cached version |
| **307** | Temporary Redirect | 3xx | Temporary redirect; repeat request with new URL |
| **308** | Permanent Redirect | 3xx | Permanent redirect; repeat request with new URL |
| **400** | Bad Request | 4xx | Invalid request syntax |
| **401** | Unauthorized | 4xx | Authentication required or failed |
| **403** | Forbidden | 4xx | Client does not have permission |
| **404** | Not Found | 4xx | Requested resource not found |
| **409** | Conflict | 4xx | Request conflicts with current state |
| **422** | Unprocessable Entity | 4xx | Request well-formed but cannot be processed |
| **500** | Internal Server Error | 5xx | Unexpected server error |
| **501** | Not Implemented | 5xx | Server does not support the functionality |
| **502** | Bad Gateway | 5xx | Invalid response from upstream server |
| **503** | Service Unavailable | 5xx | Server is currently unavailable |
| **504** | Gateway Timeout | 5xx | Gateway did not receive a timely response |

---

## Codes highlighted in error-classification diagrams (slide 171)

| Category | Codes called out on the diagram |
| --- | --- |
| Client errors | 400, 401, 403, 404, 409, 422 |
| AuthN / AuthZ | 401 (auth failed, token expired), 403 (authorization failed, insufficient scope) |
| Server errors | 500, 502, 503, 504 |

---

## Application `errorCode` examples from diagram envelopes

| errorCode | Typical HTTP status | Source slide | Meaning in the diagram |
| --- | ---: | --- | --- |
| `VALIDATION_ERROR` | 400 / 422 | 174, 177, 180 | Request/field validation failed |
| `INVALID_INPUT` | 400 | 174 (RFC 7807) | Invalid input (Problem Details extension) |
| `ORDER_STOCK_INSUFFICIENT` | 400 | 176 | Business rule: insufficient stock |
| `AUTHENTICATION_FAILED` | 401 | 178 | Authentication failed (generic client message) |
| `VAL_1001` | 400 | 181 | Catalog-style validation code |
| `USR_1001` | — (envelope `code`) | 174 | Application-specific “user not found” |

---

## Lab 16 CRM standard

Use these in Lab 16 demos/tests (see `lab16/LAB-16-GUIDE.md`):

| Case | status | error code |
| ---- | -----: | ---------- |
| Bean Validation | 400 | `VALIDATION_FAILED` |
| Not found | 404 | `CUSTOMER_NOT_FOUND` |
| Illegal transition / duplicate policy | 409 | `BUSINESS_CONFLICT` |
| Unexpected | 500 | `INTERNAL_ERROR` |

---

**Related:** [Module 16 start](README.md) · [Acronym cheatsheet](ACRONYM-CHEATSHEET.md) · [Exercise 3 — failure to status map](exercises/exercise-03-failure-status-map.md)
