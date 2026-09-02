# Exercise 4 — Select and Verify G1

**Module 4** · Pre-lab practice · Checkpoint B · all 7 then lab
**Folder:** `examples/module-04-exercises/` ([setup](EXERCISES-INDEX.md))

> **Reuse Exercise 3:** No new Java file is needed. Run `GcObserve` again with an explicit collector flag.

## Activity card

| | |
| --- | --- |
| **Objective** | Select G1 explicitly and verify with flags/logs |
| **Skills practiced** | -XX:+UseG1GC, collector identity |
| **Expected outcome** | Notes confirm G1 was used |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-04-exercises/notes + GcObserve rerun` |
| **Checkpoint** | B |

## What you will learn

- G1 is the common modern default
- Flags go before the class name
- Module 1 awareness → Module 4 hands-on

**Enterprise context:** Most JDK 11+ services still start on G1 unless tuned otherwise.

## Key idea

G1 divides the heap into regions and aims to balance throughput with predictable pause goals. In JDK 21, G1 is commonly the default on typical server-class machines, but this exercise selects it explicitly so the command is unambiguous.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
[info][gc] Using G1
[info][gc] GC(0) Pause Young (Normal) (G1 Evacuation Pause) ...
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Confirm the class exists

From Exercise 3, you should have:

```text
GcObserve.java
GcObserve.class
```

If the `.class` file is missing:

```text
javac GcObserve.java
```

### Step 2 — Run with explicit G1 selection

**Windows and macOS:**

```text
java -XX:+UseG1GC -Xms16m -Xmx64m -Xlog:gc GcObserve
```

| Flag | Purpose |
| ---- | ------- |
| `-XX:+UseG1GC` | Select G1 |
| `-Xlog:gc` | Show collector activity |
| `-Xms16m -Xmx64m` | Keep the bounded exercise heap |

**Verified (Windows/JDK 21)** — beginning of output:

```text
[info][gc] Using G1
[info][gc] GC(0) Pause Young (Normal) (G1 Evacuation Pause) ...
```

### Step 3 — Verify configuration directly

Run:

```text
java -XX:+UseG1GC -XX:+PrintCommandLineFlags -version
```

Look for:

```text
-XX:+UseG1GC
```

The remaining JVM-selected values may differ by machine.

### Step 4 — Record the command and observation

Add to `notes.md`:

```markdown
Command:
java -XX:+UseG1GC -Xms16m -Xmx64m -Xlog:gc GcObserve

Evidence:
The log began with "Using G1" and showed G1 evacuation pauses.
The collector flag selects G1; it does not guarantee a particular pause time.
```

## Expected result

The JVM starts successfully, prints `Using G1`, and the bounded allocation program completes.

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `Unrecognized VM option` | Confirm `java -version` reports JDK 21 |
| Flag placed after class name | Put every JVM flag before `GcObserve` |
| No `Using G1` line | Include `-Xlog:gc` |
| Different pause times | Expected; hardware and JVM ergonomics vary |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Log explicitly says `Using G1` | Pass / Fail |
| 2 | Program still completes under the bounded heap | Pass / Fail |
| 3 | You can explain why exact pause duration is not guaranteed | Pass / Fail |
