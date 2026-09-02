# Week 1 Beginner Hands-On Manual

**Audience:** first-time Java learners using IntelliJ IDEA Community or VS Code.

**Purpose:** This manual expands Week 1 labs and exercises into a beginner-friendly path. It preserves the original learning objectives and technical content, but makes every action explicit: what to open, where to create files, what to type, what output to expect, how to verify progress, and how to recover from common mistakes.

> Practice only: skip screenshot placeholders. Commit your code to GitHub instead. Nothing is submitted or graded.

## Objective

By the end of Week 1, you will be able to write, compile, run, inspect, and troubleshoot beginner Java programs using JDK 21. You will also practice OOP, memory concepts, collections, streams, and exception handling before moving into enterprise Java tooling.

## Prerequisites

- A Windows or macOS laptop.
- Permission to install JDK 21, IntelliJ IDEA Community, Git, and Maven.
- No prior Java, IntelliJ, VS Code, terminal, Git, Maven, project structure, environment variable, or file extension knowledge is assumed.

## Beginner Concepts Used Throughout

| Concept | Beginner explanation | Why it matters |
| ------- | -------------------- | -------------- |
| File extension | The ending of a filename, such as `.java` | Java source files must end in `.java` |
| Folder | A place where files are stored | Commands must run in the folder containing your files |
| Terminal | A text window where you type commands | You use it to compile and run Java |
| `javac` | Java compiler | Turns `.java` files into `.class` bytecode |
| `java` | Java launcher | Starts the JVM and runs a compiled class |
| JVM | Java Virtual Machine | Runs bytecode on your operating system |
| PATH | A system setting listing command locations | Lets your terminal find `java`, `javac`, `git`, and `mvn` |
| Package | A Java namespace that maps to folders | Later labs use `src/com/academy/...` folder structures |
| Maven | A build tool | Not required for most Week 1 commands, but installed for later weeks |

## Standard Workspace

Use this personal workspace for your work, not the read-only course handout folder:

| OS | Workspace folder |
| -- | ---------------- |
| Windows | `%USERPROFILE%\java-bootcamp` |
| macOS | `~/java-bootcamp` |

Create code under `java-bootcamp/examples/`. Save screenshots and notes under `java-bootcamp/notes/`.

## Standard Commands

### Windows PowerShell

```powershell
java -version
javac -version
git --version
mvn -version
Get-Location
```

### macOS Terminal

```bash
java -version
javac -version
git --version
mvn -version
pwd
```

Expected output: Java and `javac` should show version 21.x. Git and Maven should print their version numbers. The location command should show the folder you are currently using.

## Lab 0: Development Environment Setup

### Objective

Install and verify the tools required for Week 1: JDK 21, IntelliJ IDEA Community, Maven, Git, and your personal `java-bootcamp` workspace.

### Step-by-Step Instructions

1. Open the Week 1 Lab 0 guide for your operating system:
   - Windows: `labs/Week 1 - Java and JVM Foundations/module-00/lab0/LAB-0-WINDOWS.md`
   - macOS: `labs/Week 1 - Java and JVM Foundations/module-00/lab0/LAB-0-MACOS.md`
2. Install JDK 21.
3. Install IntelliJ IDEA Community.
4. Install Git.
5. Install Maven.
6. Create the folder `java-bootcamp` in your user home folder.
7. Create a simple smoke-test Java file as described in the OS guide.
8. Compile and run the smoke test.

### Expected Output

```text
openjdk version "21..."
javac 21...
git version ...
Apache Maven ...
Hello Java Bootcamp!
```

### Checkpoint

- IntelliJ opens the `java-bootcamp` folder.
- Project SDK is JDK 21.
- `java`, `javac`, `git`, and `mvn` all work in the integrated terminal.
- You can run the Lab 0 Hello World program from the terminal and IntelliJ.

### Common Mistakes

- Installing a JRE instead of the full JDK. The JRE can run Java but may not include `javac`.
- Opening the course handout folder as the place to write work. Your work belongs in `java-bootcamp/examples/`.
- Forgetting to reopen the terminal after changing environment variables.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac` is not recognized | JDK bin folder is not on PATH | Revisit the Lab 0 OS guide and update PATH/JAVA_HOME |
| IntelliJ says no SDK | IntelliJ has not been pointed at JDK 21 | Use File -> Project Structure -> Project -> SDK 21 |
| Maven command fails | Maven is missing or PATH is stale | Install Maven and reopen the terminal |

## Module 1: JVM Architecture and Runtime Model

### Objective

This Module 1 lab is the consolidation after Module 1 slides and [Exercises 1–8](module-01/exercises/EXERCISES-INDEX.md). You already practiced compile/run, WORA, class loading, methods, objects, and `javap` in `module-01-exercises/`. Here you repeat the JVM story with **new graded class names**, deeper evidence, heap stress (`MemoryDemo`), JVM flags, and your personal GitHub workspace.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-01-exercises/`.
- Your lab folder will be `java-bootcamp/examples/jvm-compilation-lab/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-01-exercises | Out-Null
cd examples\module-01-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-01-exercises
cd examples/module-01-exercises
pwd
```

Expected output: the terminal location ends with `module-01-exercises`.

### Exercises

#### Exercise — Hello World

**Objective**

Write, compile, and run a minimal program that prints `Hello, JVM!`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-01-hello-world.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Hello.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Hello.java`

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, JVM!");
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Hello.java
java Hello
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Hello.java
java Hello
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Console prints `Hello, JVM!`; `Hello.class` exists.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Platform Independence (WORA)

**Objective**

Run an existing `.class` with `java`. Note why recompile is not required for another OS JVM.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-02-wora.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

Short note explains WORA using your `.class` experience.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Control Flow

**Objective**

Create `ControlFlow.java` using `if`, `for`, `while`, and `switch` with simple examples.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-03-control-flow.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `ControlFlow.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`ControlFlow.java`

```java
public class ControlFlow {
    public static void main(String[] args) {
        int number = 4;

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int count = 3;
        while (count > 0) {
            System.out.println("countdown " + count);
            count--;
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac ControlFlow.java
java ControlFlow
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac ControlFlow.java
java ControlFlow
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

All four control structures run and print clear output.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Watch Class Loading

**Objective**

Run `Hello` with `-verbose:class` and identify which class loader loaded `Hello` versus a core JDK class like `String`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-04-class-loading.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

The verbose log shows `Hello` loaded from your local classpath, while `String` is already loaded from the JDK's core module before your class ever runs.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Variables and Data Types

**Objective**

Create `Variables.java` with local variables of several primitive types and one `String`; print each.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-05-variables.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Variables.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Variables.java`

```java
public class Variables {
    public static void main(String[] args) {
        int age = 21;
        long population = 8_000_000_000L;
        double price = 19.99;
        boolean enrolled = true;
        char grade = 'A';
        String name = "Aman";

        System.out.println(age);
        System.out.println(population);
        System.out.println(price);
        System.out.println(enrolled);
        System.out.println(grade);
        System.out.println(name);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Variables.java
java Variables
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Variables.java
java Variables
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

All declared values print without compile/runtime errors.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Methods and Parameters

**Objective**

Create `Methods.java` with at least two methods that take parameters and return a value; call them from `main`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-06-methods.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Methods.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Methods.java`

```java
public class Methods {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println(sum);

        String message = greet("Aman");
        System.out.println(message);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Methods.java
java Methods
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Methods.java
java Methods
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Method results print; you can explain stack frames for the calls.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Objects and Classes

**Objective**

Create `Person.java` with fields, a constructor, and a method; instantiate in `main`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-07-objects.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Person.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Person.java`

