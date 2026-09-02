# Lab 25: Service and Repository Layers with AI Assistance — Northstar CRM Layering

> **Participants:** Module sequence is in [`../README.md`](../README.md). **Do not start this guide until** you have finished Module 25 [pre-lab exercises 1–6](../exercises/EXERCISES-INDEX.md) (Pass — check yourself, do not write it down; order **1 → 2 → 3 → 4 → 5 → 6**). Then open **one** OS how-to ([Windows](LAB-25-WINDOWS.md) · [macOS](LAB-25-MACOS.md)). In class, prefer the **45-minute timed path** with [`starter/`](starter/README.md); the **full path** is every Step below (homework / extended). This repo has no answer keys — complete the TODOs yourself. See [Which file do I open?](../../../_PARTICIPANT-FILE-GUIDE.md).

## Activity card

| | |
| --- | --- |
| **Objective** | Formalize Controller → Service → Repository with seeded CRM fixtures and service tests |
| **Skills practiced** | Layer seams, in-memory repository, service rules, AI review notes |
| **Expected outcome** | Thin controller · service-owned rules · seeded GET · CustomerServiceTest · lab25-001 notes |
| **Estimated time** | Timed path ~45 min · Full path 4–5 hours |
| **Prerequisites** | Lab 0 · Labs 23–24 preferred · Exercises 1–6 Pass · JDK 21 · Maven 3.9+ |
| **Expected files** | `examples/lab25-crm/` — layers, tests, docs/lab25-001.md |
| **Validation checkpoints** | Starter smoke · GUIDE Implementation Checkpoints |

**Module:** 25 — Service and Repository Layers with AI Assistance  
**Duration:** ~45 minutes (timed path with starter) · Full path: 4–5 Hours

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-25-WINDOWS.md](LAB-25-WINDOWS.md) |
| macOS | [LAB-25-MACOS.md](LAB-25-MACOS.md) |

> **Incremental build:** Boundaries → packages → service TODOs → AI policy → test plan → Lab 25.

> **Classroom pacing:** [`../PACING.md`](../PACING.md) (Checkpoints A–D).

> **Critical scope:** **No** controller→repository imports. **No** HTTP types in the service. In-memory repo only. AI drafts need **human review** (`lab25-001`). JPA / `@Transactional` / profiles → later.

## 45-minute timed path (use starter)

In class, use the starter templates so the **core** objectives fit **~45 minutes**. The full Steps below remain for homework / extended depth.

1. Open [`starter/README.md`](starter/README.md).
2. Copy `starter/` into your `java-bootcamp/examples/…` target (see starter README).
3. Fill every `// TODO` — do **not** wait on a perfect prior lab; the starter includes a baseline.
4. Run the starter smoke test. Commit your work to your GitHub repo (no screenshots).
5. Check timed-path Pass criteria in the starter README yourself (do not write the marks down). Continue remaining GUIDE steps as homework if needed.

| Path | Time | Scope |
| ---- | ---- | ----- |
| **Timed (default)** | ~45 min | Starter TODOs + smoke test |
| **Full (extended)** | see Duration | Every Step in this GUIDE |

---

## What you'll complete (practice only)

Labs and exercises are **practice only**. Nothing is submitted or graded. Do not take screenshots. Check Pass/Fail yourself — do not write those marks anywhere. Commit your work to your private `java-bootcamp` GitHub repo.

Keep this checklist visible while you work.

| # | Deliverable |
| - | ----------- |
| 1 | Layered Controller → Service → Repository source |
| 2 | Seeded in-memory repo with `CUS-1001` / `CUS-1002` |
| 3 | HTTP GET/POST evidence + duplicate/not-found via service tests |
| 4 | `CustomerServiceTest` output |
| 5 | AI review notes (`lab25-001`) or manual equivalent |
| 6 | Layering / JPA readiness notes |
| 7 | Dual green `mvn test` |
| 8 | No secrets or `target/` committed |

**Commit to your GitHub repo:** the items in the table above (sources + evidence + short notes).

