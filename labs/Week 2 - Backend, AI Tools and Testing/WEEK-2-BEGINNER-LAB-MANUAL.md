# Week 2 Beginner Lab Manual and Review

**Audience:** learners who completed Week 1 and are moving into backend project structure, Maven, AI-assisted coding, SOAP contracts, testing, logging, and observability.

**Review scope:** Lab 8 through Lab 21, the Module 8 and Module 9 pre-lab exercises, every Week 2 lab guide, every Week 2 starter README, and related starter docs/configuration/code assets.

## Lab Objective

Use this manual as the beginner-friendly path through Week 2. It keeps the existing lab guides as the detailed source of truth, but rewrites the learner flow into clear steps with commands, expected outputs, checkpoints, common mistakes, and troubleshooting.

## Prerequisites

- Week 1 labs are complete.
- JDK 21 is installed and available from the terminal.
- Maven 3.9+ is installed and available from the terminal.
- IntelliJ IDEA Community is the primary IDE; VS Code is optional.
- Git is configured and the learner has a personal `java-bootcamp` repository/workspace.
- Learners understand `.java` vs `.class`, packages, `javac`, `java`, and basic exception handling from Week 1.

## Standard Workflow for Every Week 2 Lab

1. Open the module lab guide from the course handout folder.
2. Copy the lab `starter/` folder into `java-bootcamp/examples/labN-crm`.
3. Open the copied project in IntelliJ or VS Code.
4. Read the starter README before changing files.
5. Complete one TODO at a time.
6. Save the file.
7. Run the lab smoke-test command.
8. Fix errors before moving to the next task.
9. Capture required screenshots or terminal output.
10. Complete the lab notes/checklist document.

## Standard Command Rules

- Run Maven commands from the folder that contains `pom.xml`.
- Run SOAP XML validation commands from the folder that contains `contracts/` and `samples/`.
- Run Actuator or Selenium checks only when the application/test server is running.
- A Maven command succeeds only when the output ends with `BUILD SUCCESS` or the requested test report is green.

## Module 8 Pre-Lab Exercises

### Lab Objective

These six exercises prepare learners for Lab 8 by introducing Maven layout, package naming, layer responsibilities, DTO/entity separation, dependency direction, and request flow.

### Step-by-Step Instructions

1. Open `module-08/exercises/EXERCISES-INDEX.md`.
2. Create `%USERPROFILE%\java-bootcamp\examples\module-08-exercises` on Windows or `~/java-bootcamp/examples/module-08-exercises` on macOS.
3. Complete exercises 1 through 6 in order.
4. Keep Exercise 4 code under `mini-src/` and compile it to `mini-out/`.
5. Do not add Spring Boot, JPA, PostgreSQL, Kafka, or React in these exercises.

### Exercise Overview

| Exercise | What learner completes | Verification |
| -------- | ---------------------- | ------------ |
| `exercise-01-maven-layout.md` | Exercise 1 — Read a Maven Project Layout: Create `maven-layout-notes.md` and explain where production code, tests, configuration, documentation, and generated files belong. | Every file is assigned to the correct Maven location, and you can distinguish source from generated output. |
| `exercise-02-package-plan.md` | Exercise 2 — Plan Package Organization: Create `package-plan.md` mapping CRM types to packages and fully qualified class names. | All seven types have focused packages, valid fully qualified names, and matching source paths. |
| `exercise-03-layer-responsibilities.md` | Exercise 3 — Assign Layer Responsibilities: Create `layer-responsibilities.md` and assign each CRM task to the layer that should own it. | Every responsibility has one primary home, and the repaired flow follows controller → service → repository. |
| `exercise-04-entity-vs-dto.md` | Exercise 4 — Separate Entity and DTO: Create a tiny plain-Java package tree proving that a domain entity and boundary DTOs can have different fields and responsibilities. | File, notes, or mini Java code match the exercise instructions. |
| `exercise-05-dependency-direction.md` | Exercise 5 — Check Dependency Direction: Identify acceptable and problematic package dependencies before they become circular architecture. | You identify inward flow, two clear violations, one context-sensitive dependency, and one cycle repair. |
| `exercise-06-request-flow.md` | Exercise 6 — Trace a Customer Request: Create `customer-request-flow.md` showing how a future request to create customer `CUS-1001` moves through layers—without implementing HTTP or persistence. | One document contains success/failure flows, object transformations, and a truthful now/later boundary. |

### Code or Configuration

Exercise 4 has Java code. The final code must compile with packages under `com.northstar.crm`. Replace every `_____` and `// TODO`; blanks are not valid Java.

### Commands

Run from `java-bootcamp/examples/module-08-exercises`:

```powershell
javac -d mini-out mini-src\com\northstar\crm\*.java
java -cp mini-out com.northstar.crm.StructureDemo
```

Expected output: the demo prints entity and DTO information without compile errors.

