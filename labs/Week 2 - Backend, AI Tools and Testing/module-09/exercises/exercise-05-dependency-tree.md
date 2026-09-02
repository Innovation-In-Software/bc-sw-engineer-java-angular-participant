# Exercise 5 — Read a Dependency Tree

**Module 9** · Checkpoint C · Exercises 1–6 Pass then Lab 9

## Activity card

| | |
| --- | --- |
| **Objective** | Read mvn dependency:tree and separate direct vs transitive deps |
| **Skills practiced** | dependency:tree, transitive dependencies |
| **Expected outcome** | notes/dependency-tree-notes.md with tree interpretation |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-09-exercises/` → notes/dependency-tree-notes.md |
| **Checkpoint** | C (after slides 48–51) |

## What you will learn

- Never use -q with dependency:tree — you need the output
- Transitive deps arrive because of direct deps
- Trees help spot version conflicts early

**Enterprise context:** Security and license reviews start from the resolved dependency tree, not just the POM list.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-09-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/dependency-tree-notes.md` |

## How to read Maven tree symbols

Maven draws a text tree. The symbols are **not** typos:

| Symbol | Meaning |
| ------ | ------- |
| `+-` | “This node has a sibling after it” (more dependencies follow at this level) |
| `\-` | “This is the **last** child at this level” (backslash + hyphen) |
| `\|` | Vertical guide line connecting a parent to deeper children |
| `\|  +-` / `\|  \-` | A **child** (usually transitive) under the parent above |

```text
com.northstar:build-demo:jar:0.1.0-SNAPSHOT          ← your project (root)
+- org.junit.jupiter:junit-jupiter:jar:5.11.4:test   ← DIRECT (you declared it); +- means more siblings may follow
|  \- org.junit.jupiter:junit-jupiter-params:...:test ← TRANSITIVE (pulled by Jupiter); \- = last child under Jupiter
\- (optional other direct dependency)                ← another DIRECT sibling of junit-jupiter
```

**Tip:** Read left → right: `groupId:artifactId:type:version:scope`. The last segment (`:test`, `:compile`) is the scope.

## Sample tree (study only)

```text
com.northstar:build-demo:jar:0.1.0-SNAPSHOT
+- org.junit.jupiter:junit-jupiter:jar:5.11.4:test
|  \- org.junit.jupiter:junit-jupiter-params:jar:5.11.4:test
```

| Term | Meaning |
| ---- | ------- |
| Direct dependency | Declared in **your** `pom.xml` |
| Transitive dependency | Pulled in because a direct dependency needs it |
| Scope column (`:test`) | Where that artifact is visible |

## Maven flags (read before you run)

| Flag | What it does | When to use |
| ---- | ------------ | ----------- |
| *(none)* | Shows full Maven + plugin output | **Default for learning** — use this when you need to *read* the tree or test results |
| `-q` | Quiet — hides most log lines | Only when you already know the command works and just want a quieter rebuild |
| `-B` | Batch / non-interactive | CI-style runs (`mvn -B verify`) |

**Do not use `-q` with `dependency:tree`.** Quiet mode can hide the tree you are supposed to inspect.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `notes/dependency-tree-notes.md` distinguishing direct vs transitive dependencies and recording why CI prefers `mvn -B verify`.

**Done looks like:** You can label direct vs transitive rows, explain `+-` vs `\-`, spot `:test` scope, and know the CI verify habit—before Lab 9’s full evidence pack.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Classify rows (from the sample)

| Artifact | Direct or transitive? | Scope shown |
| -------- | --------------------- | ----------- |
| `junit-jupiter` | | |
| `junit-jupiter-params` | | |

### Step 2 — Check the reference

| Artifact | Direct or transitive? | Scope |
| -------- | --------------------- | ----- |
| `junit-jupiter` | Direct (you declared it) | `test` |
| `junit-jupiter-params` | Transitive (comes with Jupiter) | `test` |

### Step 3 — Classify from the sample now; run Maven after Exercise 6

Use the sample tree above for your notes. After you finish **Exercise 6** (mini POM), re-run from `mini-maven/`:

```bash
# No -q — you need to see the tree on screen
mvn dependency:tree
```

Optional (saves a file for Lab 9 practice):

```bash
mvn dependency:tree -DoutputFile=dependency-tree.txt
```

Paste or summarize the tree into `notes/dependency-tree-notes.md`. Confirm JUnit appears with `:test`. Circle or label one `+-` line and one `\-` line in your notes.

### Step 4 — CI command habit (short)

In the same notes file, copy these three lines (no essay required):

```text
-B = batch mode (CI-friendly)
verify = compile + test + package checks without casually installing to every laptop ~/.m2
CI habit for this bootcamp: mvn -B verify
```

## Expected result

You can label direct vs transitive rows, explain `+-` vs `\-`, spot `:test` scope, and know the CI verify habit—before Lab 9’s full evidence pack.


## Debug / design challenge

Tree is empty because -q was used — re-run correctly.

## Predict the Output / Behavior

Is a nested library under junit-jupiter a direct or transitive dependency?

## Troubleshooting

See steps above if Maven commands fail. Prefer full logs (no `-q`) while learning.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] Direct vs transitive for Jupiter rows is correct
- [ ] Notes explain `+-` vs `\-` in one short line each
- [ ] You ran `mvn dependency:tree` **without** `-q` (or explained why)
- [ ] Notes include `mvn -B verify` as the CI habit