**Do not commit:** `target/`, `node_modules/`, secrets, heap dumps, or a copied answer keys.

## Lab Overview

This Module 25 lab formalizes **Controller → Service → Repository** for Customer in the CRM Boot app. Controllers stay thin HTTP adapters; services own lifecycle and uniqueness rules; repositories own persistence access. An in-memory Spring Data–style repository is acceptable now; later labs swap persistence without rewriting the service contract. Optional Copilot drafts are welcome only with mandatory human review.

## Learning Objectives

After completing this lab, you will be able to:

* Separate Controller, Service, and Repository responsibilities for Customer create/get/list
* Implement a seeded in-memory `CustomerRepository` against the provided interface
* Keep HTTP mapping and JSON serialization out of the service layer
* Enforce duplicate/not-found rules in the service, not the controller
* Use Copilot (or similar) productively while reviewing suggestions into `docs/lab25-001.md`

## Business Scenario

Controllers talking to storage create tangled Boot apps that cannot grow transactions, security, or persistence swaps cleanly. Your lead freezes:

**Every Customer write/read path is Controller → Service → Repository. In-memory is fine for now. Controllers never import repositories. AI drafts require a dated review log.**

You own that gate for Amina (`CUS-1001` ACTIVE), Ravi (`CUS-1002` PROSPECT→ACTIVE), duplicates, and not-found.

Use these examples consistently:

| ID | Name | Notes |
| -- | ---- | ----- |
| `CUS-1001` | Amina Khan | `ACTIVE` — seeded / GET |
| `CUS-1002` | Ravi Singh | `PROSPECT` — activate path |
| `CUS-1003` | Maya Chen | optional create sample |
| `CUS-9999` | — | not-found |
| `lab-request-001` | — | `X-Correlation-Id` |
| `lab25-001`, … | — | Copilot / AI review entries |

**Security note for evidence.** Fictional emails only (`amina.khan@example.com`, etc.). Never commit real PII dumps or tokens.

---

## Architecture Context
### NOW (this lab)

```mermaid
flowchart TB
  UI["Angular / curl"] -->|HTTPS/JSON| Ctrl["CustomerController<br/>thin DTOs + HTTP"]
  Ctrl --> Svc["CustomerService<br/>rules / transitions"]
  Svc --> RepoI["CustomerRepository interface"]
  RepoI --> Mem["InMemoryCustomerRepository"]
  Seed["Seed CUS-1001 / CUS-1002"] -.-> Mem
```

## Prerequisites

Prior labs: [Lab 23](../../module-23/lab23/LAB-23-GUIDE.md).

Confirm (Lab 0 tools assumed):

* JDK 21; Maven; Spring Boot 3.x web
* Domain type `Customer` JavaBean (`id`/`name`/`email`/`status`)
* Copilot / Cursor optional
* No secrets committed to Git

### Pre-flight

```bash
java -version
mvn -version
```

## Worked example (read before you code)

Study this pattern once before Step 1. Your job is to apply the same idea in the Steps — do not skip ahead to a full solution.

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

@Test
void getSeededCus1001() {
  CustomerService service = new CustomerService(new InMemoryCustomerRepository());
  Customer amina = service.get("CUS-1001");
  assertEquals("CUS-1001", amina.getId());
  assertEquals("Amina Khan", amina.getName());
}