### Checkpoint

- Exercise 1 identifies Maven source, resource, test, and target folders.
- Exercise 2 package names follow `com.northstar.crm...`.
- Exercise 3 assigns controller/service/repository responsibilities correctly.
- Exercise 4 compiles and runs.
- Exercise 5 catches invalid dependency direction.
- Exercise 6 explains request flow before Lab 8.

### Common Mistakes and Troubleshooting

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Exercise 4 does not compile | A TODO or blank remains | Search for `TODO` and `_____`, then replace them |
| Package error | Folder path and package name do not match | Use `mini-src/com/northstar/crm/...` and `package com.northstar.crm...` |
| Later tech appears in answers | Learner jumped ahead | Remove Spring/JPA/Kafka/React; Module 8 is structure reasoning only |

## Lab 8: Project Structure and Organization — Northstar CRM Skeleton

### Lab Objective

In this lab, the learner completes a clean Maven-style Northstar CRM skeleton with layered packages and plain Java stubs.

### Learning Outcomes

- Explain the purpose of `src/main/java`, `src/main/resources`, and `src/test/java`.
- Identify controller, service, repository, entity, DTO, config, and exception package responsibilities.
- Compile the skeleton and run `com.northstar.crm.Main`.

### Prerequisites

- Complete Week 1 and the Module 8 pre-lab exercises.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-08/lab8/LAB-8-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-08/lab8/starter/README.md`.

### Scenario

Northstar is building a **Customer Management Platform**. Product wants engineers to create customers such as **Amina Khan**, look up prospects such as **Ravi Singh**, and later expose REST and partner SOAP APIs.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 8 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab8-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-08\lab8"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab8-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab8-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab8-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-08/lab8"
mkdir -p ~/java-bootcamp/examples/lab8-crm
cp -R starter/. ~/java-bootcamp/examples/lab8-crm/
cd ~/java-bootcamp/examples/lab8-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Compile the starter

```bash
mvn -q clean compile
```

**Explanation:** Maven compiles the Java sources into `target/classes`.

**Expected Output:** No errors; `target/classes` exists.

#### Run the banner

```powershell
java -cp target\classes com.northstar.crm.Main
```

**Explanation:** Runs the compiled `Main` class on Windows.

**Expected Output:** Output includes `Northstar CRM skeleton - Lab 8`, seven packages, and `CUS-1001` / `CUS-1002`.

### Expected Output

Northstar CRM skeleton - Lab 8; package list; sample customer IDs `CUS-1001` and `CUS-1002`.

### Checkpoint

Before continuing, confirm:

- Seven layer packages exist.
- No Spring/JPA/Kafka imports have been added yet.
- `docs/layer-flow.md` and `docs/CODING-STANDARDS.md` are complete.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Adding Spring annotations too early | Lab 8 is structure-only | Keep all classes plain Java stubs. |
| Creating code under the course clone only | Learner forgot to copy starter | Copy `starter/` into `java-bootcamp/examples/lab8-crm` first. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 8 adds a clean Maven-style Northstar CRM skeleton with layered packages and plain Java stubs. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Module 9 Pre-Lab Exercises

### Lab Objective

These six exercises prepare learners for Lab 9 by introducing POM coordinates, dependency scopes, lifecycle phases, a mini Maven build, profiles, and dependency-tree / CI verify habits.

### Step-by-Step Instructions

1. Open `module-09/exercises/EXERCISES-INDEX.md`.
2. Create `%USERPROFILE%\java-bootcamp\examples\module-09-exercises` on Windows or `~/java-bootcamp/examples/module-09-exercises` on macOS.
3. Complete exercises 1 through 6 in order.
4. Keep Exercise 4 under `mini-maven/` and run `mvn -q test` then `mvn -q package` from that folder.
5. Do not write Spring Boot apps, JPA entities, Kafka clients, or React UI in these exercises.

### Exercise Overview

| Exercise | What learner completes | Verification |
| -------- | ---------------------- | ------------ |
| `exercise-01-pom-coordinates.md` | Exercise 1 — Read POM Coordinates: Create `pom-coordinates-notes.md` and explain GAV + packaging. | Five coordinate answers match; SNAPSHOT meaning is clear. |
| `exercise-02-dependency-scopes.md` | Exercise 2 — Choose Dependency Scopes: Assign `compile` / `test` / `runtime` / `provided`. | JUnit is `test`; wrong default-scope case is explained. |
| `exercise-03-lifecycle.md` | Exercise 3 — Walk the Maven Lifecycle: Map intents to phases from validate through install. | Order is correct; CI `mvn -B verify` habit is stated. |
| `exercise-04-mini-pom.md` | Exercise 4 — Fill a Mini POM: TODO starter builds `build-demo.jar` with one JUnit test. | `mvn test` / `package` succeed; jar prints the banner. |
| `exercise-05-profiles.md` | Exercise 5 — Activate Build Profiles: Explain `dev` default vs `-Pprod`. | Activation answers match; secrets stay out of POM. |
| `exercise-06-dependency-tree.md` | Exercise 6 — Read a Dependency Tree: Direct vs transitive; document `mvn -B verify`. | Tree notes include `:test` JUnit and CI verify sentence. |

### Commands

Run from `java-bootcamp/examples/module-09-exercises/mini-maven`:

```powershell
mvn -q test
mvn -q package
java -jar target\build-demo.jar
```

Expected output: one green test; console prints `BuildDemo ready for Lab 9`.

### Checkpoint

- Exercise 1 states the Northstar GAV correctly.
- Exercise 2 keeps JUnit on `test` scope.
- Exercise 3 orders validate → compile → test → package → verify → install.
- Exercise 4 packages and runs `build-demo.jar`.
- Exercise 5 keeps `dev` as the laptop default.
- Exercise 6 documents `mvn -B verify` before Lab 9.

### Common Mistakes and Troubleshooting

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Exercise 4 fails on JUnit | Missing `<scope>test</scope>` or test file in wrong folder | Put test under `src/test/java` and set scope `test` |
| No main manifest attribute | Blank `mainClass` | Set `com.northstar.crm.BuildDemo` |
| Later tech in answers | Learner jumped ahead | Remove Boot/JPA/Kafka/React; Module 9 is build reasoning |

## Lab 9: Maven Build and Dependencies — Northstar CRM Build Lab

### Lab Objective

In this lab, the learner completes Maven lifecycle, dependencies, scopes, plugins, packaging, and profile awareness.

### Learning Outcomes

- Read a `pom.xml` safely.
- Run Maven lifecycle phases.
- Package and run `customer-service.jar`.

### Prerequisites

- Complete Lab 8 and the Module 9 pre-lab exercises before starting Lab 9.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-09/README.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-09/exercises/EXERCISES-INDEX.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-09/lab9/LAB-9-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-09/lab9/starter/README.md`.

