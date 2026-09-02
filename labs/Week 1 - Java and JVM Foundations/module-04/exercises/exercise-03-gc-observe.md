# Exercise 3 — Garbage Collection in Action

**Module 4** · Pre-lab practice · Checkpoint B · all 7 then lab
**Folder:** `examples/module-04-exercises/` ([setup](EXERCISES-INDEX.md))

![Temporary Allocations Reclaimed by Garbage Collection](../../../lab_diagrams/mod04-ex03-gc-observe.png)

> **Safe bounded experiment:** The program allocates temporary batches and completes under a 64 MB heap. Do not increase the batch size to force an OOM.

## Activity card

| | |
| --- | --- |
| **Objective** | Run a bounded allocation loop with -Xlog:gc and read the evidence |
| **Skills practiced** | -Xmx/-Xms, -Xlog:gc, observing GC lines |
| **Expected outcome** | GC log snippet captured; pattern explained (not exact counts) |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-04-exercises/GcObserve.java` |
| **Checkpoint** | B (after slides 119–121) |

## What you will learn

- System.gc is a hint
- Small heaps make GC easier to see
- Never force OOM in class

**Enterprise context:** Ops watches GC logs before blaming the app for latency spikes.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
[info][gc] Using G1
[info][gc] GC(0) Pause Young (Normal) (G1 Evacuation Pause) ...
Completed round 5
...
Completed round 20
Allocated bytes over time: 262144000
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/`](starter/README.md). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class GcObserve {
    public static void main(String[] args) {
        long checksum = 0;

        for (int round = 1; round <= 20; round++) {
            // About 12.5 MB per temporary batch.
            // TODO: byte[][] batch = new byte[200][];

            for (int i = 0; i < batch.length; i++) {
                // TODO: batch[i] = new byte[64 * 1024];
                // TODO: checksum += batch[i].length;
            }

            if (round % 5 == 0) {
                // TODO: println "Completed round " + round
            }

            // On the next iteration, this batch can become unreachable.
        }

        // TODO: println "Allocated bytes over time: " + checksum
    }
}
```

## Why GC must occur

- One batch is roughly `200 × 64 KB ≈ 12.5 MB`.
- Twenty batches allocate roughly `250 MB` over time.
- The maximum heap is only `64 MB`.
- The program can finish because old batches become unreachable and the collector reclaims space.

The program does **not** hold all 250 MB simultaneously.

## Steps

### Step 1 — Create `GcObserve.java`

**Why:** Lab 4 expects you to read GC log evidence from a bounded allocation pattern.

1. **New → File** → `GcObserve.java`.
2. Paste the starter.
3. Fill every `// TODO`. Save.

### Step 2 — Compile

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac GcObserve.java
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac GcObserve.java
```

### Step 3 — Run with GC logging

Use the same command on Windows and macOS:

```text
java -Xms16m -Xmx64m -Xlog:gc GcObserve
```

**Command meanings:**

| Part | Meaning |
| ---- | ------- |
| `-Xms16m` | Initial heap around 16 MB |
| `-Xmx64m` | Maximum heap around 64 MB |
| `-Xlog:gc` | Print GC events |
| `GcObserve` | Main class; class name comes after flags |

### Step 4 — Find evidence

**Verified on Windows with JDK 21** — abbreviated excerpt:

```text
[info][gc] Using G1
[info][gc] GC(0) Pause Young (Normal) (G1 Evacuation Pause) ...
Completed round 5
...
Completed round 20
Allocated bytes over time: 262144000
```

Your event numbers, heap sizes, and pause times will differ.

Look for:

- `GC(...)`
- `Pause Young`
- memory before/after an event, such as `33M->15M`
- successful completion through round 20

### Step 5 — Save a short observation

Add a **small excerpt**, not the entire log, to `notes.md`:

```markdown
The program allocated about 250 MB over time despite a 64 MB maximum heap.
GC log entries appeared between rounds. A before/after value that decreased
shows that memory was reclaimed. Exact pause times varied on my machine.
```

## Expected result

The program reaches round 20, reports `262144000` allocated bytes over time, and GC log entries appear.


## Predict the Output / Behavior

What happens to GC frequency if you raise -Xmx a lot?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `Unrecognized option: -Xlog:gc` | Confirm JDK 21 with `java -version` |
| `Could not find or load main class` | Run from the folder containing `GcObserve.class` |
| No GC lines | Confirm `-Xlog:gc` appears before `GcObserve` |
| OOM | Restore `200` entries and `20` rounds; do not enlarge the experiment |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Program completes under `-Xmx64m` | Pass / Fail |
| 2 | You captured one GC event and one completion line | Pass / Fail |
| 3 | You can explain “allocated over time” vs “simultaneously live” | Pass / Fail |