@Test
void duplicateCreateRejected() {
  CustomerService service = new CustomerService(new InMemoryCustomerRepository());
  assertThrows(IllegalStateException.class,
      () -> service.create(Customer.amina(), "lab-request-001"));
}
```

**What to notice:** Timed path = `get` / `create` / `list` only (no `updateStatus` / PATCH). Match `id`/`name` getters and duplicate → `IllegalStateException`.

---

## Implementation Steps

Complete each step in order. Commands assume `~/java-bootcamp/examples/lab25-crm` (Windows: `%USERPROFILE%\java-bootcamp\examples\lab25-crm`) unless noted.

---

### Step 1 — Branch prior Boot CRM and confirm domain types

**Why:** Layering refactors on a known Boot entry point and entity — not a greenfield rewrite.

**Do this:**

```bash
cd ~/java-bootcamp/examples
cp -r lab24-crm lab25-crm   # or lab23-crm if you skipped Lab 24
cd lab25-crm
mkdir -p docs
# Prefer course starter copy (recommended) — includes docs/lab25-001.md
```

Ensure starter JavaBean `Customer` (`id`/`name`/`email`/`status` strings) compiles under `com.northstar.crm`. Timed path uses String status values, not a required enum.
```bash
mvn -q -DskipTests package
```

**Expected result:** `BUILD SUCCESS`; `CrmApplication` resolves.

**If it fails:** Missing web starter → restore Lab 23 POM. Package drift → keep `com.northstar.crm`.

---

### Step 2 — Confirm the provided `CustomerRepository` interface

**Why:** The interface is the seam Lab 27+ will swap; method names stay persistence-oriented, not HTTP-oriented.

**Already provided in starter:** `repository/CustomerRepository.java` with `save` / `findById` / `findAll` / `existsById`. **Do not reinvent** — open it, confirm signatures, then implement the in-memory class in Step 3.

```java
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
  Customer save(Customer customer);
  Optional<Customer> findById(String id);
  List<Customer> findAll();
  boolean existsById(String id);
}
```

Optional Copilot prompt: “Spring Data style CustomerRepository for CRM id String PK, no JPA annotations yet.” Review every line; record accepts/rejects in `docs/lab25-001.md`.

**Expected result:** Interface compiles; no `HttpServletRequest` / Web types.

**If it fails:** AI adds JPA annotations prematurely → reject or park for later. Vague method names like `get` → prefer `findById`.

---

### Step 3 — Implement seeded `InMemoryCustomerRepository`

**Why:** Fixed seeds make peer review and tests deterministic without PostgreSQL.

**Do this:** `@Repository` class implementing the interface with `ConcurrentHashMap`. Seed on construction or `@PostConstruct`:

```java
import org.springframework.stereotype.Repository;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
  private final Map<String, Customer> store = new ConcurrentHashMap<>();

  public InMemoryCustomerRepository() {
    store.put("CUS-1001", Customer.amina());
    store.put("CUS-1002", Customer.ravi());
  }

  @Override
  public Customer save(Customer customer) {
    store.put(customer.getId(), customer);
    return customer;
  }

  @Override
  public Optional<Customer> findById(String id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public List<Customer> findAll() {
    return List.copyOf(store.values());
  }

  @Override
  public boolean existsById(String id) {
    return store.containsKey(id);
  }
}
```

**Expected result:** Context starts; `findById("CUS-1001")` returns Amina ACTIVE.

**If it fails:** Bean not created → missing `@Repository` or scan package. Seeds missing → check constructor/`@PostConstruct`. Overwriting seeds in tests → fresh repo per test later.

---

### Step 4 — Implement `CustomerService` with business rules
**Why:** Duplicate checks, not-found, and illegal transitions belong in one place every REST adapter and test can call.

**Do this:** Constructor-inject `CustomerRepository`. Timed path: implement `get`, `create` (reject duplicate via `existsById`), `list`. **No** Spring Web imports. (`updateStatus` / PATCH = full-path homework.)

```java
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public Customer create(Customer customer, String correlationId) {
    if (customerRepository.existsById(customer.getId())) {
      throw new IllegalStateException("Duplicate customer");
    }
    return customerRepository.save(customer);
  }

  public Customer get(String id) {
    return customerRepository
        .findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Customer not found: " + id));
  }

  public List<Customer> list() {
    return customerRepository.findAll();
  }
}
```

Reject AI suggestions that return `ResponseEntity` from the service. Record rejects in `docs/lab25-001.md`.

**Expected result:** `get("CUS-9999")` throws not-found; duplicate create throws `IllegalStateException`; service has zero Web imports.

**If it fails:** Controller still owns rules → move logic down. Service depends on concrete map → depend on interface only.

---

### Step 5 — Verify the provided thin `CustomerController`

**Why:** The layering gate is enforceable by import review and instructor probe.

**Already provided in starter:** `api/CustomerController.java` with `POST /api/customers` and `GET /api/customers/{id}` only — **no list endpoint**. Controllers call **only** `CustomerService` and read `X-Correlation-Id` (default `lab-request-001`). **Do not re-implement** — verify no repository imports, then call HTTP after Steps 3–4.

```bash
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1001
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1002
```

**Expected result:** JSON for Amina ACTIVE and Ravi PROSPECT; controller source has no `repository` imports.

**If it fails:** 404 on seeded data → bean not wired / wrong path. Controller injects repository → refactor immediately. Expecting `GET /api/customers` list → **not in starter/solution**; use service `list()` / unit test (Step 6–7).

---

### Step 6 — Create + duplicate rejection (list via service)
**Why:** Write paths prove uniqueness rules live in the service even if the map could silently overwrite.

**Do this:**

1. POST create for `CUS-1003` Maya (HTTP).
2. **Timed list:** call `CustomerService.list()` / `findAll` from a unit test or debugger — **not** `GET /api/customers` (no list route in starter/solution).
3. Assert duplicate create of `CUS-1001` throws `IllegalStateException` (service unit test — Step 7).

```bash
curl -s -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -H "X-Correlation-Id: lab-request-001" \
  -d '{"id":"CUS-1003","name":"Maya Chen","email":"maya@example.com","status":"PROSPECT"}'