### Scenario

Northstar’s CRM (`CUS-1001` Amina Khan, `CUS-1002` Ravi Singh) will eventually pull Spring Boot, JUnit, Kafka clients, and an PostgreSQL driver. Managing JARs by hand is impossible.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 9 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab9-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-09\lab9"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab9-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab9-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab9-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-09/lab9"
mkdir -p ~/java-bootcamp/examples/lab9-crm
cp -R starter/. ~/java-bootcamp/examples/lab9-crm/
cd ~/java-bootcamp/examples/lab9-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Verify build

```bash
mvn -B -q clean verify
```

**Explanation:** Cleans, compiles, runs tests, and verifies the project.

**Expected Output:** Ends with BUILD SUCCESS.

#### Package app

```bash
mvn -q package
```

**Explanation:** Creates the runnable jar in `target/`.

**Expected Output:** `target/customer-service.jar` exists.

#### Run jar

```powershell
java -jar target\customer-service.jar
```

**Explanation:** Runs the packaged application on Windows.

**Expected Output:** Main output appears without a stack trace.

### Expected Output

Maven `BUILD SUCCESS`, green PlaceholderTest, and a runnable `target/customer-service.jar`.

### Checkpoint

Before continuing, confirm:

- JUnit dependency is test scope.
- Surefire runs tests.
- `docs/lifecycle-evidence.md` and dependency tree evidence are complete.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Dependency not recognized | Maven project was not reloaded | Reload Maven or rerun `mvn clean verify`. |
| Jar will not run | Manifest/main class plugin missing | Check the jar plugin configuration in `pom.xml`. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 9 adds Maven lifecycle, dependencies, scopes, plugins, packaging, and profile awareness. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 10: GitHub Copilot Fundamentals for Java Developers — Northstar CRM

### Lab Objective

In this lab, the learner completes GitHub Copilot prompting, suggestion review, and AI-assisted Java edits with human verification.

### Learning Outcomes

- Write narrow Copilot prompts.
- Review generated code before accepting it.
- Run tests or compile after each AI-assisted edit.

### Prerequisites

