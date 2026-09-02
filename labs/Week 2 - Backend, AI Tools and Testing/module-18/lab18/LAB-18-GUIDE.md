# Lab 18: Mockito and Mocking with AI Assistance — Northstar CRM Isolation Tests

> **Participants:** Module sequence is in [`../README.md`](../README.md). **Do not start this guide until** you have finished Module 18 [pre-lab exercises 1–6](../exercises/EXERCISES-INDEX.md) (Pass — check yourself, do not write it down; order **1 → 2 → 3 → 4 → 5 → 6**). Then open **one** OS how-to ([Windows](LAB-18-WINDOWS.md) · [macOS](LAB-18-MACOS.md)). In class, prefer the **45-minute timed path** with [`starter/`](starter/README.md); the **full path** is every Step below (homework / extended). This repo has no answer keys — complete the TODOs yourself. See [Which file do I open?](../../../_PARTICIPANT-FILE-GUIDE.md).

## Activity card

| | |
| --- | --- |
| **Objective** | Ship Mockito + BDDMockito isolation suites with stub/verify/never/ArgumentCaptor |
| **Skills practiced** | @Mock repo, real validator, verify/never, ArgumentCaptor, BDDMockito syntax |
| **Expected outcome** | `mvn test` → **Tests run: 6** · not-found never saves · isolation-policy.md |
| **Estimated time** | Timed path ~45 min · Full path 3–4 hours |
| **Prerequisites** | Lab 0 · Lab 17 preferred · Exercises 1–6 Pass · JDK 21 · Maven 3.9+ |
| **Expected files** | `examples/lab18-crm/` — mock suites, POM Mockito deps, isolation-policy |
| **Validation checkpoints** | Starter smoke `mvn -B clean test` (run twice) · GUIDE Implementation Checkpoints |

**Module:** 18 — Mockito for Test Isolation  
**Duration:** ~45 minutes (timed path with starter) · Full path: 3–4 Hours

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-18-WINDOWS.md](LAB-18-WINDOWS.md) |
| macOS | [LAB-18-MACOS.md](LAB-18-MACOS.md) |

> **Incremental build:** Real-validator policy → stub/verify → captor → activate sequence → anti-patterns → Lab 18.

> **Classroom pacing:** [`../PACING.md`](../PACING.md) (Checkpoints A–E).

> **Critical scope:** Mock **repository** (+ notifier); keep **validator** real. Never mock the SUT. `never().save` on not-found. Selenium is **Lab 19**. Review AI drafts.

## 45-minute timed path (use starter)

In class, use the starter templates so the **core** objectives fit **~45 minutes**. The full Steps below remain for homework / extended depth.

1. Open [`starter/README.md`](starter/README.md).
2. Copy `starter/` into your `java-bootcamp/examples/lab18-crm/` target (see starter README).
3. Fill every `// TODO` — do **not** wait on a perfect prior lab; the starter includes a baseline.
4. Run the starter smoke test. Commit your work to your GitHub repo (no screenshots).
5. Check timed-path Pass criteria in the starter README yourself (do not write the marks down). Continue remaining GUIDE steps as homework if needed.

| Path | Time | Scope |
| ---- | ---- | ----- |
| **Timed (default)** | ~45 min | Starter TODOs + smoke test |
| **Full (extended)** | see Duration | Every Step in this GUIDE |


## What you'll complete (practice only)

Labs and exercises are **practice only**. Nothing is submitted or graded. Do not take screenshots. Check Pass/Fail yourself — do not write those marks anywhere. Commit your work to your private `java-bootcamp` GitHub repo.

Keep this checklist visible while you work.

| # | Deliverable |
| - | ----------- |
| 1 | `CustomerServiceMockitoTest` with stubbing, verify, and ArgumentCaptor |
| 2 | `CustomerServiceBddMockTest` (BDDMockito style) |
| 3 | Evidence that not-found never calls `save` |
| 4 | Optional Copilot review notes (`lab18-001`) or manual equivalent |
| 5 | Full `mvn test` success log (two consecutive runs preferred) |
| 6 | Isolation policy in project README / `docs/isolation-policy.md` |
| 7 | No secrets or generated build directories committed |

**Commit to your GitHub repo:** the items in the table above (sources + evidence + short notes).

**Do not commit:** `target/`, `node_modules/`, secrets, heap dumps, or a copied answer keys.

## Lab Overview