```

**Optional full path:** add `GET /api/customers` that delegates to `customerService.list()` if you want HTTP list evidence.

**Expected result:** 201 for Maya; service `list()` includes seeded + new; duplicate `CUS-1001` rejected by service rule (`IllegalStateException` — may surface as HTTP **500** without advice).

**If it fails:** Silent overwrite → add `existsById` check before save. Expecting HTTP list 200 on `/api/customers` → not provided; use service/unit test.

---

### Step 7 — Unit-test the service (no full MVC required)

**Why:** Layer honesty means service rules can green without `@SpringBootTest` for every assertion.

**Do this:** `CustomerServiceTest` constructing `CustomerService` with `InMemoryCustomerRepository`. Timed Surefire: `getSeededCus1001` + `duplicateCreateRejected` (**Tests run: 2**).

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

@Test
void getSeededCus1001() {
  CustomerService service = new CustomerService(new InMemoryCustomerRepository());
  Customer amina = service.get("CUS-1001");
  assertEquals("CUS-1001", amina.getId());
  assertEquals("Amina Khan", amina.getName());
}

@Test
void duplicateCreateRejected() {
  CustomerService service = new CustomerService(new InMemoryCustomerRepository());
  assertThrows(IllegalStateException.class,
      () -> service.create(Customer.amina(), "lab-request-001"));
}
```

```bash
mvn -q test -Dtest=CustomerServiceTest
```

**Expected result:** Focused tests green; asserts on status/IDs/exception types — not only `assertNotNull(service)`.

**If it fails:** Shared static store across tests → new repo per `@BeforeEach`. Flaky order → stop depending on other tests’ HTTP creates.

---

### Step 8 — AI review log + JPA readiness note
**Why:** This lab’s AI outcome is review discipline, not raw autocomplete volume.

**Do this:** Fill starter file **`docs/lab25-001.md` only** (do **not** create `copilot-notes/ai-layering-review.md`). Record files aided, accepted suggestions, **rejected** suggestions (with why). Document how `CustomerRepository` becomes `extends JpaRepository<Customer, String>` later without changing controller routes. If no AI used, mark “manual” with rationale.

**Expected result:** `docs/lab25-001.md` completed; at least one rejection **or** N/A with reason; notes mention JPA swap plan.

**If it fails:** Empty “used Copilot” claim without rejects → incomplete. Accepted service returning `ResponseEntity` → reverse that design.

---

### Step 9 — Failure experiments + evidence pack

**Why:** Layering failures must be distinguishable (not-found vs duplicate vs illegal transition).

**Do this:** Complete Failure Experiments. Commit your work to your GitHub repo. Do not take screenshots. Run `mvn -q test` twice. Confirm `git status` clean of `target/`.