- Complete Lab 9 before starting Lab 10.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-10/lab10/LAB-10-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-10/lab10/starter/README.md`.

### Scenario

Northstar’s engineering lead wants the customer-service backend built faster without sacrificing correctness. The team approved GitHub Copilot for all developers, but only under a documented review policy:

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 10 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab10-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-10\lab10"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab10-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab10-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab10-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-10/lab10"
mkdir -p ~/java-bootcamp/examples/lab10-crm
cp -R starter/. ~/java-bootcamp/examples/lab10-crm/
cd ~/java-bootcamp/examples/lab10-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Compile after AI edits

```bash
mvn -B clean verify
```

**Explanation:** Checks that Copilot changes did not break compile or tests.

**Expected Output:** BUILD SUCCESS.

### Expected Output

Prompt notes in `copilot-notes/ai-review-notes.md` plus a clean Maven verification run.

### Checkpoint

Before continuing, confirm:

- Prompt is copied into notes.
- Accepted suggestion is explained.
- Rejected or modified suggestion is documented.
- Build still passes.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Accepting a whole suggestion blindly | AI output may invent APIs or skip edge cases | Read every import, method, and test before accepting. |
| No evidence of review | Learner only pasted code | Fill the AI review notes with prompt, decision, and verification. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 10 adds GitHub Copilot prompting, suggestion review, and AI-assisted Java edits with human verification. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 11: GitHub Copilot for Testing and Refactoring — Northstar CRM

### Lab Objective

In this lab, the learner completes Copilot-assisted test creation and behavior-preserving refactoring.

### Learning Outcomes

- Run baseline tests before refactoring.
- Use AI to draft tests, then inspect assertions.
- Run the same tests after refactoring.

### Prerequisites

- Complete Lab 10 before starting Lab 11.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-11/lab11/LAB-11-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-11/lab11/starter/README.md`.

### Scenario

The Lab 10 review log caught one dangerous Copilot habit (phantom JPA annotations), but the team still lacks an automated safety net around `CustomerService`, and duplicated validation is creeping in. Before Week 2 piles on DTOs (Lab 14) and more behavior, your lead wants:

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 11 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab11-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-11\lab11"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab11-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab11-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab11-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-11/lab11"
mkdir -p ~/java-bootcamp/examples/lab11-crm
cp -R starter/. ~/java-bootcamp/examples/lab11-crm/
cd ~/java-bootcamp/examples/lab11-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run tests before and after

```bash
mvn -B test
```

**Explanation:** Executes JUnit tests so behavior changes are visible.

**Expected Output:** Tests run; failures identify what changed.

### Expected Output

Baseline tests pass, refactor tests pass, and `copilot-notes/ai-test-refactor-notes.md` records prompts and review decisions.

### Checkpoint

Before continuing, confirm:

- Pre-refactor test result captured.
- Refactor is small.
- Post-refactor test result captured.
- No behavior-only claim without evidence.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Refactoring before tests | No safety net | Run `mvn test` first and save the result. |
| AI-generated tests only check not-null | Weak assertions | Add expected values and negative cases. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 11 adds Copilot-assisted test creation and behavior-preserving refactoring. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 12: Coding Standards and Refactoring — Northstar CRM Cleanup

### Lab Objective

In this lab, the learner completes coding standards, code smell notes, and safe cleanup.

### Learning Outcomes

- Spot naming, duplication, and responsibility problems.
- Refactor while preserving behavior.
- Document before/after changes.

### Prerequisites

- Complete Lab 11 before starting Lab 12.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-12/lab12/LAB-12-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-12/lab12/starter/README.md`.

### Scenario

A previous sprint left `CustomerService` in a state no senior engineer would merge: a long method named `doStuff`, stringly-typed statuses, duplicated null checks, `System.out` “logging” mixed with rules, and a magic `"UPDATE"` branch. Support already struggles to explain why Amina Khan (`CUS-1001`) sometimes cannot be looked up after a failed create. Your lead freezes new features until the class is refactored against Northstar standards.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 12 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab12-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-12\lab12"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab12-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab12-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab12-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-12/lab12"
mkdir -p ~/java-bootcamp/examples/lab12-crm
cp -R starter/. ~/java-bootcamp/examples/lab12-crm/
cd ~/java-bootcamp/examples/lab12-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run regression tests

```bash
mvn -B clean test
```

**Explanation:** Confirms cleanup did not break behavior.

**Expected Output:** BUILD SUCCESS or clear test failures to fix.

### Expected Output

Updated cleanup code, passing tests, `docs/smells.md`, and `docs/before-after.md`.

### Checkpoint

Before continuing, confirm:

- Behavior before cleanup is known.
- Each smell has a reason.
- Each refactor has a test or compile check.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Large cleanup in one edit | Hard to identify what broke | Refactor one smell at a time and run tests. |
| Style-only change alters behavior | Logic was moved carelessly | Compare before/after output and tests. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 12 adds coding standards, code smell notes, and safe cleanup. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 13: SOAP API Design — Northstar Customer Contract (Contract-First)

### Lab Objective

In this lab, the learner completes contract-first SOAP design using XSD, WSDL, and XML samples; no Java server.

### Learning Outcomes

- Complete a namespaced XSD.
- Define WSDL operations and messages.
- Validate XML samples for success and fault cases.

### Prerequisites

- Complete Lab 12 before starting Lab 13.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-13/lab13/LAB-13-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-13/lab13/starter/README.md`.

### Scenario