```java
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {
        Person person = new Person("Aman", 21);
        person.display();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Person.java
java Person
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Person.java
java Person
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Object prints; fields live on the heap and the reference on the stack.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise — Inspect Bytecode

**Objective**

Disassemble `Person` (or `Hello`) with `javap` and note three bytecode instructions.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-01-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-01/exercises/exercise-08-javap.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-01-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

You can name what three instructions do from your listing.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 1: Beginner Guide

**Objective**

Build and verify the Module 1 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-01/lab1/LAB-1-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-1-WINDOWS.md` or `LAB-1-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/jvm-compilation-lab/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

Capture evidence for grading from your IDE terminal and Explorer / Project view.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/jvm-compilation-lab/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Module 2: Java Syntax and Core Constructs

### Objective

This Module 2 lab is the consolidation after Module 2 slides and [Exercises 1–7](module-02/exercises/EXERCISES-INDEX.md) (plus 8–9 when done). You already practiced arithmetic, decisions, loops, methods, `Scanner`, parsing, and `printf` in `module-02-exercises/`. Here you assemble those skills into a **menu-driven Student Management console** with packages and a clear model/manager/`Main` split.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-02-exercises/`.
- Your lab folder will be `java-bootcamp/examples/Lab2-JavaSyntax/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-02-exercises | Out-Null
cd examples\module-02-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-02-exercises
cd examples/module-02-exercises
pwd
```

Expected output: the terminal location ends with `module-02-exercises`.

### Exercises

#### Exercise 1 — Calculations

**Objective**

Create `Calculator.java` that reads two numbers and prints sum, difference, product, and quotient (use `double` so division keeps decimals).

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-01-calculator.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Calculator.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Calculator.java`

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Second number: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("Sum: %.2f%n", a + b);
        System.out.printf("Difference: %.2f%n", a - b);
        System.out.printf("Product: %.2f%n", a * b);
        System.out.printf("Quotient: %.2f%n", a / b);

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac Calculator.java
java Calculator
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac Calculator.java
java Calculator
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Four labeled results print for your two inputs.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 2 — Decision Making

**Objective**

Create `DecisionDemo.java` that reads a numeric score and prints a letter grade with `if`/`else if`/`else`, then reads a day number (1–7) and prints its name with `switch`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-02-decision-making.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `DecisionDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`DecisionDemo.java`

```java
import java.util.Scanner;

public class DecisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Score (0-100): ");
        int score = Integer.parseInt(scanner.nextLine());

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        System.out.print("Day number (1-7): ");
        int day = Integer.parseInt(scanner.nextLine());

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid day");
        }

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac DecisionDemo.java
java DecisionDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac DecisionDemo.java
java DecisionDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Correct grade for your score and correct day name for your day number.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 3 — Loops

**Objective**

Create `LoopsDemo.java` that prints a multiplication table with `for`, counts down with `while`, and shows a menu prompt at least once with `do-while`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-03-loops.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `LoopsDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`LoopsDemo.java`

```java
import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("Multiplication table for 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Type 'menu' to see it again, anything else to quit: ");
            choice = scanner.nextLine();
            if (choice.equals("menu")) {
                System.out.println("1) Add  2) Withdraw  3) Exit");
            }
        } while (choice.equals("menu"));

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac LoopsDemo.java
java LoopsDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac LoopsDemo.java
java LoopsDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Table prints 5x1 through 5x5, countdown prints 3 to 1, and the menu prompt appears again only after typing `menu`.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 4 — Methods

**Objective**

Create `MethodsDemo.java` with a `square` method that takes an `int` and returns its square, plus a second, overloaded `square` that takes a `double`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-04-methods.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `MethodsDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`MethodsDemo.java`

```java
public class MethodsDemo {
    public static int square(int n) {
        return n * n;
    }

    public static double square(double n) {
        return n * n;
    }

    public static void main(String[] args) {
        int intResult = square(4);
        double doubleResult = square(2.5);

        System.out.println("square(4) = " + intResult);
        System.out.println("square(2.5) = " + doubleResult);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac MethodsDemo.java
java MethodsDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac MethodsDemo.java
java MethodsDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Both calls print the correct square, and the program compiles even though two methods share the name `square`.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 5 — Personal Details

**Objective**

Create `PersonalDetails.java` that prompts for name (`String`), age (`int`), and city (`String`), then prints a formatted greeting.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-05-personal-details.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `PersonalDetails.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`PersonalDetails.java`

```java
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.printf("Hello, %s! You are %d years old and live in %s.%n",
                name, age, city);

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac PersonalDetails.java
java PersonalDetails
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac PersonalDetails.java
java PersonalDetails
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Program prompts for three values and greets with all three.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 6 — Product Information

**Objective**

Create `ProductInfo.java` that reads product name, quantity (`int`), and price (`double`), then prints the details.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-06-product-info.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `ProductInfo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`ProductInfo.java`

```java
import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.printf("Product: %s | Qty: %d | Price: %.2f%n", name, qty, price);

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac ProductInfo.java
java ProductInfo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac ProductInfo.java
java ProductInfo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Product name, quantity, and price print correctly (price with two decimals).

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 7 — Area of Circle

**Objective**

Create `CircleArea.java` that reads a radius (`double`) and prints the area using `Math.PI`, formatted to 2 decimal places.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-07-circle-area.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `CircleArea.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`CircleArea.java`

```java
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r * r;

        System.out.printf("Area: %.2f%n", area);

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac CircleArea.java
java CircleArea
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac CircleArea.java
java CircleArea
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Area matches π × r × r and prints with two decimals.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 8 — Bill Summary (challenge)

**Objective**

Create `BillSummary.java` that reads product name, quantity, and unit price; computes total, 10% discount, and final amount; prints a short bill with `%.2f`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-08-bill-summary.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `BillSummary.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`BillSummary.java`

```java
import java.util.Scanner;

public class BillSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        System.out.print("Unit price: ");
        double price = Double.parseDouble(scanner.nextLine());

        double total = qty * price;
        double discount = total * 0.10;
        double finalAmount = total - discount;

        System.out.println("--- Bill Summary ---");
        System.out.printf("Product: %s%n", name);
        System.out.printf("Quantity: %d%n", qty);
        System.out.printf("Unit price: %.2f%n", price);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Discount (10%%): %.2f%n", discount);
        System.out.printf("Final amount: %.2f%n", finalAmount);

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac BillSummary.java
java BillSummary
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac BillSummary.java
java BillSummary
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Bill shows total, discount, and final amount with two decimal places.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 9 — Personal Profile (bonus)

**Objective**

Create `PersonalProfile.java` that reads name, age, city, and hobby, then prints a simple two-column table with `printf` width specifiers.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-02-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-02/exercises/exercise-09-profile-bonus.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `PersonalProfile.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`PersonalProfile.java`

```java
import java.util.Scanner;

public class PersonalProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        String age = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        System.out.println();
        System.out.printf("%-12s | %-20s%n", "Field", "Value");
        System.out.println("-------------|---------------");
        System.out.printf("%-12s | %-20s%n", "Name", name);
        System.out.printf("%-12s | %-20s%n", "Age", age);
        System.out.printf("%-12s | %-20s%n", "City", city);
        System.out.printf("%-12s | %-20s%n", "Hobby", hobby);

        scanner.close();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac PersonalProfile.java
java PersonalProfile
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac PersonalProfile.java
java PersonalProfile
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

A readable two-column profile table with aligned fields.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 2: Beginner Guide

**Objective**

Build and verify the Module 2 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-02/lab2/LAB-2-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-2-WINDOWS.md` or `LAB-2-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/Lab2-JavaSyntax/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

The lab program compiles, runs, and matches the lab guide's sample outputs.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/Lab2-JavaSyntax/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Module 3: Object-Oriented Programming in Java

### Objective

This Module 3 lab is the consolidation after Module 3 slides and [Exercises 1–8](module-03/exercises/EXERCISES-INDEX.md). You already practiced domain modeling, encapsulation, inheritance, abstraction, interfaces, SOLID spot-checks, and mini UML in `module-03-exercises/`. Here you assemble those skills into a **menu-driven Banking Management System** with packages and a clear model / service / `Main` split.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-03-exercises/`.
- Your lab folder will be `java-bootcamp/examples/Lab3-BankingSystem/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-03-exercises | Out-Null
cd examples\module-03-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-03-exercises
cd examples/module-03-exercises
pwd
```

