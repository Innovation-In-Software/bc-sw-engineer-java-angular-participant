# Exercise 1 — Auto-Config Versus Ownership

**Module 23** · Checkpoint A · Exercises 1–6 Pass then Lab 23

## Activity card

| | |
| --- | --- |
| **Objective** | List what Boot auto-configures versus what Northstar still owns |
| **Skills practiced** | Auto-config vs ownership analysis |
| **Expected outcome** | notes/autoconfig-ownership.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-23-exercises/` → notes/autoconfig-ownership.md |
| **Checkpoint** | A (after slides 36–46) |

## What you will learn

- Gifts: embedded server, MVC, Jackson, health endpoint wiring
- Ownership: CRM create rules, fixtures, Actuator exposure policy
- Auto-config does not invent business validation

**Enterprise context:** Leadership asks: if Boot wires Tomcat, who still owns duplicate CUS-1001 rules? You do.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/autoconfig-ownership.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — Auto-Config Versus Ownership

| Boot / auto-config gift | Still owned by the team |
| --- | --- |
| Embedded Tomcat + DispatcherServlet | Customer create/get rules |
| Jackson JSON mapping | Fixture IDs CUS-1001 / CUS-1002 |
| Actuator health infrastructure | Which endpoints to expose |

Auto-config ≠ business rules.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/autoconfig-ownership.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — Auto-Config Versus Ownership

| Boot / auto-config gift | Still owned by the team |
| --- | --- |
| _____ | _____ |
| _____ | _____ |
| _____ | _____ |

## One-sentence rule
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Gifts vs ownership table in `notes/autoconfig-ownership.md`.

## Debug / design challenge

If health is UP but POST create always returns 500, is that an auto-config failure or ownership?

## Predict the Output / Behavior

Name one thing removing starter-web would take away from Lab 23.

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/autoconfig-ownership.md` |
| Claiming Boot owns CRM rules | Rules stay team-owned |
| Empty table | At least three gift/ownership pairs |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/autoconfig-ownership.md`
- [ ] Three pairs
- [ ] Ownership of CRM rules clear
- [ ] One-sentence rule