Northstar’s CRM domain can create Amina Khan (`CUS-1001`, `ACTIVE`) and look up Ravi Singh (`CUS-1002`, `PROSPECT`). A regional billing partner still integrates only via SOAP/XML. Before engineers spend time on Spring-WS (Lab 24), architects must publish a stable contract.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 13 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab13-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-13\lab13"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab13-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab13-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab13-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-13/lab13"
mkdir -p ~/java-bootcamp/examples/lab13-crm
cp -R starter/. ~/java-bootcamp/examples/lab13-crm/
cd ~/java-bootcamp/examples/lab13-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### PowerShell well-formedness check

```powershell
Get-ChildItem contracts,samples -Filter *.xml | ForEach-Object { [xml](Get-Content -Raw $_.FullName) | Out-Null; "OK $($_.Name)" }
```

**Explanation:** Parses XML samples on Windows.

**Expected Output:** `OK ...` line for each XML file.

#### Schema/WSDL parse check

```powershell
Get-ChildItem contracts\customer.xsd,contracts\CustomerService.wsdl | ForEach-Object { [xml](Get-Content -Raw $_.FullName) | Out-Null; "OK $($_.Name)" }
```

**Explanation:** Parses XSD and WSDL on Windows.

**Expected Output:** `OK customer.xsd` and `OK CustomerService.wsdl`.

### Expected Output

Well-formed XSD/WSDL/XML files, three operations, success samples, validation fault, customer-not-found fault, and documented placeholder URL.

### Checkpoint

Before continuing, confirm:

- Namespace is `http://northstar.com/crm/customer`.
- Elements are qualified.
- Operations cover create/update/get customer.
- No server is started on port 8080.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Using a live endpoint URL | This lab is contract-only | Keep the address as documented placeholder. |
| Namespace mismatch | XSD/WSDL/sample XML names do not align | Compare targetNamespace, prefixes, and element names. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 13 adds contract-first SOAP design using XSD, WSDL, and XML samples; no Java server. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 14: DTOs and Validation — Northstar CRM API Contract Boundary

### Lab Objective

In this lab, the learner completes DTO request/response models, validation annotations, messages, and mapper boundaries.

### Learning Outcomes

- Separate entities from DTOs.
- Add Jakarta validation annotations.
- Verify validation failures and successful mapping.

### Prerequisites

- Complete Lab 13 before starting Lab 14.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-14/lab14/LAB-14-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-14/lab14/starter/README.md`.

### Scenario

The React client (and later HTTP/SOAP adapters) must send customer payloads that look like JSON/XML contracts—not raw domain objects. Until now, services often accepted `Customer` directly.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 14 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab14-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-14\lab14"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab14-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab14-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab14-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-14/lab14"
mkdir -p ~/java-bootcamp/examples/lab14-crm
cp -R starter/. ~/java-bootcamp/examples/lab14-crm/
cd ~/java-bootcamp/examples/lab14-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run validation tests

```bash
mvn -B test
```

**Explanation:** Runs DTO validation and mapping tests.

**Expected Output:** CustomerRequestValidationTest passes.

### Expected Output

Validation test output showing valid requests pass and invalid requests return expected messages.

### Checkpoint

Before continuing, confirm:

- DTOs do not expose entity internals.
- `CustomerRequestDTO` has validation annotations.
- Mapper converts request to entity and entity to response.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Putting validation only in service | DTO boundary does not reject bad input early | Add annotations to request DTO fields. |
| Leaking entity as response | API contract couples to persistence model | Return `CustomerResponseDTO`. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 14 adds DTO request/response models, validation annotations, messages, and mapper boundaries. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 15: Service Layer Design — Northstar CRM Business Rules

### Lab Objective

In this lab, the learner completes service-layer business rules and separation of concerns.

### Learning Outcomes

- Keep controllers/facades thin.
- Put business rules in service classes.
- Validate create/update/get flows.

### Prerequisites

- Complete Lab 14 before starting Lab 15.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-15/lab15/LAB-15-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-15/lab15/starter/README.md`.

### Scenario

Operations staff activate prospects after KYC. Today that logic is scattered across demos and if-statements. Leadership wants:

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 15 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab15-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-15\lab15"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab15-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab15-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab15-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-15/lab15"
mkdir -p ~/java-bootcamp/examples/lab15-crm
cp -R starter/. ~/java-bootcamp/examples/lab15-crm/
cd ~/java-bootcamp/examples/lab15-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run service tests

```bash
mvn -B test
```

**Explanation:** Checks customer validation and service behavior.

**Expected Output:** CustomerValidatorTest and service paths pass.

### Expected Output

Tests confirm business rules such as required names, email rules, unique/known customer handling, and service responses.

### Checkpoint

Before continuing, confirm:

