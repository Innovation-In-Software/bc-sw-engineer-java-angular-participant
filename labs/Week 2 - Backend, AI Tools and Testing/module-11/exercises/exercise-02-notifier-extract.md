# Exercise 2 — Notifier Extract Plan

**Module 11** · Checkpoint B · Exercises 1–6 Pass then Lab 11

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch extracting CustomerNotifier.notifyStatusChange(...) |
| **Skills practiced** | AI-assisted refactor planning, smell reduction |
| **Expected outcome** | notes/lab11-notifier-extract-plan.md |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-11-exercises/` → notes/lab11-notifier-extract-plan.md |
| **Checkpoint** | B (after slides 84–87) |

## What you will learn

- Extract notifier before adding more status side effects
- Keep a no-arg CustomerService ctor with no-op notifier for compatibility
- Readability/maintainability slides collapse into this one extract story

**Enterprise context:** Notification side effects must be testable without Spring messaging yet.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab11-notifier-extract-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `notes/lab11-notifier-extract-plan.md` that plans extracting a notifier collaborator so tests can isolate side effects (matches Lab 11’s `CustomerNotifier`).

**Done looks like:** `notes/lab11-notifier-extract-plan.md` with smell, interface sketch, Copilot sentence, and out-of-scope note.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-11-exercises/`, create `notes/lab11-notifier-extract-plan.md`.

### Step 2 — Write these four sections

Use this exact structure (copy headings, fill the body):

**1. Smell (1–2 sentences)**  
Inline `System.out` / email send inside `CustomerService.updateStatus` (or activate) makes unit tests slow, flaky, and hard to assert. Side effects belong on a collaborator.

**2. Interface sketch (Lab 11 shape — sketch only, do not implement yet)**

```java
public interface CustomerNotifier {
    void notifyStatusChange(String customerId,
                            CustomerStatus from,
                            CustomerStatus to);
}
```

**3. Why this helps Copilot (one sentence)**  
Stronger prompts name `CustomerNotifier` so AI does not bury I/O inside `CustomerService`.

**4. Out of scope for this pre-lab**  
Do **not** implement Spring events, Kafka, or email providers yet — sketch only.  
Do **not** finish Lab 11’s Mockito test yet.

### Step 3 — Self-check

Method name must be `notifyStatusChange` (same as Lab 11), **not** a made-up `notifyActivated` only.

## Expected result

`notes/lab11-notifier-extract-plan.md` with smell, interface sketch, Copilot sentence, and out-of-scope note.


## Debug / design challenge

Plan puts Kafka in the notifier — strip to plain Java interface for Lab 11.

## Predict the Output / Behavior

Why would tests break if you remove the no-arg service constructor?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab11-notifier-extract-plan.md` |
| Inventing Spring `@EventListener` | Plain Java interface only |
| Implementing the class now | Sketch in notes only; Lab 11 implements |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab11-notifier-extract-plan.md` | Pass / Fail |
| 2 | Smell named + `notifyStatusChange` sketched | Pass / Fail |
| 3 | Out-of-scope (no Spring/Kafka; pre-lab only) noted | Pass / Fail |