This Module 18 lab isolates **Customer Management Platform** service unit tests with **Mockito**: mock `CustomerRepository` (and optionally collaborator services), **verify interactions**, and use **ArgumentCaptor** / **BDDMockito** style stubs. You keep JUnit 5 from Lab 17 and stop relying on the real in-memory map for service-layer unit tests.

## Learning Objectives

After completing this lab, you will be able to:

* Add Mockito (and `mockito-junit-jupiter`) as test-scoped dependencies
* Create `@Mock` collaborators and wire `DefaultCustomerService` via `@InjectMocks` or, preferably, manual constructor injection sharing one mock repo with `CustomerValidator`
* Stub repository responses with `when(...).thenReturn(...)` or BDD `given(...).willReturn(...)`
* `verify` save/find interactions and argument values for `CUS-1001` / `CUS-1002`
* Use `ArgumentCaptor` to inspect the `Customer` passed to `save`

## Business Scenario

Lab 17 tests use a real `InMemoryCustomerRepository`. Fine for early confidence; insufficient for true unit isolation. Your lead freezes:

**Service-layer unit tests must mock `CustomerRepository`. Verifications prove interaction contracts. Failures in repository wiring must not require a database or HashMap.**

| ID | Name | Notes |
| -- | ---- | ----- |
| `CUS-1001` | Amina Khan | `ACTIVE` — addCustomer captors; illegal transition target |
| `CUS-1002` | Ravi Singh | `PROSPECT` → `ACTIVE` with stubbed find/save |
| `CUS-9999` | — | not-found; `never().save` |
| `lab-request-001` | — | correlation on changeStatus |
| `lab18-001`, … | — | Copilot review entries if used |

**Policy choice to document.** Validator may stay **real** (rules are the subject) or be **mocked** for pure interaction tests. Prefer real validator + shared mock repo so uniqueness rules that call `existsById` / `existsByEmail` still exercise production validation.

## Architecture Context
### NOW (this lab)

```mermaid
flowchart TB
  T1["CustomerServiceMockitoTest"] --> Svc["DefaultCustomerService"]
  T2["CustomerServiceBddMockTest"] --> Svc
  Svc -->|prefer real| Val["CustomerValidator"]
  Svc -->|@Mock| Repo["CustomerRepository<br/>stub find/save/exists"]
  Verify["verify / ArgumentCaptor / never"] -.-> Repo
```

## Prerequisites

Prior labs: [15](../../module-15/lab15/LAB-15-GUIDE.md) · [17](../../module-17/lab17/LAB-17-GUIDE.md).

Confirm (Lab 0 tools assumed):

* JDK 21; Maven; Git
* Lab 17 suite on `lab17-crm/` → copy to `lab18-crm/`
* JUnit 5 + Mockito via Maven; GitHub Copilot optional
* No secrets committed to Git

### Pre-flight

```bash
java -version
mvn -version
```

## Worked example (read before you code)

