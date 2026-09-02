# AI Thread — AI in Java Fundamentals

**Week 1** · Java & Angular Fullstack Bootcamp

This section is **new** in the Angular outline (it is not a numbered module). Integrate it **alongside** Modules 1–7. Do not replace Lab 0–7.

Each AI Thread covers three angles from the course outline:

1. **AI best practices and governance/security**
2. **AI's impact on this week's domain**
3. **Agentic tools in use**

---

## Classroom segment (15–20 minutes)

### A. Best practices and governance/security

Reviewing and verifying AI-generated Java before you run or submit it.

- Treat Copilot / chat output as a **draft**, not a grade.
- Read every generated line: names, types, exceptions, and side effects.
- Never paste secrets, tokens, or classmate code into a prompt.
- If you cannot explain a generated snippet, rewrite it until you can.

**Discussion prompt:** An assistant generated a `main` that compiles but allocates a 10-million-element `ArrayList` in a loop. What would you check before running it on the class laptop?

### B. Impact on Java fundamentals

How AI assistants change everyday Java work during Week 1.

- Faster boilerplate (`main`, getters, simple loops) — you still must understand bytecode, stack vs heap, and exceptions.
- Risk: accepting code that hides class-loading or GC behavior you are supposed to observe in Lab 1 and Lab 4.
- Benefit: asking “why did `javap` show this instruction?” after you have run `javac` / `java` yourself.

### C. Agentic tools in the IDE

Introducing AI coding assistants in the IntelliJ workflow (Module 10 goes deeper).

- Optional: enable GitHub Copilot in IntelliJ **after** Lab 0 Pass, for comments and small completions only.
- Keep the Week 1 habit: type the first version, then ask the assistant to *review* — not to replace `javac` / `javap`.
- Log one accept / one reject in `java-bootcamp/notes/` (what you kept, what you threw away, and why).

---

## What is not a Week 1 lab

There is **no graded AI lab** this week. Evidence stays with Lab 0–7 (JDK 21, compile/run, OOP, collections, streams, exceptions). Use this thread as a standing checkpoint after each module: “Did I verify anything the assistant wrote?”
