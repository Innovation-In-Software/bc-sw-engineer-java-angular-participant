# Exercise 6 — Fill a Mini POM

**Module 9** · Checkpoint D · Exercises 1–6 Pass then Lab 9

## Activity card

| | |
| --- | --- |
| **Objective** | Fill a mini POM: coords, JUnit test scope, compiler/Surefire/jar plugins |
| **Skills practiced** | Hands-on Maven build, plugins, test packaging |
| **Expected outcome** | mini-maven builds; notes/mini-maven-notes.md captured |
| **Estimated time** | 18–25 minutes |
| **File to create** | `examples/module-09-exercises/` → mini-maven/ + notes/mini-maven-notes.md |
| **Checkpoint** | D (after slides 52–53) |

## What you will learn

- A minimal POM can compile, test, and package with Main-Class
- Plugin versions belong in the POM, not tribal memory
- First runs should omit -q so Surefire output is visible

**Enterprise context:** Lab 9 expands this habit into the Northstar CRM build — same coordinates discipline.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-09-exercises/`) |
| ---- | --------------------------------------------- |
| Mini project | `mini-maven/` (see tree below) |
| Your notes file | `notes/mini-maven-notes.md` |

## Files

```text
mini-maven/
├── pom.xml
└── src/
    ├── main/java/com/northstar/crm/BuildDemo.java
    └── test/java/com/northstar/crm/BuildDemoTest.java
```

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

Complete form of the idea (your file should look similar when TODOs are filled):

```java
package com.northstar.crm;

public class BuildDemo {
    public static void main(String[] args) {
        // TODO: print exactly: BuildDemo ready for Lab 9
        System.out.println("_____");
    }

    public static String greeting() {
        return "BuildDemo ready for Lab 9";
    }
}
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

From `module-09-exercises`, create `mini-maven/` and the paths above. Paste each skeleton, then replace every `_____` and `<!-- TODO -->` with working values. Do **not** leave TODOs in your finished files.

### `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <!-- TODO: Northstar coordinates -->
  <groupId>_____</groupId>
  <artifactId>_____</artifactId>
  <version>_____</version>
  <packaging>_____</packaging>

  <name>Module 9 Mini Maven</name>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>21</maven.compiler.release>
    <junit.version>5.11.4</junit.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.version}</version>
      <!-- TODO: test scope so JUnit is not a production dependency -->
      <scope>_____</scope>
    </dependency>
  </dependencies>

  <build>
    <finalName>build-demo</finalName>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.13.0</version>
        <configuration>
          <!-- TODO: JDK release -->
          <release>_____</release>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.5.2</version>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.4.2</version>
        <configuration>
          <archive>
            <manifest>
              <!-- TODO: fully qualified Main class -->
              <mainClass>_____</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

| Blank | Expected value |
| ----- | -------------- |
| `groupId` | `com.northstar` |
| `artifactId` | `build-demo` |
| `version` | `0.1.0-SNAPSHOT` |
| `packaging` | `jar` |
| JUnit `scope` | `test` |
| compiler `release` | `21` |
| `mainClass` | `com.northstar.crm.BuildDemo` |

### `BuildDemo.java`

```java
package com.northstar.crm;

public class BuildDemo {
    public static void main(String[] args) {
        // TODO: print exactly: BuildDemo ready for Lab 9
        System.out.println("_____");
    }

    public static String greeting() {
        return "BuildDemo ready for Lab 9";
    }
}
```

### `BuildDemoTest.java`

```java
package com.northstar.crm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildDemoTest {
    @Test
    void greetingMatchesBanner() {
        // TODO: assert greeting() equals "BuildDemo ready for Lab 9"
        assertEquals("_____", BuildDemo.greeting());
    }
}
```

## Steps

### Step 1 — Create the tree and fill blanks

Use the expected values table. Save all three files.

### Step 2 — Run Maven from `mini-maven/`

Use **full output** the first time so you can see Surefire results (`Tests run: 1`).  
`-q` (quiet) hides most of that log — skip it until you only need a quieter rebuild.

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-09-exercises\mini-maven
mvn test
mvn package
java -jar target\build-demo.jar
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-09-exercises/mini-maven
mvn test
mvn package
java -jar target/build-demo.jar
```

Optional quieter rebuild later: `mvn -q test` / `mvn -q package` (still look for `BUILD SUCCESS`).

### Step — Commit to GitHub


In `notes/mini-maven-notes.md` record:

- Surefire line from `mvn test` (look for `Tests run: 1`) or `BUILD SUCCESS`;
- that `target/build-demo.jar` exists;
- console output from `java -jar`.

## Expected result

```text
BuildDemo ready for Lab 9
```

Surefire reports one passing test. `target/build-demo.jar` runs `BuildDemo`.


## Debug / design challenge

JAR has no Main-Class — fix the jar plugin manifest config.

## Predict the Output / Behavior

After mvn package, where is the JAR under mini-maven?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `package does not exist: org.junit` | Confirm `<scope>test</scope>` and that the test file is under `src/test/java` |
| Wrong packaging / no JAR | Confirm `<packaging>jar</packaging>` and `mvn package` |
| `no main manifest attribute` | Set `mainClass` to `com.northstar.crm.BuildDemo` |
| Compiler release error | Set `<release>21</release>` and use JDK 21 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | `mvn test` succeeds (`Tests run: 1` or `BUILD SUCCESS`) | Pass / Fail |
| 2 | `java -jar target/build-demo.jar` prints the banner | Pass / Fail |
| 3 | JUnit is `test` scope; compiler release is 21 | Pass / Fail |