Expected output: the terminal location ends with `module-03-exercises`.

### Exercises

#### Exercise 1 — Identify Domain Entities

**Objective**

Create `notes.md` containing an entity table for `Customer`, `Account`, and `Transaction`. Identify useful attributes, one main responsibility, and relationships.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-01-domain-entities.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

`notes.md` contains at least three entities, useful attributes, focused responsibilities, relationships, multiplicities, and business rules.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 2 — Encapsulation Practice

**Objective**

Create `Account.java` with private balance state and validated operations. Create `EncapsulationDemo.java` to prove valid operations succeed and an invalid withdrawal is rejected.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-02-encapsulation.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Account.java`
   - `EncapsulationDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Account.java`

```java
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(
                    "Deposit rejected: amount must be positive.");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Withdrawal rejected.");
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return "Account";
    }
}
```

`EncapsulationDemo.java`

```java
public class EncapsulationDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);

        account.deposit(50.00);
        account.withdraw(30.00);
        account.withdraw(500.00);

        System.out.printf(
                "Final balance: %.2f%n", account.getBalance());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Account.java EncapsulationDemo.java
java EncapsulationDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Account.java EncapsulationDemo.java
java EncapsulationDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Valid operations change the balance; the oversized withdrawal does not. Outside code cannot directly assign `balance`.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 3 — Inheritance and Polymorphism

**Objective**