- CustomerService interface is clear.
- DefaultCustomerService owns use cases.
- Repository is an abstraction.
- Validator owns validation rules.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Business rule in Main/controller | Wrong layer responsibility | Move rule to validator/service. |
| Repository throws user-facing errors | Persistence boundary owns storage, not API messaging | Translate errors in service/API boundary. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 15 adds service-layer business rules and separation of concerns. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 16: API Exception Handling — Northstar CRM Error Model

### Lab Objective

In this lab, the learner completes API exception model, global exception handling, status codes, error codes, and safe logging.

### Learning Outcomes

- Create domain/business exceptions.
- Map exceptions to consistent error responses.
- Verify status codes and messages.

### Prerequisites

- Complete Lab 15 before starting Lab 16.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-16/lab16/LAB-16-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-16/lab16/starter/README.md`.

### Scenario

Support engineers cannot triage CRM failures when every layer throws a different exception type with unstructured messages. Product wants a stable error document:

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 16 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab16-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-16\lab16"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab16-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab16-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab16-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-16/lab16"
mkdir -p ~/java-bootcamp/examples/lab16-crm
cp -R starter/. ~/java-bootcamp/examples/lab16-crm/
cd ~/java-bootcamp/examples/lab16-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run exception tests

```bash
mvn -B test
```

**Explanation:** Runs handler and service exception tests.

**Expected Output:** GlobalExceptionHandlerTest passes.

### Expected Output

Structured error responses with status, error code, message, and request context where applicable.

### Checkpoint

Before continuing, confirm:

- 404 for customer not found.
- 400 for validation/business rule failures.
- No stack trace shown to API user.
- Log detail is safe.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Catching `Exception` everywhere | Specific error mapping is lost | Catch/map domain exceptions first. |
| Returning raw exception message with secrets | Unsafe logging/response | Use safe user messages and internal logs. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 16 adds API exception model, global exception handling, status codes, error codes, and safe logging. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 17: JUnit Testing with AI Assistance — Northstar CRM Service Tests

### Lab Objective

In this lab, the learner completes JUnit tests, positive/negative/boundary cases, and AI-assisted test generation.

### Learning Outcomes

- Write meaningful JUnit assertions.
- Use parameterized tests.
- Review AI-generated tests critically.

### Prerequisites

- Complete Lab 16 before starting Lab 17.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-17/lab17/LAB-17-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-17/lab17/starter/README.md`.

### Scenario

Before week’s end, the CRM service will gain Mockito isolation (Lab 18) and later Spring. Leadership freezes:

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 17 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab17-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-17\lab17"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab17-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab17-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab17-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-17/lab17"
mkdir -p ~/java-bootcamp/examples/lab17-crm
cp -R starter/. ~/java-bootcamp/examples/lab17-crm/
cd ~/java-bootcamp/examples/lab17-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run JUnit suite

```bash
mvn -B test
```

**Explanation:** Runs all Lab 17 tests.

**Expected Output:** CustomerServiceTests, validator tests, and exception tests pass.

### Expected Output

Green JUnit output with assertions for success, failure, and boundaries.

### Checkpoint

Before continuing, confirm:

- Tests include positive cases.
- Tests include negative cases.
- Boundary values are covered.
- AI prompts and review notes are documented.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Only happy-path tests | Failures are untested | Add invalid email, blank name, missing customer, and boundary cases. |
| No assertion | Test only executes code | Assert exact behavior or exception. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 17 adds JUnit tests, positive/negative/boundary cases, and AI-assisted test generation. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 18: Mockito and Mocking with AI Assistance — Northstar CRM Isolation Tests

### Lab Objective

In this lab, the learner completes Mockito mocks, stubbing, verification, argument matching, and AI-assisted isolation tests.

### Learning Outcomes

- Mock repository dependencies.
- Stub success and failure paths.
- Verify service interactions.

### Prerequisites

- Complete Lab 17 before starting Lab 18.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-18/lab18/LAB-18-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-18/lab18/starter/README.md`.

### Scenario

Lab 17 tests use a real `InMemoryCustomerRepository`. Fine for early confidence; insufficient for true unit isolation. Your lead freezes:

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 18 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab18-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-18\lab18"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab18-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab18-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab18-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-18/lab18"
mkdir -p ~/java-bootcamp/examples/lab18-crm
cp -R starter/. ~/java-bootcamp/examples/lab18-crm/
cd ~/java-bootcamp/examples/lab18-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run Mockito tests

```bash
mvn -B test
```

**Explanation:** Runs mock-based isolation tests.

**Expected Output:** CustomerServiceMockitoTest and BDD mock tests pass.

### Expected Output

Green Mockito tests with clear `when/thenReturn`, `verify`, argument matching, and exception stubs.

### Checkpoint

Before continuing, confirm:

- Mocks replace external collaborators.
- Stubs match tested scenario.
- Verify checks important calls, not every incidental call.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Mocking the class under test | Test no longer checks real behavior | Instantiate real service and mock its dependencies. |
| Over-verifying implementation detail | Test becomes brittle | Verify behavior-critical interactions only. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 18 adds Mockito mocks, stubbing, verification, argument matching, and AI-assisted isolation tests. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 19: Integration and UI Testing with Selenium — Northstar CRM Regression Suite

### Lab Objective

In this lab, the learner completes integration testing and Selenium UI regression checks.

### Learning Outcomes

- Run API integration tests.
- Use Selenium page objects.
- Use waits and assertions instead of sleeps.

### Prerequisites

- Complete Lab 18 before starting Lab 19.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-19/lab19/LAB-19-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-19/lab19/starter/README.md`.

