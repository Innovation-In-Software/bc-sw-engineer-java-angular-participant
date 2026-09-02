# Exercise 7 — Objects and Classes

**Module 1** · Pre-lab practice · Checkpoint D  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Classes, Objects, and References](../../../lab_diagrams/mod01-ex07-objects.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Complete a `Person` class (fields provided) — focus on constructor, method, and `new` |
| **Skills practiced** | Constructors, instance methods, stack reference vs heap object |
| **Expected outcome** | Prints `Aman is 21 years old` |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-01-exercises/Person.java` |

## What you will learn

- Class = blueprint; object = instance created with `new`
- Fields live on the **heap**; the variable holding the reference lives on the **stack**
- `this.field = param` in constructors

**Enterprise context:** A hospital `Patient` or warehouse `Shipment` object is the same pattern — identity fields on the heap, short-lived references in the request thread stack.

## Boilerplate already provided

Fields are **pre-declared** so you spend time on the new idea (construction + display), not rewriting getters/setters.

## Worked example — expected output

```text
Aman is 21 years old
```

## Starter (fill in the TODOs)

Copy [`starter/Person.java`](starter/Person.java) or paste:

```java
public class Person {
    // Provided — do not rewrite boilerplate fields
    String name;
    int age;

    // TODO: assign parameters to fields using this.name / this.age
    public Person(String name, int age) {
        _____
    }

    // TODO: print "<name> is <age> years old"
    public void display() {
        _____
    }

    public static void main(String[] args) {
        // TODO: create Person("Aman", 21) and call display()
        _____
    }
}
```

## Steps

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Person.java
java Person
```

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Person.java
java Person
```

**Success criteria:** Output matches the worked example.

## Sketch (required for Pass)

In your notes, draw:

```text
Stack:  person  ----ref---->  Heap: Person { name="Aman", age=21 }
```

## Troubleshooting

| Problem | Fix |
| ------- | --- |
| Fields stay null / 0 | Assign `this.name = name;` and `this.age = age;` |
| `cannot find symbol` on `display` | Call `person.display();` on the instance |
| File/class mismatch | File must be `Person.java` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Output is `Aman is 21 years old` | Pass / Fail |
| 2 | Stack vs heap sketch completed | Pass / Fail |
