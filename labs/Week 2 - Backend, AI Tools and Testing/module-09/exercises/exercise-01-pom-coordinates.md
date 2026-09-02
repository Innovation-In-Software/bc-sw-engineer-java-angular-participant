# Exercise 1 — Read POM Coordinates

**Module 9** · Checkpoint A · Exercises 1–6 Pass then Lab 9

## Activity card

| | |
| --- | --- |
| **Objective** | Explain groupId, artifactId, version, and packaging from a POM |
| **Skills practiced** | POM coordinates, packaging jar |
| **Expected outcome** | notes/pom-coordinates-notes.md filled correctly |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-09-exercises/` → notes/pom-coordinates-notes.md |
| **Checkpoint** | A (after slides 29–39) |

## What you will learn

- Coordinates uniquely identify an artifact in Maven repos
- packaging jar is the default for libraries/apps in this course
- Version SNAPSHOT means work-in-progress local/CI builds

**Enterprise context:** CRM services publish under stable groupId/artifactId so pipelines and other teams can depend on them.

## Coordinate map

| Element | Meaning | Northstar CRM example |
| ------- | ------- | --------------------- |
| `groupId` | Organization / product namespace | `com.northstar` |
| `artifactId` | Module name inside that group | `customer-service` |
| `version` | Release or snapshot label | `0.1.0-SNAPSHOT` |
| `packaging` | Output type (`jar`, `war`, `pom`, …) | `jar` |
| GAV string | Combined identity | `com.northstar:customer-service:0.1.0-SNAPSHOT` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `notes/pom-coordinates-notes.md` and explain how Maven names a project so teammates and CI resolve the same artifact.

**Done looks like:** You can read a POM header and state the exact GAV plus packaging without guessing.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Fill the blanks from this POM fragment

```xml
<groupId>com.northstar</groupId>
<artifactId>customer-service</artifactId>
<version>0.1.0-SNAPSHOT</version>
<packaging>jar</packaging>
```

| Question | Your answer |
| -------- | ----------- |
| What is the `groupId`? | |
| What is the `artifactId`? | |
| What is the `version`? | |
| What is the packaging? | |
| Write the full GAV (`groupId:artifactId:version`) | |

### Step 2 — Check the reference

| Question | Answer |
| -------- | ------ |
| `groupId` | `com.northstar` |
| `artifactId` | `customer-service` |
| `version` | `0.1.0-SNAPSHOT` |
| packaging | `jar` |
| GAV | `com.northstar:customer-service:0.1.0-SNAPSHOT` |

### Step 3 — Explain SNAPSHOT

Write one sentence:

> A `-SNAPSHOT` version means the artifact is still under active development and may change without a new release number.

### Step 4 — Spot the mistakes

Explain why each is wrong for Northstar CRM Lab 9:

- `groupId` set to `com.example` while the Java packages are `com.northstar.crm`;
- `artifactId` set to `CustomerService` (PascalCase);
- omitting `<packaging>` and assuming WAR for a plain Java library/app JAR;
- committing a different `version` on every laptop with no team agreement.

## Expected result

You can read a POM header and state the exact GAV plus packaging without guessing.


## Debug / design challenge

Two artifacts share artifactId but differ groupId — are they the same library?

## Predict the Output / Behavior

What does 0.1.0-SNAPSHOT signal to consumers?

## Troubleshooting

See steps above if Maven commands fail. Prefer full logs (no `-q`) while learning.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Five coordinate answers match the reference | Pass / Fail |
| 2 | You explain what `-SNAPSHOT` means | Pass / Fail |
| 3 | You identify at least two coordinate mistakes | Pass / Fail |