**Expected result:** ≥3 experiments; dual green verify/test; layering diagram/notes present.

**If it fails:** See Troubleshooting.

---

## Implementation Checkpoints

### Checkpoint A — Tooling

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `lab25-crm` under `examples/` | Pass / Fail |
| 2 | Boot app packages successfully | Pass / Fail |
| 3 | Packages for controller/service/repository present | Pass / Fail |

### Checkpoint B — Layering core

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `CustomerRepository` + seeded `InMemoryCustomerRepository` | Pass / Fail |
| 2 | `CustomerService` owns rules; no Web imports | Pass / Fail |
| 3 | Controller has **zero** repository imports; GET Amina/Ravi works | Pass / Fail |

### Checkpoint C — Writes + tests + AI

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Create + service `list()` / unit evidence + duplicate rejection | Pass / Fail |
| 2 | `CustomerServiceTest` (`getSeededCus1001`, `duplicateCreateRejected`) green | Pass / Fail |
| 3 | AI review in `docs/lab25-001.md` or manual N/A | Pass / Fail |

### Checkpoint D — Hygiene

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Two consecutive `mvn test` identical success | Pass / Fail |
| 2 | README / layering notes complete | Pass / Fail |
| 3 | No secrets / `target/` committed | Pass / Fail |

---

## Reference Commands, Configuration, and Code

### `pom.xml` (excerpt)

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-test</artifactId>
  <scope>test</scope>
</dependency>
```

### Commands

```bash
cd ~/java-bootcamp/examples/lab25-crm
mvn spring-boot:run
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1001
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1002
curl -s -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -H "X-Correlation-Id: lab-request-001" \
  -d '{"id":"CUS-1003","name":"Maya Chen","email":"maya@example.com","status":"PROSPECT"}'
# No GET /api/customers list in starter/solution — list via service unit test / findAll
mvn -q test -Dtest=CustomerServiceTest
# Expected: Tests run: 2 (getSeededCus1001, duplicateCreateRejected)
mvn -q test
git status
```

## Failure Experiments

| # | Experiment | Observe | Restore |
| - | ---------- | ------- | ------- |
| 1 | Repo stub throws on `save` | Create fails explicitly | Restore real bean |
| 2 | Illegal status transition | Service rejects; status unchanged | Keep rule |
| 3 | Repeat GET `CUS-1001` | Idempotent 200 | Keep |
| 4 | Repeat POST create same id | Duplicate path | Keep rejection |
| 5 | Accept AI `ResponseEntity` in service then revert | Documents reject reason | Restore layering |

---

## Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| Seeded GET 404 | Bean not used / wrong id | Confirm `@Repository` + seeds |
| Controller talks to map | Missing service seam | Inject service only |
| Flaky tests | Shared singleton store | Fresh repo per `@BeforeEach` |
| Always 500 on duplicate | No exception mapping | Map to 4xx |
| Component scan miss | Wrong package | Stay under `com.northstar.crm` |
| AI invented JPA APIs | Underspecified prompt | Reject; restating interface-only |
| Working in `module-25-exercises` for the lab | Wrong project | Lab lives in `examples/lab25-crm` |
| ResponseEntity inside CustomerService | Layer leak / bad AI draft | Move HTTP mapping to controller |

## Security and Production Review

Optional — jot brief notes in your README if useful for your progress check (not a separate essay):

1. Which inputs are untrusted (JSON bodies, path IDs)?
2. Where are authn/authz/validation enforced (Lab 28 deepens auth)?
3. Which values are sensitive — never log emails/phones as PII dumps?

---


## Cleanup

```bash
cd ~/java-bootcamp/examples/lab25-crm
# Ctrl+C spring-boot:run
mvn -q clean
git status
```

**Keep `lab25-crm`**—Lab 26 adds profiles/config on this layering.


## Reflection Questions

Write **1–3 sentence** answers (not essays):

1. Which design decision most affected correctness (where rules live)?
2. What evidence proves layering works?
3. Which failure was hardest to diagnose?

---