### Scenario

The CRM stores customer identity, contact details, lifecycle status, and financial accounts. Its client communicates with Spring Boot; Spring persists (or uses in-memory for the lab), emits events, and protects outbound calls. This lab adds integration and UI verification without bypassing HTTP boundaries.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 19 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab19-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-19\lab19"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab19-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab19-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-19/lab19"
mkdir -p ~/java-bootcamp/examples/lab19-crm
cp -R starter/. ~/java-bootcamp/examples/lab19-crm/
cd ~/java-bootcamp/examples/lab19-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run regression suite

```bash
mvn -B verify
```

**Explanation:** Runs unit/integration/UI checks configured for the lab.

**Expected Output:** Integration and UI tests pass or show actionable failures.

### Expected Output

CustomerApiIT and CustomerUiIT run with assertions; browser resources are cleaned up.

### Checkpoint

Before continuing, confirm:

- App/test server starts as expected.
- Locators are stable.
- Explicit waits are used.
- Browser driver is cleaned up.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Using `Thread.sleep` as primary wait | Flaky UI test | Use Selenium waits for visible/clickable conditions. |
| Fragile CSS locator | Small UI change breaks tests | Use page objects and stable test ids when available. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 19 adds integration testing and Selenium UI regression checks. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 20: Structured Logging — Northstar CRM Traceable Operations

### Lab Objective

In this lab, the learner completes structured logging, trace/correlation IDs, safe message templates, and log verification.

### Learning Outcomes

- Log with levels intentionally.
- Include correlation IDs.
- Avoid logging secrets or PII.

### Prerequisites

- Complete Lab 19 before starting Lab 20.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-20/lab20/LAB-20-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-20/lab20/starter/README.md`.

### Scenario

The CRM stores customer identity, contact details, lifecycle status, and financial accounts. Support escalations fail when logs say “error creating customer” with no correlation and when “helpful” logs dump Amina’s email into Splunk.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 20 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab20-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-20\lab20"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab20-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab20-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab20-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-20/lab20"
mkdir -p ~/java-bootcamp/examples/lab20-crm
cp -R starter/. ~/java-bootcamp/examples/lab20-crm/
cd ~/java-bootcamp/examples/lab20-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run logging tests

```bash
mvn -B verify
```

**Explanation:** Checks logging behavior and application build.

**Expected Output:** CustomerLoggingIT passes and logs contain expected trace fields.

### Expected Output

Structured logs include level, message, correlation/request identifier, and safe customer context.

### Checkpoint

Before continuing, confirm:

- No passwords/tokens in logs.
- Correlation ID appears across related operations.
- Errors include enough diagnostic context.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| String concatenation in logs | Loses structured/template benefits | Use parameterized logging placeholders. |
| Logging full request body | PII/secrets risk | Log safe identifiers and outcome only. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 20 adds structured logging, trace/correlation IDs, safe message templates, and log verification. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Lab 21: Observability and Monitoring — Northstar CRM Actuator & Metrics

### Lab Objective

In this lab, the learner completes Actuator health probes, readiness, liveness, and Micrometer metrics.

### Learning Outcomes

- Expose lab-only Actuator endpoints.
- Implement readiness indicator.
- Verify custom metrics after traffic.

### Prerequisites

- Complete Lab 20 before starting Lab 21.
- Confirm `java -version` shows 21.x.
- Confirm `mvn -version` works.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-21/lab21/LAB-21-GUIDE.md`.
- Read `labs/Week 2 - Backend, AI Tools and Testing/module-21/lab21/starter/README.md`.

### Scenario

The CRM stores customer identity, contact details, lifecycle status, and financial accounts. Without probes, orchestrators restart healthy-but-warming instances incorrectly—or keep routing traffic to instances that cannot reach persistence.

### Exercise Overview

This lab reuses the prior Northstar CRM work and adds the Lab 21 focus. Complete the starter TODOs first, then use the full guide for extended tasks.

### Step-by-Step Instructions