Create `SavingsAccount` and `CurrentAccount` subclasses. Override account type in both; override withdrawal in current accounts to apply a fee. Demonstrate runtime polymorphism with `Account[]`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-03-inheritance.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Account.java`
   - `SavingsAccount.java`
   - `CurrentAccount.java`
   - `InheritanceDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Account.java`

```java
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(
                    "Deposit rejected: amount must be positive.");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Withdrawal rejected.");
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return "Account";
    }
}
```

`SavingsAccount.java`

```java
public class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
```

`CurrentAccount.java`

```java
public class CurrentAccount extends Account {
    private static final double WITHDRAWAL_FEE = 2.00;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + WITHDRAWAL_FEE);
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
```

`InheritanceDemo.java`

```java
public class InheritanceDemo {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount(100.00),
            new CurrentAccount(100.00),
            new FrozenAccount(100.00)
        };

        for (Account account : accounts) {
            boolean ok = account.withdraw(20.00);
            System.out.printf("%s withdraw=%s balance=%.2f%n",
                    account.getAccountType(), ok, account.getBalance());
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java InheritanceDemo.java
java InheritanceDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java InheritanceDemo.java
java InheritanceDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

One `Account[]` holds both subclasses. The same `withdraw(20)` call produces different balances because the current account override adds a fee.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 4 — Abstract Classes

**Objective**

Turn `Account` into an `abstract class` with one abstract method, and prove it can no longer be created directly.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-04-abstract-classes.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `AbstractAccount.java`
   - `AbstractSavings.java`
   - `AbstractDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`AbstractAccount.java`

```java
public abstract class AbstractAccount {
    protected double balance;

    public AbstractAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getAccountType();
}
```

`AbstractSavings.java`

```java
public class AbstractSavings extends AbstractAccount {
    public AbstractSavings(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
```

`AbstractDemo.java`

```java
public class AbstractDemo {
    public static void main(String[] args) {
        // AbstractAccount account = new AbstractAccount(50.00); // will not compile
        AbstractAccount account = new AbstractSavings(50.00);
        System.out.println(account.getAccountType() + " balance: " + account.getBalance());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac AbstractAccount.java AbstractSavings.java AbstractDemo.java
java AbstractDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac AbstractAccount.java AbstractSavings.java AbstractDemo.java
java AbstractDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The direct-instantiation line fails to compile; the program runs once you go through the concrete `AbstractSavings` subclass instead.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 5 — Interface Practice

**Objective**

Create a `Printable` contract, implement it in `Customer`, and invoke the method through a `Printable` reference.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-05-interface.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Printable.java`
   - `Customer.java`
   - `InterfaceDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Printable.java`

```java
public interface Printable {
    void printDetails();
}
```

`Customer.java`

```java
public class Customer implements Printable {
    private final String id;
    private final String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.printf(
                "Customer %s: %s%n", id, name);
    }
}
```

`InterfaceDemo.java`

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        Printable printable =
                new Customer("C101", "Aman Singh");

        printable.printDetails();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Printable.java Customer.java InterfaceDemo.java
java InterfaceDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Printable.java Customer.java InterfaceDemo.java
java InterfaceDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The customer’s implementation runs even though the variable is declared as `Printable`.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 6 — SOLID Spot-Check: SRP

**Objective**

Refactor one method that mixes interest calculation and console formatting. Create `SolidDemo.java` with separate calculation and display methods.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-06-solid-check.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `SolidDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`SolidDemo.java`

```java
public class SolidDemo {
    static double calculateInterest(
            double balance, double ratePercent) {
        return balance * ratePercent / 100.0;
    }

    static void printInterest(double interest) {
        System.out.printf(
                "Interest earned: %.2f%n", interest);
    }

    public static void main(String[] args) {
        double interest =
                calculateInterest(10_000, 5);
        printInterest(interest);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac SolidDemo.java
java SolidDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac SolidDemo.java
java SolidDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The program prints `500.00`; calculation has no `System.out`, and display code does not contain the interest formula.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 7 — SOLID Spot-Check: OCP, LSP, ISP, DIP

**Objective**

For each remaining SOLID principle, write one short justification and prove LSP
with a working `FrozenAccount` that runs inside the existing polymorphic loop.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-07-solid-beyond-srp.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `SolidDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`SolidDemo.java`

```java
public class SolidDemo {
    static double calculateInterest(
            double balance, double ratePercent) {
        return balance * ratePercent / 100.0;
    }

    static void printInterest(double interest) {
        System.out.printf(
                "Interest earned: %.2f%n", interest);
    }

    public static void main(String[] args) {
        double interest =
                calculateInterest(10_000, 5);
        printInterest(interest);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac SolidDemo.java
java SolidDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac SolidDemo.java
java SolidDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

`FrozenAccount` compiles and runs inside the same loop with no special-casing,
and you have one written sentence for each remaining SOLID principle.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 8 — Mini UML Class Diagram

**Objective**

Create `banking-uml.md` with a Mermaid class diagram showing:

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-03-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-03/exercises/exercise-08-uml-mini.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-03-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

The rendered diagram matches your code and clearly distinguishes inheritance, interface realization, and associations.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 3: Beginner Guide

**Objective**

Build and verify the Module 3 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-03/lab3/LAB-3-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-3-WINDOWS.md` or `LAB-3-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/Lab3-BankingSystem/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

The lab program compiles, runs, and matches the lab guide's sample outputs.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/Lab3-BankingSystem/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Module 4: Memory Management and Performance

### Objective

This Module 4 lab is the consolidation after Module 4 slides and [Exercises 1–7](module-04/exercises/EXERCISES-INDEX.md). You already practiced stack/heap, lifecycle, GC observation, G1/ZGC flags, retention, and StringBuilder cost in `module-04-exercises/`. Here you assemble those skills into a **shared-monitor demo suite** with leak/fix, weak references, performance table, and optional laptop tools.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-04-exercises/`.
- Your lab folder will be `java-bootcamp/examples/Lab4-MemoryManagement/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-04-exercises | Out-Null
cd examples\module-04-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-04-exercises
cd examples/module-04-exercises
pwd
```

Expected output: the terminal location ends with `module-04-exercises`.

### Exercises

#### Exercise 1 — Stack vs Heap Basics

**Objective**

Create `StackHeapDemo.java`, run it, then trace which values belong to method stack frames and which object lives on the heap.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-01-stack-vs-heap.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `StackHeapDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`StackHeapDemo.java`

```java
public class StackHeapDemo {
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    static void printPerson(Person person) {
        // Local primitive in the printPerson stack frame
        int nameLength = person.name.length();
        System.out.printf("%s has %d letters.%n",
                person.name, nameLength);
    }

    public static void main(String[] args) {
        // Primitive value belongs to main's frame
        int count = 1;

        // Reference is local; new Person object is on the heap
        Person person = new Person("Aman");

        printPerson(person);
        System.out.println("Count: " + count);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac StackHeapDemo.java
java StackHeapDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac StackHeapDemo.java
java StackHeapDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Program prints two lines, and your notes distinguish a local reference from the heap object it points to.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 2 — Object Lifecycle and Reachability

**Objective**

Create one object with two references. Remove references one at a time and explain when the object becomes **eligible** for garbage collection.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-02-lifecycle.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `ObjectLifecycleDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`ObjectLifecycleDemo.java`

```java
public class ObjectLifecycleDemo {
    static class Person {
        final String name;

        Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person first = new Person("Aman"); // create + reference
        Person alias = first;              // second reference, same object

        System.out.println(
                "Same object: " + (first == alias));

        first = null; // object remains reachable through alias
        System.out.println(
                "Still reachable through alias: " + alias.name);

        alias = null; // no strong references remain
        System.out.println(
                "No strong references remain; object is GC-eligible.");

        System.gc();  // request only; JVM may ignore or delay it
        System.out.println("GC requested, not guaranteed.");
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac ObjectLifecycleDemo.java
java ObjectLifecycleDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac ObjectLifecycleDemo.java
java ObjectLifecycleDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

You can explain the difference between removing one alias, losing all strong references, becoming GC-eligible, and actually being collected.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 3 — Garbage Collection in Action

**Objective**

Create `GcObserve.java`, run it with a bounded heap and unified GC logging, and identify evidence that the JVM reclaimed temporary allocations.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-03-gc-observe.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `GcObserve.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`GcObserve.java`

```java
public class GcObserve {
    public static void main(String[] args) {
        long checksum = 0;

        for (int round = 1; round <= 20; round++) {
            // About 12.5 MB per temporary batch.
            byte[][] batch = new byte[200][];

            for (int i = 0; i < batch.length; i++) {
                batch[i] = new byte[64 * 1024];
                checksum += batch[i].length;
            }

            if (round % 5 == 0) {
                System.out.println(
                        "Completed round " + round);
            }

            // On the next iteration, this batch can become unreachable.
        }

        System.out.println(
                "Allocated bytes over time: " + checksum);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac GcObserve.java
java GcObserve
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac GcObserve.java
java GcObserve
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The program reaches round 20, reports `262144000` allocated bytes over time, and GC log entries appear.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 4 — Select and Verify G1

**Objective**

Select the G1 garbage collector explicitly, verify the JVM accepted it, and explain what the flag does—and does not do.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-04-g1.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

The JVM starts successfully, prints `Using G1`, and the bounded allocation program completes.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 5 — Select and Verify ZGC

**Objective**

Select the ZGC garbage collector explicitly, verify the JVM accepted it, and contrast what you see in the log with Exercise 4's G1 run.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-05-zgc.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

The JVM starts successfully, prints `Using The Z Garbage Collector`, and the bounded allocation program completes — with a visibly different collector log shape than the G1 run in Exercise 4.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 6 — Retained References (Safe Leak Sketch)

**Objective**

Create `RetentionDemo.java`, observe a static collection retaining objects, then clear the collection and explain why those objects become GC-eligible.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-06-leak-sketch.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `RetentionDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`RetentionDemo.java`

```java
import java.util.ArrayList;
import java.util.List;

public class RetentionDemo {
    // Static field is reachable from the loaded class (a GC root path).
    private static final List<byte[]> CACHE =
            new ArrayList<>();

    static long usedMb() {
        Runtime runtime = Runtime.getRuntime();
        long usedBytes =
                runtime.totalMemory() - runtime.freeMemory();
        return usedBytes / (1024 * 1024);
    }

    public static void main(String[] args)
            throws InterruptedException {
        System.out.println("Before: " + usedMb() + " MB");

        // Bounded: 10,000 × 1 KB ≈ 10 MB payload.
        for (int i = 0; i < 10_000; i++) {
            CACHE.add(new byte[1024]);
        }

        System.out.println(
                "Retained objects: " + CACHE.size());
        System.out.println(
                "After allocation: " + usedMb() + " MB");

        // Remove the strong references held by the list.
        CACHE.clear();
        System.gc();       // request, not a guarantee
        Thread.sleep(200); // observation aid, not synchronization with GC

        System.out.println(
                "After clear (approx): " + usedMb() + " MB");
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac RetentionDemo.java
java RetentionDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac RetentionDemo.java
java RetentionDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The list reaches exactly 10,000 entries, memory usage rises approximately, and clearing the list removes the retaining references. Post-GC memory is observational and nondeterministic.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 7 — String vs StringBuilder

**Objective**

Create `StringBuilderComparison.java` and compare repeated immutable `String` concatenation with mutable `StringBuilder`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-04-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-04/exercises/exercise-07-string-vs-builder.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `StringBuilderComparison.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`StringBuilderComparison.java`

```java
public class StringBuilderComparison {
    private static final int ITERATIONS = 50_000;

    static String withString() {
        String result = "";
        for (int i = 0; i < ITERATIONS; i++) {
            // Each update creates another String result.
            result += "x";
        }
        return result;
    }

    static String withBuilder() {
        // Initial capacity avoids repeated buffer growth.
        StringBuilder result =
                new StringBuilder(ITERATIONS);
        for (int i = 0; i < ITERATIONS; i++) {
            result.append('x');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        String stringResult = withString();
        long stringNanos = System.nanoTime() - start;

        start = System.nanoTime();
        String builderResult = withBuilder();
        long builderNanos = System.nanoTime() - start;

        System.out.printf(
                "String: %d chars, %.3f ms%n",
                stringResult.length(),
                stringNanos / 1_000_000.0);
        System.out.printf(
                "StringBuilder: %d chars, %.3f ms%n",
                builderResult.length(),
                builderNanos / 1_000_000.0);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac StringBuilderComparison.java
java StringBuilderComparison
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac StringBuilderComparison.java
java StringBuilderComparison
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Both methods produce 50,000 characters. Across repeated runs, `StringBuilder` should usually be substantially faster for this workload.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 4: Beginner Guide

**Objective**

Build and verify the Module 4 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-04/lab4/LAB-4-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-4-WINDOWS.md` or `LAB-4-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/Lab4-MemoryManagement/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

1. `javac *.java` succeeds with no errors.
2. `StackExample` shows nested frames and return to `main`.
3. `HeapExample` prints distinct identity hashes for different objects.
4. `GarbageCollectionDemo` shows After Allocation used memory ≥ Before; After GC often lower (not guaranteed for tiny leftovers).
5. `-Xlog:gc` includes collector / `GC(...)` style lines.
6. `MemoryLeakDemo leak` rises; `fix` recovers after clear + GC theme.
7. `PerformanceTest` table has five object-count rows.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/Lab4-MemoryManagement/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Module 5: Java Collections Framework

### Objective

This Module 5 lab is the consolidation after Module 5 slides and [Exercises 1–7](module-05/exercises/EXERCISES-INDEX.md). You already practiced List, Set, Map, TreeMap, safe iteration, collection choice, and a library warm-up in `module-05-exercises/`. Here you assemble those skills into a **Library Management System** console with packages, domain types, and a full staff menu.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-05-exercises/`.
- Your lab folder will be `java-bootcamp/examples/Lab5-LibraryManagement/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-05-exercises | Out-Null
cd examples\module-05-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-05-exercises
cd examples/module-05-exercises
pwd
```

Expected output: the terminal location ends with `module-05-exercises`.

### Exercises

#### Exercise 1 — Working with `ArrayList`

**Objective**

Create `ArrayListDemo.java` and practice ordered CRUD: add, update, search, remove, index access, and iteration.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-01-arraylist.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `ArrayListDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`ArrayListDemo.java`

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();

        books.add("Java Fundamentals");
        books.add("Clean Code");
        books.add("Effective Java");
        books.add("Java Fundamentals");

        books.set(1, "Clean Architecture");

        boolean found = books.contains("Effective Java");

        books.remove("Java Fundamentals");

        System.out.println(
                "Found Effective Java: " + found);
        System.out.println("Size: " + books.size());

        for (int i = 0; i < books.size(); i++) {
            System.out.printf(
                    "%d: %s%n", i, books.get(i));
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac ArrayListDemo.java
java ArrayListDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac ArrayListDemo.java
java ArrayListDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The final list has three ordered entries. One duplicate remains because only the first matching title was removed.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 2 — Working with `HashSet`

**Objective**

Create `SetDemo.java`, prove duplicate rejection with `add`’s return value, and create a sorted `TreeSet` view.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-02-hashset.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `SetDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`SetDemo.java`

```java
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> categories = new HashSet<>();

        System.out.println(
                "Added Java first time: "
                + categories.add("Java"));

        categories.add("Testing");
        categories.add("Databases");

        System.out.println(
                "Added Java second time: "
                + categories.add("Java"));

        System.out.println(
                "Unique count: " + categories.size());
        System.out.println(
                "Contains Testing: "
                + categories.contains("Testing"));

        System.out.println(
                "Sorted view: "
                + new TreeSet<>(categories));
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac SetDemo.java
java SetDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac SetDemo.java
java SetDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The set contains three unique categories; the duplicate add returns `false`; `TreeSet` prints them sorted.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 3 — Working with `HashMap`

**Objective**

Create `MapDemo.java` using ISBN-like strings as keys and copy counts as values. Practice put, get, update, remove, default lookup, and entry iteration.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-03-hashmap.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `MapDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`MapDemo.java`

```java
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> copies = new HashMap<>();

        copies.put("ISBN-JAVA", 3);
        copies.put("ISBN-CLEAN", 2);
        copies.put("ISBN-TEST", 4);

        System.out.println(
                "Java copies: " + copies.get("ISBN-JAVA"));

        copies.put("ISBN-JAVA", 5);
        copies.remove("ISBN-CLEAN");

        System.out.println(
                "Updated Java copies: "
                + copies.get("ISBN-JAVA"));
        System.out.println(
                "Missing ISBN: "
                + copies.getOrDefault("ISBN-MISSING", 0));

        for (Map.Entry<String, Integer> entry
                : copies.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(
                "Sorted snapshot: " + new TreeMap<>(copies));
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac MapDemo.java
java MapDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac MapDemo.java
java MapDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The Java count updates to `5`, the clean-code key is removed, and the sorted snapshot contains two mappings.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 4 — Sorted Collections: `TreeMap`

**Objective**

Create `SortedMapDemo.java`, store book prices in a `HashMap`, then build a `TreeMap` from it and compare iteration order.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-04-sorted-collections.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `SortedMapDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`SortedMapDemo.java`

```java
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("The Hobbit", 12.99);
        prices.put("Dune", 15.50);
        prices.put("Annihilation", 9.99);

        System.out.println("HashMap order: " + prices.keySet());

        Map<String, Double> sortedPrices = new TreeMap<>(prices);
        System.out.println("TreeMap order: " + sortedPrices.keySet());

        TreeMap<String, Double> tree = new TreeMap<>(prices);
        System.out.println("First title: " + tree.firstKey());
        System.out.println("Last title: " + tree.lastKey());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac SortedMapDemo.java
java SortedMapDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac SortedMapDemo.java
java SortedMapDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

`TreeMap` prints titles alphabetically and reports the correct first/last title; `HashMap` order is not relied upon anywhere in your notes.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 5 — Safe Removal During Iteration

**Objective**

Create `IteratorDemo.java` and safely remove matching titles through the active `Iterator`.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-05-iteration.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `IteratorDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`IteratorDemo.java`

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> titles = new ArrayList<>(List.of(
                "Java 21",
                "Deprecated Java 8 Notes",
                "Clean Code",
                "Deprecated API Guide"
        ));

        Iterator<String> iterator = titles.iterator();

        while (iterator.hasNext()) {
            String title = iterator.next();

            if (title.startsWith("Deprecated")) {
                iterator.remove();
            }
        }

        System.out.println("Remaining: " + titles);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac IteratorDemo.java
java IteratorDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac IteratorDemo.java
java IteratorDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Both deprecated titles are removed without `ConcurrentModificationException`.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 6 — Choose the Right Collection

**Objective**

Create `collection-choices.md`. For each scenario, choose an interface and implementation, then explain order, duplicates, lookup pattern, and mutation needs.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-06-choose-collection.md`.
4. Create the file requested by the exercise.
5. Follow the exercise's design or written-answer instructions.
6. Save the file before compiling or marking the exercise complete.

**Complete File Contents**

This exercise is analysis-only or intentionally open-ended. The complete required content is the table, notes, or diagram requested in the exercise file.

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
Get-ChildItem
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
ls
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `Get-ChildItem` or `ls` lists the folder so you can verify the requested notes, diagram, or design file exists.
- No Java compile command is required for this exercise unless the original exercise file asks you to create Java code.

**Expected Output**

Six choices match the domain requirement, and every explanation mentions the relevant property rather than saying only “it is faster.”

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 7 — Library Collections Warm-up

**Objective**

Create `LibraryWarmup.java` with:

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-05-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-05/exercises/exercise-07-library-warmup.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `LibraryWarmup.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`LibraryWarmup.java`

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryWarmup {
    private final List<String> availableTitles =
            new ArrayList<>();
    private final Map<String, String> borrowedByMember =
            new HashMap<>();

    public LibraryWarmup() {
        availableTitles.add("Effective Java");
        availableTitles.add("Clean Code");
    }

    boolean checkout(String memberId, String title) {
        if (borrowedByMember.containsKey(memberId)) {
            return false;
        }

        if (!availableTitles.remove(title)) {
            return false;
        }

        borrowedByMember.put(memberId, title);
        return true;
    }

    void printStatus() {
        System.out.println(
                "Available: " + availableTitles);
        System.out.println(
                "Borrowed: " + borrowedByMember);
    }

    public static void main(String[] args) {
        LibraryWarmup library = new LibraryWarmup();

        System.out.println(
                "Checkout success: "
                + library.checkout(
                        "M101", "Effective Java"));

        System.out.println(
                "Duplicate checkout: "
                + library.checkout(
                        "M101", "Clean Code"));

        library.printStatus();
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac LibraryWarmup.java
java LibraryWarmup
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac LibraryWarmup.java
java LibraryWarmup
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

First checkout succeeds, the same member’s second checkout fails, and the title appears in exactly one current-state structure.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 5: Beginner Guide

**Objective**

Build and verify the Module 5 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-05/lab5/LAB-5-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-5-WINDOWS.md` or `LAB-5-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/Lab5-LibraryManagement/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

1. Menu shows options; invalid `abc` → invalid message → menu returns.
2. Add book `101` / member `1` / borrow / reports match the sample themes above.
3. Duplicate book ID `101` → `Book already exists.`
4. Display books shows at least one iteration style with your title.
5. Sort by title changes order when multiple books exist.
6. Category insights list `Programming` after the sample add.
7. Exit `11` → `Thank You` and process ends.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/Lab5-LibraryManagement/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Module 6: Streams and Functional Programming

### Objective

This Module 6 lab is the consolidation after Module 6 slides and [Exercises 1–7](module-06/exercises/EXERCISES-INDEX.md) (Exercise 8 parallel bonus recommended). You already practiced lambdas, filter/map/sort, min/max, grouping, and composed pipelines on a small flat dataset. Here you assemble those skills into an **Employee Analytics System** with 25 employees, a service layer, dashboard, and menu.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-06-exercises/`.
- Your lab folder will be `java-bootcamp/examples/Lab6-EmployeeAnalytics/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-06-exercises | Out-Null
cd examples\module-06-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-06-exercises
cd examples/module-06-exercises
pwd
```

Expected output: the terminal location ends with `module-06-exercises`.

### Exercises

#### Exercise 1 — Lambda and a Custom Functional Interface

**Objective**

Create a five-employee dataset, declare a custom functional interface with one
abstract method, and implement the same salary rule with an anonymous class and
a lambda.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-01-lambda-functional-interface.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `SalaryCheck.java`
   - `LambdaDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`SalaryCheck.java`

```java
@FunctionalInterface
public interface SalaryCheck {
    boolean test(Employee employee);
}
```

`LambdaDemo.java`

```java
public class LambdaDemo {
    public static void main(String[] args) {
        Employee alice = EmployeeData.sample().get(0);

        SalaryCheck anonymous = new SalaryCheck() {
            @Override
            public boolean test(Employee employee) {
                return employee.salary() > 60_000;
            }
        };

        SalaryCheck lambda = employee -> employee.salary() > 60_000;

        System.out.println("Employee: " + alice.name());
        System.out.println("Anonymous result: " + anonymous.test(alice));
        System.out.println("Lambda result: " + lambda.test(alice));
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java SalaryCheck.java LambdaDemo.java
java LambdaDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java SalaryCheck.java LambdaDemo.java
java LambdaDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Four source files compile. The anonymous class and lambda produce identical
results for both tested thresholds.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 2 — Filter Employees by Salary

**Objective**

Create `FilterSalaryDemo.java` and use `filter` to select employees whose
salary is greater than 60,000 without changing the source list.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-02-filter-salary.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `FilterSalaryDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`FilterSalaryDemo.java`

```java
import java.util.List;

public class FilterSalaryDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        List<Employee> highEarners = employees.stream()
                .filter(employee -> employee.salary() > 60_000)
                .toList();

        System.out.println("Employees above 60000:");
        highEarners.forEach(employee ->
                System.out.printf("%s - %.0f%n",
                        employee.name(), employee.salary()));

        System.out.println("Source size: " + employees.size());
        System.out.println("Filtered size: " + highEarners.size());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java FilterSalaryDemo.java
java FilterSalaryDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java FilterSalaryDemo.java
java FilterSalaryDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The filtered list contains Alice, Bob, Charlie, and Diana. Evan is excluded,
and the original source list still contains five employees.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 3 — Map Employees to Names

**Objective**

Create `NamesDemo.java`. Transform each `Employee` into a `String` name with
`map`, collect the names, and print them with a method reference.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-03-list-names.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `NamesDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`NamesDemo.java`

```java
import java.util.List;

public class NamesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        List<String> names = employees.stream()
                .map(Employee::name)
                .toList();

        System.out.println("Employee names:");
        names.forEach(System.out::println);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java NamesDemo.java
java NamesDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java NamesDemo.java
java NamesDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

All five employees produce exactly five names. The method-reference and lambda
versions give the same result.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 4 — Find the Highest and Lowest Salary

**Objective**

Create `SalaryExtremesDemo.java`. Use one salary comparator with `max` and
`min`, then handle each potentially empty result explicitly.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-04-minmax.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `SalaryExtremesDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`SalaryExtremesDemo.java`

```java
import java.util.Comparator;
import java.util.List;

public class SalaryExtremesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        Comparator<Employee> bySalary =
                Comparator.comparingDouble(Employee::salary);

        Employee highest = employees.stream()
                .max(bySalary)
                .orElseThrow();

        Employee lowest = employees.stream()
                .min(bySalary)
                .orElseThrow();

        System.out.printf("Highest: %s - %.0f%n",
                highest.name(), highest.salary());
        System.out.printf("Lowest: %s - %.0f%n",
                lowest.name(), lowest.salary());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java SalaryExtremesDemo.java
java SalaryExtremesDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java SalaryExtremesDemo.java
java SalaryExtremesDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Diana is the maximum-salary employee and Evan is the minimum-salary employee.
You can explain why the terminal operations return `Optional<Employee>`.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 5 — Map a 10% Salary Raise

**Objective**

Create `RaiseDemo.java`. Transform every salary into a proposed value that is
10% higher while proving that the immutable source employees are unchanged.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-05-map-raise.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `RaiseDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`RaiseDemo.java`

```java
import java.util.List;

public class RaiseDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        List<Double> proposedSalaries = employees.stream()
                .map(employee -> employee.salary() * 1.10)
                .toList();

        System.out.println("Proposed salaries:");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            double proposed = proposedSalaries.get(i);
            System.out.printf("%s: %.2f -> %.2f%n",
                    employee.name(), employee.salary(), proposed);
        }

        System.out.printf("Alice original salary: %.2f%n",
                employees.get(0).salary());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java RaiseDemo.java
java RaiseDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java RaiseDemo.java
java RaiseDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Five proposed salaries print in employee order, every proposal is exactly 10%
higher, and Alice's original salary remains 72,000.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 6 — Count Employees by Department

**Objective**

Create `DepartmentCountDemo.java`. Group employees by department, count each
group, and print the report in deterministic alphabetical key order.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-06-group-count.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `DepartmentCountDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`DepartmentCountDemo.java`

```java
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DepartmentCountDemo {
    public static void main(String[] args) {
        Map<String, Long> counts = EmployeeData.sample().stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.counting()));

        Map<String, Long> sortedCounts = new TreeMap<>(counts);

        sortedCounts.forEach((department, count) ->
                System.out.println(department + ": " + count));
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java DepartmentCountDemo.java
java DepartmentCountDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java DepartmentCountDemo.java
java DepartmentCountDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The report prints Finance 1, HR 2, and IT 2 in alphabetical department order.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 7 — Compose a Pipeline for HR Names

**Objective**

Create `HrNamesDemo.java`. Compose `filter`, `map`, `sorted`, and `toList` to
produce an alphabetized list of names for employees in HR.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-07-hr-names.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `HrNamesDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`HrNamesDemo.java`

```java
import java.util.List;

public class HrNamesDemo {
    public static void main(String[] args) {
        List<String> hrNames = EmployeeData.sample().stream()
                .filter(employee -> employee.department().equals("HR"))
                .map(Employee::name)
                .sorted()
                .toList();

        System.out.println("HR names: " + hrNames);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java HrNamesDemo.java
java HrNamesDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java HrNamesDemo.java
java HrNamesDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The final list contains only Alice and Charlie in alphabetical order.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 8 — `parallelStream` Correctness Bonus

**Objective**

Create `ParallelStreamDemo.java`. Run the same stateless count with `stream`
and `parallelStream`, verify identical results, and explain why one small timing
run is not a benchmark.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-06-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-06/exercises/exercise-08-parallel-bonus.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `Employee.java`
   - `EmployeeData.java`
   - `ParallelStreamDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`Employee.java`

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

`EmployeeData.java`

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

`ParallelStreamDemo.java`

```java
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        long sequentialStart = System.nanoTime();
        long sequentialCount = employees.stream()
                .filter(employee -> employee.salary() > 60_000)
                .count();
        long sequentialNanos = System.nanoTime() - sequentialStart;

        long parallelStart = System.nanoTime();
        long parallelCount = employees.parallelStream()
                .filter(employee -> employee.salary() > 60_000)
                .count();
        long parallelNanos = System.nanoTime() - parallelStart;

        System.out.println("Sequential count: " + sequentialCount);
        System.out.println("Parallel count: " + parallelCount);
        System.out.println("Available processors: "
                + Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential ns: " + sequentialNanos);
        System.out.println("Parallel ns: " + parallelNanos);
        System.out.println("Timing conclusion: none from one tiny run");
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java ParallelStreamDemo.java
java ParallelStreamDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java ParallelStreamDemo.java
java ParallelStreamDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Sequential and parallel pipelines both return 4. Timings vary, and your notes
state that the exercise demonstrates correctness—not a performance win.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 6: Beginner Guide

**Objective**

Build and verify the Module 6 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-06/lab6/LAB-6-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-6-WINDOWS.md` or `LAB-6-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/Lab6-EmployeeAnalytics/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

1. Menu 1–9 appears; invalid `abc` → invalid message → menu returns.
2. Choice `1` lists all employees; total matches seed size (25 in solution data).
3. Choice `2` prints each department with employee names indented.
4. Choice `3` shows reductions, summarizing stats, and true/false salary partition.
5. Choice `4` lists performers with rating ≥ 4.
6. Choice `5` prints highest paid via Optional path (John Smith with solution seed).
7. Choice `6` prints per-department count / avg / max / min.
8. Choice `7` lists only active employees.
9. Choice `8` dashboard matches sample shape (employees, salaries, top 5, active/inactive).
10. Choice `9` prints `Thank You`; recompile after edits to avoid stale `.class` files.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/Lab6-EmployeeAnalytics/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Module 7: Exception Handling and Error Management

### Objective

This Module 7 lab is the consolidation after Module 7 slides and [Exercises 1–8](module-07/exercises/EXERCISES-INDEX.md). You already practiced catching common exceptions, `try-catch-finally`, try-with-resources, `throw`/`throws`, custom exceptions, propagation, retry/fallback, and logging in `module-07-exercises/`. Here you assemble those skills into a fault-tolerant **ATM Banking System**.

### Prerequisites

- Lab 0 is complete.
- JDK 21 works from the terminal.
- Your exercise folder will be `java-bootcamp/examples/module-07-exercises/`.
- Your lab folder will be `java-bootcamp/examples/Lab7-ATMSystem/`.

### Create the Exercise Folder

#### Windows PowerShell

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-07-exercises | Out-Null
cd examples\module-07-exercises
Get-Location
```

#### macOS Terminal

```bash
cd ~/java-bootcamp
mkdir -p examples/module-07-exercises
cd examples/module-07-exercises
pwd
```

Expected output: the terminal location ends with `module-07-exercises`.

### Exercises

#### Exercise 1 — Recognize Common Unchecked Exceptions

**Objective**

Create `CommonExceptionsDemo.java`. Trigger three common runtime exceptions in
isolated blocks, catch each specifically, and prove `main` continues.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-01-common-exceptions.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `CommonExceptionsDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`CommonExceptionsDemo.java`

```java
public class CommonExceptionsDemo {
    public static void main(String[] args) {
        try {
            int divisor = 0;
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        try {
            int[] values = {10, 20};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(
                    "Caught: " + ex.getClass().getSimpleName());
        }

        System.out.println("Program continued.");
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac CommonExceptionsDemo.java
java CommonExceptionsDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac CommonExceptionsDemo.java
java CommonExceptionsDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

All three exception types print, followed by `Program continued.`

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 2 — `try-catch-finally`

**Objective**

Create `FinallyDemo.java` and compare successful and failed transfer paths.
Confirm cleanup runs after both.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-02-try-catch-finally.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `FinallyDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`FinallyDemo.java`

```java
public class FinallyDemo {
    static void transfer(boolean fail) {
        System.out.println("Transfer started.");

        try {
            if (fail) {
                throw new IllegalStateException(
                        "Transfer service unavailable");
            }
            System.out.println("Transfer completed.");
        } catch (IllegalStateException ex) {
            System.out.println(
                    "Handled: " + ex.getMessage());
        } finally {
            System.out.println(
                    "Cleanup: release transfer session.");
        }
    }

    public static void main(String[] args) {
        transfer(false);
        System.out.println("---");
        transfer(true);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac FinallyDemo.java
java FinallyDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac FinallyDemo.java
java FinallyDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The cleanup line appears exactly twice—once after each path.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 3 — Try-With-Resources

**Objective**

Create and read a small `transactions.txt` file using `BufferedReader` in
try-with-resources—without calling `close()` manually.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-03-try-with-resources.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `TryWithResourcesDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`TryWithResourcesDemo.java`

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        Path file = Path.of("transactions.txt");

        try {
            Files.writeString(
                    file, "deposit 100\nwithdraw 25\n");

            try (BufferedReader reader =
                    Files.newBufferedReader(file)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                }
            }

            System.out.println(
                    "Reader closed automatically.");
        } catch (IOException ex) {
            System.out.println(
                    "File error: " + ex.getMessage());
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac TryWithResourcesDemo.java
java TryWithResourcesDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac TryWithResourcesDemo.java
java TryWithResourcesDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Both transaction lines print, and the resource scope clearly controls reader
lifetime.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 4 — `throw` vs `throws`

**Objective**

Create `ThrowThrowsDemo.java` to distinguish actively throwing an exception
from declaring that a method may propagate one.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-04-throw-throws.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `ThrowThrowsDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`ThrowThrowsDemo.java`

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowThrowsDemo {
    static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }
    }

    static String loadPolicy(Path path)
            throws IOException {
        return Files.readString(path);
    }

    public static void main(String[] args) {
        try {
            validateAmount(-10);
        } catch (IllegalArgumentException ex) {
            System.out.println(
                    "Validation: " + ex.getMessage());
        }

        try {
            loadPolicy(Path.of("missing-policy.txt"));
        } catch (IOException ex) {
            System.out.println(
                    "Policy file unavailable; "
                    + "caller handled IOException.");
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac ThrowThrowsDemo.java
java ThrowThrowsDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac ThrowThrowsDemo.java
java ThrowThrowsDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Both failures are handled, and you can point to `throw` in a body versus
`throws` in a signature.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 5 — Custom Checked Exception

**Objective**

Model insufficient balance as a meaningful checked domain exception. Preserve
balance and requested amount as structured context.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-05-custom-exception.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `InsufficientFundsException.java`
   - `Account.java`
   - `CustomExceptionDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`InsufficientFundsException.java`

```java
public class InsufficientFundsException
        extends Exception {
    private final double balance;
    private final double requested;

    public InsufficientFundsException(
            double balance, double requested) {
        super(("Insufficient funds: balance=%.2f, "
                + "requested=%.2f")
                .formatted(balance, requested));
        this.balance = balance;
        this.requested = requested;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequested() {
        return requested;
    }
}
```

`Account.java`

```java
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    balance, amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

`CustomExceptionDemo.java`

```java
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);

        try {
            account.withdraw(150.00);
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
            System.out.printf("Short by: %.2f%n",
                    ex.getRequested() - ex.getBalance());
        }

        System.out.printf("Balance unchanged: %.2f%n",
                account.getBalance());
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac InsufficientFundsException.java Account.java CustomExceptionDemo.java
java CustomExceptionDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac InsufficientFundsException.java Account.java CustomExceptionDemo.java
java CustomExceptionDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

The exception carries useful domain context, caller recovery is enforced, and
failed withdrawal does not mutate balance.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 6 — Exception Propagation

**Objective**

Trace a checked exception from account layer → service layer → menu layer →
`main`, catching it only at the recovery boundary.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-06-propagation.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `PropagationDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`PropagationDemo.java`

```java
public class PropagationDemo {
    static void accountLayer()
            throws InsufficientFundsException {
        throw new InsufficientFundsException(
                100.00, 150.00);
    }

    static void serviceLayer()
            throws InsufficientFundsException {
        accountLayer();
    }

    static void menuLayer()
            throws InsufficientFundsException {
        serviceLayer();
    }

    public static void main(String[] args) {
        try {
            menuLayer();
        } catch (InsufficientFundsException ex) {
            System.out.println(
                    "Caught at main: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac PropagationDemo.java
java PropagationDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac PropagationDemo.java
java PropagationDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Stack trace order shows where the exception was thrown and the call path back
to the catching boundary.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 7 — Error Handling Strategies

**Objective**

Implement two of the six error-handling strategies — **Retry** and
**Fallback / Default** — around a flaky operation, and explain when you would
reach for the other four.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-07-error-strategies.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `StrategyDemo.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`StrategyDemo.java`

```java
import java.util.Random;

public class StrategyDemo {
    static final Random random = new Random();

    static int fetchBalance() {
        if (random.nextInt(3) == 0) {
            throw new IllegalStateException(
                    "Service temporarily unavailable");
        }
        return 500;
    }

    static int fetchWithRetry(int maxAttempts) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                return fetchBalance();
            } catch (IllegalStateException ex) {
                System.out.println(
                        "Attempt " + attempt
                        + " failed: " + ex.getMessage());
                if (attempt == maxAttempts) {
                    System.out.println(
                            "Retries exhausted, falling back to default.");
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int balance = fetchWithRetry(3);
        System.out.println("Balance shown to user: " + balance);
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac StrategyDemo.java
java StrategyDemo
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac StrategyDemo.java
java StrategyDemo
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

`fetchWithRetry` recovers on most runs after 1–2 attempts, falls back to `0`
when all attempts fail, and you have one real-world sentence for each of the
four unimplemented strategies.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

#### Exercise 8 — Contextual Logging Warm-up

**Objective**

Log operational context and the exception stack trace while showing the user a
short, safe message.

**Step-by-Step Instructions**

1. Open your IDE.
2. Open the folder `java-bootcamp/examples/module-07-exercises`.
3. Open the original exercise instructions at `labs/Week 1 - Java and JVM Foundations/module-07/exercises/exercise-08-logging-warmup.md`.
4. Create or modify the following file(s) in the exercise folder:

   - `LoggingWarmup.java`

5. Read the explanation in the exercise file first. Then type the code yourself. Use the complete code below only to verify your work or recover if stuck.

**Complete File Contents**

`LoggingWarmup.java`

```java
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingWarmup {
    private static final Logger LOGGER =
            Logger.getLogger(
                    LoggingWarmup.class.getName());

    public static void main(String[] args) {
        String accountId = "A-1001";

        try {
            throw new IllegalStateException(
                    "Withdrawal service unavailable");
        } catch (IllegalStateException ex) {
            LOGGER.log(
                    Level.SEVERE,
                    "Withdrawal failed accountId="
                            + accountId,
                    ex);

            System.out.println(
                    "User message: Withdrawal "
                    + "could not be completed.");
        }
    }
}
```

**Commands**

Windows PowerShell:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac LoggingWarmup.java
java LoggingWarmup
```

macOS Terminal:

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac LoggingWarmup.java
java LoggingWarmup
```

**Explanation**

- `cd` moves the terminal into the folder containing your exercise files.
- `javac` compiles the listed `.java` files into `.class` files.
- `java` runs the compiled class that contains `public static void main(String[] args)`.

**Expected Output**

Diagnostic output includes account context and the exception; user output
remains concise.

**Verification**

- The terminal returns to a prompt without errors.
- A `.class` file exists for each compiled `.java` file when Java code is part of the exercise.
- The printed output, notes, table, or diagram matches the expected output or written instructions.

[Look at this on your screen — do not capture a screenshot]

#### Checkpoint

Before moving on, confirm this exercise is complete:

- The expected files are in the expected folder.
- The command ran from the correct folder.
- The output matches the expected output or explanation.
- You can explain the main idea in your own words.

#### Common Mistakes

- Creating the file in the course `labs/` folder instead of your personal `java-bootcamp/examples/` folder.
- Forgetting the `.java` file extension.
- Running `java File.java` instead of compiling first with `javac` and then running `java ClassName`.
- Running a command from the wrong terminal folder.
- Copying code but leaving `_____` or `// TODO` placeholders in the file.

#### Troubleshooting

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| `javac: command not found` | JDK is missing or not on PATH | Reopen the terminal and redo Lab 0 JDK setup |
| `file not found` | Terminal is in the wrong folder | Run `pwd` or `Get-Location`, then `cd` to the exercise/lab folder |
| `Could not find or load main class` | Class name, classpath, or compile step is wrong | Compile again, then run `java ClassName` without `.java` or `.class` |
| `illegal start of expression` | Placeholder text or broken Java syntax remains | Replace every placeholder with real Java code |

### Lab 7: Beginner Guide

**Objective**

Build and verify the Module 7 lab project.

**Step-by-Step Instructions**

1. Open the full lab guide: `labs/Week 1 - Java and JVM Foundations/module-07/lab7/LAB-7-GUIDE.md`.
2. Open the OS-specific how-to in the same folder: `LAB-7-WINDOWS.md` or `LAB-7-MACOS.md`.
3. In your IDE, open your personal `java-bootcamp` workspace.
4. Create or copy the lab project into `java-bootcamp/examples/Lab7-ATMSystem/`.
5. Do not write lab code inside the course handout `labs/` folder.
6. Fill each TODO in the starter files before checking the solution.
7. Compile from the terminal using the command shown in the lab guide.
8. Run the program and walk through every required menu or output path.
9. Commit your work to your GitHub repo. Do not take screenshots.
10. Complete the checkpoint, reflection, and deliverables sections in the lab guide.

**Expected Output**

1. Menu 1–7 appears; invalid `abc` → invalid menu message → menu returns.
2. Login `1001` / `1234` → `Login Successful` (balance starts at **$11000**).
3. Withdraw `20000` → **Insufficient Balance** / Transaction Cancelled; still at menu.
4. Deposit `-100` → Amount must be greater than zero.
5. Deposit `abc` → Invalid numeric input messages; still at menu.
6. Deposit `1000` → Deposit Successful; balance becomes **12000**.
7. Mini Statement shows session rows and historical file lines (requires project-root cwd).
8. Login with wrong account `9999` → Account not found; still at menu.
9. Unchecked demo (menu 8 if added) prints three handled messages.
10. `logs/application.log` has ERROR entries; Exit `7` → `Thank You`.

**Checkpoint**

- All pre-lab exercises for this module are marked Pass.
- The lab project exists under `java-bootcamp/examples/Lab7-ATMSystem/`.
- The compile command succeeds.
- The run command starts the correct program.
- Required screenshots and written answers are saved.

**Common Mistakes**

- Starting the lab before finishing the module exercises.
- Mixing the flat exercise folder with the packaged lab project folder.
- Running packaged labs without `-d out` or without `-cp out`.
- Running the program from a parent folder when the lab expects project-root relative files.
- Copying work instead of filling the TODOs yourself.

**Troubleshooting**

| Common error | Why it happens | How to fix it |
| ------------ | -------------- | ------------- |
| Package mismatch | Folder path does not match `package ...` | Recreate the `src/com/academy/...` folder tree |
| Main class not found | Missing classpath or wrong fully qualified class name | Use the exact `java -cp out ...Main` command in the guide |
| Stale output | Source changed but `.class` was not recompiled | Run `javac` again before `java` |
| Missing log or input file | Program started from the wrong folder | `cd` to the project root before running |

[Look at this on your screen — do not capture a screenshot]

## Week 1 Final Checkpoint

Before moving to Week 2, confirm:

- Lab 0 setup passes.
- Module 1 through Module 7 exercises are complete.
- Lab 1 through Lab 7 projects compile and run.
- You understand where your code lives: `java-bootcamp/examples/`.
- You understand where your evidence lives: `java-bootcamp/notes/`.
- You can explain `.java` vs `.class`, `javac` vs `java`, stack vs heap, OOP classes, collections, streams, and exceptions at a beginner level.

## Global Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| A file seems missing | You are in the wrong folder | Use Explorer/Finder and terminal `pwd`/`Get-Location` to confirm the folder |
| IDE run works but terminal fails | Terminal command or current folder is wrong | Copy the guide command exactly and run it from project root |
| Terminal run works but IDE run fails | IDE SDK/source root is wrong | Set SDK 21 and mark the correct `src` folder as Sources Root |
| Output does not change after editing | You forgot to save or recompile | Save the file, run `javac`, then run `java` again |
| Git wants credentials | Remote authentication is not configured | Follow the clone/own repo guide; never paste tokens into lab notes |

End of Week 1 beginner manual.
