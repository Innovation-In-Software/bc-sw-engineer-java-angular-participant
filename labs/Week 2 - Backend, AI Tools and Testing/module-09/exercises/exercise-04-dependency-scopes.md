# Exercise 4 — Choose Dependency Scopes

**Module 9** · Checkpoint C · Exercises 1–6 Pass then Lab 9

## Activity card

| | |
| --- | --- |
| **Objective** | Choose compile, test, runtime, and provided scopes correctly |
| **Skills practiced** | Dependency scopes |
| **Expected outcome** | notes/dependency-scopes-notes.md with correct scope choices |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-09-exercises/` → notes/dependency-scopes-notes.md |
| **Checkpoint** | C (after slides 48–51) |

## What you will learn

- test scope keeps JUnit off the runtime classpath
- provided means the container/JDK supplies it at runtime
- Wrong scopes bloat JARs or break tests

**Enterprise context:** Shipping test libraries into a production CRM JAR is a common build smell.

## Scope map

| Scope | On compile classpath? | On runtime classpath? | Typical use |
| ----- | --------------------- | --------------------- | ------------ |
| `compile` (default) | Yes | Yes | Application libraries you call from production code |
| `test` | Tests only | Tests only | JUnit, Mockito, test helpers |
| `runtime` | No | Yes | Drivers needed to run but not compile against |
| `provided` | Yes | No (container supplies) | Servlet API on an app server; JDK-provided APIs |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
Test libraries always use `<scope>test</scope>`.
Do not leave JUnit on the default `compile` scope.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Assign a scope

| Dependency need | Scope |
| --------------- | ----- |
| JUnit Jupiter used only in `src/test/java` | |
| Spring Context API called from production sources (Lab 9 learning placeholder) | |
| JDBC driver you never import in Java source but need at runtime later | |
| API the application server will provide in production | |

### Step 2 — Check the reference

| Dependency need | Scope |
| --------------- | ----- |
| JUnit Jupiter | `test` |
| Spring Context (placeholder) | `compile` (default) |
| JDBC driver (no compile-time imports) | `runtime` |
| Server-provided API | `provided` |

### Step 3 — Explain a bad default

Bad:

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.11.4</version>
  <!-- no scope — defaults to compile -->
</dependency>
```

Write why this is wrong:

> JUnit becomes a production dependency: it is packaged/resolved for the main app, pollutes the runtime classpath, and signals the wrong intent to teammates and CI.

### Step 4 — Write one team rule

Add to `dependency-scopes-notes.md`:

```markdown
Test libraries always use `<scope>test</scope>`.
Do not leave JUnit on the default `compile` scope.
```

## Expected result

You can pick scopes for test vs production vs runtime-only vs provided dependencies.


## Debug / design challenge

JUnit marked compile — fix the scope and explain the risk.

## Predict the Output / Behavior

Which scope should junit-jupiter use in Module 9?

## Troubleshooting

See steps above if Maven commands fail. Prefer full logs (no `-q`) while learning.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Four scope assignments match the reference | Pass / Fail |
| 2 | You explain the JUnit-without-scope mistake | Pass / Fail |
| 3 | Team rule is written | Pass / Fail |