Study this pattern once before Step 1. Your job is to apply the same idea in the Steps — do not skip ahead to a full solution.

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceBddMockTest {

    @Mock CustomerRepository repository;
    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        service = new DefaultCustomerService(repository, new CustomerValidator(repository));
    }

    @Test
    void givenProspectWhenActivateThenSavedActive() {
        // starter method name — complete TODOs; see Steps for activateRaviUsesFindAndSave / notFoundNeverCallsSave
// ... truncated — see full sample in the Steps
```

**What to notice:** Match starter method names (`activateRaviUsesFindAndSave`, `notFoundNeverCallsSave`, `addCustomerCapturesSavedEntity`, `givenProspectWhenActivateThenSavedActive`).

---

## Implementation Steps

Complete each step in order. Commands assume `~/java-bootcamp/examples/lab18-crm` (Windows: `%USERPROFILE%\java-bootcamp\examples\lab18-crm`) unless noted.

---

### Step 1 — Branch Lab 17 and add Mockito dependencies

**Why:** Isolation tooling must be a reproducible test-scoped classpath, not a local JAR on one laptop.

**Do this:**

```bash
cd ~/java-bootcamp/examples
cp -r lab17-crm lab18-crm
cd lab18-crm
mkdir -p copilot-notes docs
```

Add to `pom.xml` (test scope):

```xml
<dependency>
  <groupId>org.mockito</groupId>
  <artifactId>mockito-core</artifactId>
  <version>5.14.2</version>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>org.mockito</groupId>
  <artifactId>mockito-junit-jupiter</artifactId>
  <version>5.14.2</version>
  <scope>test</scope>
</dependency>
```

If Spring Boot parent manages versions, omit explicit version numbers and use BOM-managed Mockito.

```bash
mvn -q -DincludeArtifactIds=mockito-core,mockito-junit-jupiter dependency:tree
```

**Expected result:** `mockito-core` and `mockito-junit-jupiter` on test classpath; existing Lab 17 tests still discoverable.

**If it fails:** Wrong scope (`compile`) → set `test`. Version skew between core and junit-jupiter → align both to the same Mockito 5.x line. Boot BOM conflict → remove hard-coded versions.

---

### Step 2 — Complete starter `CustomerServiceMockitoTest` skeleton

**Why:** Extension wiring and shared mock-repo construction must be correct before stubbing business paths—otherwise failures look like domain bugs.

**Do this:** Open the starter `CustomerServiceMockitoTest.java` and finish the `@BeforeEach` wiring (do not recreate from scratch):

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceMockitoTest {

    @Mock CustomerRepository repository;

    private CustomerValidator validator;
    private DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        // Validator and service MUST share the same mock repository
        validator = new CustomerValidator(repository);
        service = new DefaultCustomerService(repository, validator);
    }

    @Test
    void placeholderCompiles() {
        assertNotNull(repository);
        assertNotNull(service);
    }
}
```

Prefer **manual construction** over `@InjectMocks` alone when the validator also needs the repository for uniqueness rules.

**Expected result:** Class compiles with `MockitoExtension`; `@Mock repository` is non-null; `@BeforeEach` builds a fresh service each test.

**If it fails:** Missing `@ExtendWith(MockitoExtension.class)` → NPE on mocks. Two different mock instances for validator vs service → uniqueness stubs never hit. Adapt package/entity names to your Lab 10–17 model.

---

### Step 3 — Stub find/save and activate `CUS-1002`

**Why:** Happy-path interaction proof is the core of the lab—status change must call find then save with ACTIVE.

**Do this:** Add:

```java
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import java.util.Optional;

@Test
void activateRaviUsesFindAndSave() {
    Customer ravi = new Customer(
        "CUS-1002", "Ravi Singh", "ravi.singh@example.com", CustomerStatus.PROSPECT);

    when(repository.findById("CUS-1002")).thenReturn(Optional.of(ravi));
    when(repository.save(any(Customer.class))).thenAnswer(inv -> inv.getArgument(0));

    Customer result = service.changeStatus(
        "CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");

    assertEquals(CustomerStatus.ACTIVE, result.getStatus());
    verify(repository).findById("CUS-1002");
    verify(repository).save(argThat(c ->
        "CUS-1002".equals(c.getCustomerId()) && c.getStatus() == CustomerStatus.ACTIVE));
}
```

```bash
mvn -q test -Dtest=CustomerServiceMockitoTest#activateRaviUsesFindAndSave
```

**Expected result:** One test green; status ACTIVE; find and save verified; no real `Map` involved.

**If it fails:** `Wanted but not invoked: save` → service short-circuits (validator rejects) or find stub wrong ID. `UnnecessaryStubbingException` → remove unused `when`. `thenReturn(null)` on save → use `thenAnswer` when the service returns the saved entity.

---

### Step 4 — Verify not-found does not call save

**Why:** Isolation quality shows up on negatives—`never().save` is stronger evidence than “an exception happened.”

**Do this:**

```java
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.Optional;

@Test
void notFoundNeverCallsSave() {
    when(repository.findById("CUS-9999")).thenReturn(Optional.empty());

    assertThrows(Exception.class, () ->
        service.changeStatus("CUS-9999", CustomerStatus.ACTIVE, "lab-request-001"));

    verify(repository).findById("CUS-9999");
    verify(repository, never()).save(any());
}
```

Prefer `assertThrows(BusinessException.class, ...)` if Lab 16 types exist, and assert correlation appears in the message/code when your design includes it.

**Expected result:** Exception thrown; `save` never interacted.

**If it fails:** Wrong exception type after Lab 16 → tighten expect. `save` still called → production bug: fix service then retest. Broad `any()` vs typed matchers → keep `never().save(any())` consistent with other verifies.

---

### Step 5 — `ArgumentCaptor` for `addCustomer`

**Why:** Captors beat single-field `argThat` when you need multi-field asserts on the entity that crossed the repository boundary.

**Do this:**

```java
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

@Test
void addCustomerCapturesSavedEntity() {
    when(repository.existsById("CUS-1001")).thenReturn(false);
    when(repository.existsByEmail("amina.khan@example.com")).thenReturn(false);
    when(repository.save(any(Customer.class))).thenAnswer(inv -> inv.getArgument(0));

    service.addCustomer(new Customer(
        "CUS-1001", "Amina Khan", "amina.khan@example.com", CustomerStatus.ACTIVE));

    ArgumentCaptor<Customer> captor = ArgumentCaptor.forClass(Customer.class);
    verify(repository).save(captor.capture());
    assertEquals("CUS-1001", captor.getValue().getCustomerId());
    assertEquals("Amina Khan", captor.getValue().getFullName());
    assertEquals(CustomerStatus.ACTIVE, captor.getValue().getStatus());
}
```

Align `existsBy*` method names with your Lab 15–16 validator.

**Expected result:** Captor shows Amina / ACTIVE / `CUS-1001`; no real map.

**If it fails:** Unstubbed `existsByEmail` → Mockito returns `false` for boolean by default (often OK) but may diverge if your code uses `Boolean` wrappers. Wrong getter names → match your entity. Stub only what the path calls to avoid unnecessary stubbing.

---

### Step 6 — BDDMockito style test

**Why:** Teams often write specs in given/when/then language; students must see this as style over the same Mockito engine.

**Do this:** Complete starter `CustomerServiceBddMockTest.java` (method name `givenProspectWhenActivateThenSavedActive`):

```java
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import org.junit.jupiter.api.Test;
import java.util.Optional;

@Test
void givenProspectWhenActivateThenSavedActive() {
    Customer ravi = new Customer(
        "CUS-1002", "Ravi Singh", "ravi.singh@example.com", CustomerStatus.PROSPECT);
    given(repository.findById("CUS-1002")).willReturn(Optional.of(ravi));
    given(repository.save(any(Customer.class))).willAnswer(inv -> inv.getArgument(0));

    Customer updated = service.changeStatus(
        "CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");

    then(repository).should().findById("CUS-1002");
    then(repository).should().save(any(Customer.class));
    assertEquals(CustomerStatus.ACTIVE, updated.getStatus());
}
```

```bash
mvn -q test -Dtest=CustomerServiceBddMockTest
```

**Expected result:** BDD style test green; you can explain `given`/`willReturn` vs `when`/`thenReturn` as style, not magic.

**If it fails:** Mixed static imports from `Mockito` and `BDDMockito` colliding → prefer one style per class. Same wiring pitfalls as Step 2.

---

### Step 7 — Optional Copilot mock draft + review

**Why:** AI speed without review recreates Lab 11 false-confidence at isolation stakes—mocking the class under test is a common AI failure.

**Do this:** If Copilot is available, prompt:

```text
Generate a Mockito test that mocks CustomerRepository for DefaultCustomerService
duplicate-email path. Verify existsByEmail and that save is never called.
Fixtures: CUS-1001 Amina Khan. No Spring annotations.
```

Review checklist:

1. Did it mock the **class under test**? Reject if yes.
2. Are stubs minimal (no unused `when`)?
3. Does verification match the real validator call order?
4. Any `Thread.sleep` or real DB?
5. Run `mvn -q test` after accepting?

Record `lab18-001` in `copilot-notes/ai-mockito-review.md`. If Copilot unavailable, write the duplicate-email mock test by hand and mark “manual.”

**Expected result:** Dated review entry; at least one Copilot risk called out **or** N/A with rationale; suite still green.

**If it fails:** Accepted `@Mock DefaultCustomerService` → reject and rewrite. Accepted sleeps → reject. Unused stubs left behind → `UnnecessaryStubbingException` under strictness—trim stubs.

---

### Step 8 — Full suite, failure experiments, isolation policy

**Why:** Peers and CI need one documented policy: which suites are unit-isolated vs real-repo, and how to choose stub vs verify.

**Do this:**

```bash
mvn -q clean test
mvn -q test -Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest
```

Document in README / `docs/isolation-policy.md`:

* Which tests use real in-memory repo (Lab 17 style) vs mocks (Lab 18 unit)
* How to choose stub (`when`/`given`) vs verify (`verify`/`then().should`)
* Correlation ID expectations on exception paths
* Why both styles can coexist

Complete Failure Experiments. Commit your work to your GitHub repo. Do not take screenshots. Run `mvn -q test` twice for determinism.

**Expected result:** Timed Lab 18 suite green twice — **Tests run: 6** (baseline `CustomerServiceTests` 2 + Mockito 3 + BDD 1); README states isolation policy; evidence saved; `git status` clean of `target/`.

**If it fails:** Baseline broken by POM change → diff Mockito deps only. Flaky verifies → fresh `@BeforeEach` mocks, never share static mocks. See Troubleshooting.

---

## Implementation Checkpoints

### Checkpoint A — Tooling

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `lab18-crm` under `~/java-bootcamp/examples/` | Pass / Fail |
| 2 | Mockito core + junit-jupiter test-scoped; tree confirms both | Pass / Fail |
| 3 | `@ExtendWith(MockitoExtension.class)` on mock suites | Pass / Fail |
| 4 | Lab 17 JaCoCo/Surefire still present (unless intentionally deferred and noted) | Pass / Fail |

### Checkpoint B — Core Mockito suite

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Shared mock repo wires validator + `DefaultCustomerService` | Pass / Fail |
| 2 | Activate Ravi: stub find/save + verify | Pass / Fail |
| 3 | `CUS-9999` not-found: `never().save` | Pass / Fail |
| 4 | `ArgumentCaptor` on add Amina (`CUS-1001`) | Pass / Fail |

### Checkpoint C — BDD + AI discipline

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `CustomerServiceBddMockTest` green with given/then/should | Pass / Fail |
| 2 | Copilot review log or manual equivalent (`lab18-001`) | Pass / Fail |
| 3 | No mocking of the class under test | Pass / Fail |

### Checkpoint D — Hygiene

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Two consecutive `mvn test` identical success | Pass / Fail |
| 2 | Isolation policy documented | Pass / Fail |
| 3 | No secrets / `target/` / debug mockingDetails left committed | Pass / Fail |

---

## Reference Commands, Configuration, and Code

### Stub + verify

```java
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import java.util.Optional;

when(repository.findById("CUS-1002")).thenReturn(Optional.of(ravi));
verify(repository, never()).save(any());
```

### Commands

```bash
cd ~/java-bootcamp/examples/lab18-crm
mvn -q clean test
mvn -q test -Dtest=CustomerServiceMockitoTest
mvn -q test -Dtest=CustomerServiceBddMockTest
mvn -q test -Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest
git status
```

## Failure Experiments

| # | Experiment | Observe | Restore |
| - | ---------- | ------- | ------- |
| 1 | Stub `findById` to throw `RuntimeException` | Service/handler error path; test intentionally red/green | Restore Optional stub |
| 2 | Stub ACTIVE Amina; change to PROSPECT | Exception; `never().save` | Keep as permanent negative test |
| 3 | `verify(times(1)).save` then call service twice without reset | Verification failure | Fresh mocks via `@BeforeEach` |
| 4 | Add unused `when(...).thenReturn(...)` | `UnnecessaryStubbingException` | Remove stub or justify `lenient()` in notes |
| 5 | Reject/temporary accept a Copilot `Thread.sleep` | Documents why sleeps banned | Remove sleep |

---

## Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| NPE on `@Mock` fields | Missing `MockitoExtension` | Add `@ExtendWith(MockitoExtension.class)` |
| `UnnecessaryStubbingException` | Stub never called | Trim stubs; avoid blanket `lenient()` |
| `Wanted but not invoked: save` | Wrong stub / validator blocked path | Align IDs; stub exists*; read service code |
| WrongInteraction / too many invokes | Validator also hits repo | Explicit `times(n)` / verify exists calls |
| Flaky verifies | Shared static mocks | Recreate in `@BeforeEach` |
| Lab 17 suite broken | Accidental production change | Diff only test POM + mock tests |
| Copilot mocks service | Underspecified prompt | Reject; restate collaborator-only mocks |
| Captor status still PROSPECT | Activate did not mutate / wrong stub | Stub PROSPECT Ravi; assert after activate |

## Security and Production Review

Optional — jot brief notes in your README if useful for your progress check (not a separate essay):

1. Which inputs are untrusted (production API inputs; tests use fixtures/stubs only)?
2. Where are authn/authz/validation enforced (still service/validator; mocks don’t replace auth)?
3. Which values are sensitive—never in test code beyond sample emails?

---


## Cleanup

```bash
cd ~/java-bootcamp/examples/lab18-crm
mvn -q clean
git status
```

Do not commit `target/`. Keep review notes and isolation policy.

**Keep `lab18-crm`**—Lab 19 builds integration/UI regression on CRM create/get seams you just isolated.


## Reflection Questions

Write **1–3 sentence** answers (not essays):

1. Which design decision most affected correctness (shared mock repo vs `@InjectMocks` alone)?
2. What evidence proves the implementation works (captor values, `never().save`)?
3. Which failure was hardest to diagnose (`UnnecessaryStubbing`, wrong verify count, …)?

---