1. Open the course lab folder for this module.
2. Copy `starter/` into your personal workspace as `lab21-crm`.
3. Open the copied project in the IDE.
4. Open the file named in each TODO instruction.
5. Replace each TODO with working code, XML, YAML, or notes.
6. Save the file.
7. Run the smoke-test command below.
8. Compare the output with the Expected Output section.
9. Fix one error at a time before continuing.
10. Complete the lab notes and evidence checklist.

Windows copy command:

Run this from the repository root:

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-21\lab21"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab21-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab21-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab21-crm
```

macOS copy command:

Run this from the repository root:

```bash
cd "labs/Week 2 - Backend, AI Tools and Testing/module-21/lab21"
mkdir -p ~/java-bootcamp/examples/lab21-crm
cp -R starter/. ~/java-bootcamp/examples/lab21-crm/
cd ~/java-bootcamp/examples/lab21-crm
```

### Code or Configuration

Use the starter files as the editable source. Code and configuration must be complete before the lab is marked done: no `_____`, no unresolved `TODO`, no broken imports, and no placeholder values unless the guide explicitly says the placeholder is intentional.

### Commands

#### Run Actuator tests

```bash
mvn -B -Dtest=ActuatorIT test
```

**Explanation:** Runs only the Actuator integration test.

**Expected Output:** ActuatorIT passes.

#### Verify full build

```bash
mvn -B clean verify
```

**Explanation:** Runs all checks for the project.

**Expected Output:** BUILD SUCCESS.

#### Check liveness

```bash
curl -s http://localhost:8080/actuator/health/liveness
```

**Explanation:** Reads liveness health while the app runs.

**Expected Output:** JSON status is `UP`.

#### Check readiness

```bash
curl -s http://localhost:8080/actuator/health/readiness
```

**Explanation:** Reads readiness health while the app runs.

**Expected Output:** JSON status is `UP` or documented OUT_OF_SERVICE test state.

#### Check metric

```bash
curl -s http://localhost:8080/actuator/metrics/crm.customer.create
```

**Explanation:** Reads a custom customer metric.

**Expected Output:** JSON contains metric name and measurements after traffic.

### Expected Output

Actuator health JSON, readiness/liveness behavior, custom `crm.customer.create` and get metrics, and monitoring report with production exposure caution.

### Checkpoint

Before continuing, confirm:

- Actuator exposure is lab-only.
- Readiness can differ from liveness.
- Metrics use low-cardinality tags.
- `docs/monitoring-report.md` is complete.

### Common Mistakes

| Problem | Likely Cause | Fix |
| ------- | ------------ | --- |
| Exposing all endpoints | Unsafe production habit | Only expose the specific lab endpoints and document the caution. |
| High-cardinality metric tag | Metric system can be overwhelmed | Do not tag by unique customer ID/email. |

### Troubleshooting

| Error or Symptom | Why It Happens | How to Fix It |
| ---------------- | -------------- | ------------- |
| Maven dependency is not recognized | Maven has not downloaded/reloaded dependencies | Run `mvn -U clean test` if allowed, or reload Maven in the IDE |
| Test is not detected | Test is in the wrong folder or lacks JUnit annotations | Put tests under `src/test/java` and use `@Test` |
| `BUILD FAILURE` appears | Compile, test, plugin, or configuration error | Read the first error above `BUILD FAILURE`; fix that first |
| Import cannot be resolved | Missing dependency or wrong package/class name | Check `pom.xml`, package declaration, and file path |

### Completion Checklist

- Starter TODOs are complete.
- Commands run from the correct folder.
- Expected output is captured.
- Notes/evidence file is complete.
- No secrets, tokens, passwords, or real customer data are present.

### Lab Summary

Lab 21 adds Actuator health probes, readiness, liveness, and Micrometer metrics. The learner should now be ready for the next lab in the Week 2 CRM sequence.

## Week 2 Continuity Map

| Previous work | Current addition | Why it matters next |
| ------------- | ---------------- | ------------------- |
| Week 1 Java fundamentals | Lab 8 project skeleton | Gives the CRM a maintainable home |
| Lab 8 skeleton | Lab 9 Maven build | Makes the project repeatable |
| Lab 9 build | Labs 10-12 AI/refactoring | Makes AI changes verifiable |
| Labs 10-12 clean code | Labs 13-16 contracts/services/errors | Turns CRM design into API boundaries |
| Labs 13-16 service/API model | Labs 17-19 tests | Proves behavior across unit, mock, integration, and UI levels |
| Labs 17-19 tests | Labs 20-21 logs/metrics | Makes the system diagnosable and observable |

## Final Quality Check

- Lab 8 through Lab 21 have been reviewed.
- Module 8 and Module 9 exercises are included.
- Commands include where to run them and how to verify success.
- Expected outputs are stated without inventing unrealistic values.
- Common beginner errors are called out for each lab.
- Technical terms are introduced before use.
- Continuity from one lab to the next is explicit.

End of Week 2 beginner lab manual.
