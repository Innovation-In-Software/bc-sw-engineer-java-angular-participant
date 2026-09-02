# Week 3 Beginner Hands-On Lab Manual

## Objective

This manual rewrites Week 3 Labs 22 through 29 as a beginner-friendly hands-on guide. It preserves the original Spring Framework and enterprise-pattern learning objectives while making the work more explicit and sequential.

Use this manual with the original lab guides. The original guides remain the detailed source of truth for lab-specific requirements, while this document explains exactly how a first-time learner should move through each lab.

## Prerequisites

- You have completed the course setup instructions.
- You have completed Lab 0.
- You have JDK 21 installed.
- You have Maven installed.
- You have Git installed.
- You can open a terminal:
  - Windows: Start menu -> type `PowerShell` -> press Enter.
  - macOS: Applications -> Utilities -> Terminal.
- You can open an editor:
  - Preferred: IntelliJ IDEA Community Edition.
  - Optional: VS Code with Java extensions.

## Week 3 Labs

| Lab | Topic | Beginner focus |
| --- | --- | --- |
| Lab 22 | Spring IoC and Dependency Injection | Let Spring create and connect CRM objects. |
| Lab 23 | Spring Boot Setup and Auto-Configuration | Run a Spring Boot app with Maven. |
| Lab 24 | REST Endpoints and Request Mapping | Expose Customer REST endpoints with Spring MVC. |
| Lab 25 | Service and Repository Layers with AI Assistance | Separate controller, service, and repository responsibilities. |
| Lab 26 | Spring Profiles and Configuration | Use environment-specific configuration safely. |
| Lab 27 | Transaction Management with AI Assistance | Make multi-step updates atomic and test rollbacks. |
| Lab 28 | Spring Security Basics | Add JWT login and role-based access. |
| Lab 29 | Validation and Exception Handling | Return clear validation and error responses. |

## General Rules for Every Lab

1. Read the original lab guide before changing code.
2. Read the starter `README.md`.
3. Copy the starter into your own `java-bootcamp/examples` folder.
4. Open the copied project, not the original starter folder.
5. Search for `TODO`.
6. Complete one TODO at a time.
7. Run tests often.
8. Capture expected output as evidence.
9. Do not commit `target/`, `.env`, passwords, tokens, or real personal data.

## Lab 22: Spring IoC and Dependency Injection

### Lab Objective

Build and verify a Spring bean graph for the CRM customer workflow.

### Learning Outcomes

- Explain Inversion of Control in beginner language.
- Create Spring beans with stereotypes such as @Service and @Repository.
- Use constructor injection instead of creating collaborators with new inside services.
- Verify the app with Maven tests and a local Spring Boot run.
- Document the dependency graph in docs/dependency-graph.md.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-22/lab22/LAB-22-GUIDE.md](module-22/lab22/LAB-22-GUIDE.md).
- Read the starter instructions: [module-22/lab22/starter/README.md](module-22/lab22/starter/README.md).

### Scenario

Northstar CRM is moving from hand-built Java objects to Spring-managed objects. Learners wire controllers, services, repositories, and notifications with constructor injection.

### Exercise Overview

In this lab you will copy the starter project into `lab22-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/java/com/northstar/crm/CrmApplication.java`
- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/service/NotificationService.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/main/java/com/northstar/crm/model/Customer.java`
- `docs/dependency-graph.md`

Screenshot placeholder:

- `[Screenshot: lab22-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 22]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-22\lab22"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab22-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab22-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab22-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-22/lab22"
mkdir -p "$HOME/java-bootcamp/examples/lab22-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab22-crm/"
cd "$HOME/java-bootcamp/examples/lab22-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab22-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab22-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open the starter project and find each TODO comment.
2. Confirm CrmApplication is in the root package com.northstar.crm.
3. Confirm repository and service classes have Spring stereotype annotations.
4. Refactor CustomerService so every dependency is passed through the constructor.
5. Run the service tests and then start the application.
6. Create or update docs/dependency-graph.md with the final graph.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The following complete pattern shows the required constructor-injection style. The service depends on interfaces and services that Spring can provide as beans.

```java
@Service
public class CustomerService {
  private final CustomerRepository repository;
  private final NotificationService notifications;

  public CustomerService(CustomerRepository repository, NotificationService notifications) {
    this.repository = repository;
    this.notifications = notifications;
  }

  public Customer create(Customer input, String correlationId) {
    Customer saved = repository.save(input);
    notifications.customerCreated(saved.customerId(), correlationId);
    return saved;
  }
}
```

### Explanation

Spring IoC means Spring creates and connects application objects for you. This is used so the same service can work with a test repository today and a database repository later.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- mvn -B test ends with BUILD SUCCESS.
- mvn spring-boot:run logs Started CrmApplication.
- The app starts without NoSuchBeanDefinitionException or circular dependency errors.
- docs/dependency-graph.md lists Controller -> Service -> Repository and NotificationService.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Putting @Autowired on fields instead of using a constructor.
- Creating InMemoryCustomerRepository with new inside CustomerService.
- Moving CrmApplication into a package that does not scan the other classes.
- Adding Spring annotations to simple model objects when they are not needed.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| NoSuchBeanDefinitionException | A class is missing @Service, @Repository, or is outside the scanned package. | Add the right stereotype and keep packages under com.northstar.crm. |
| Circular dependency | Two beans require each other in their constructors. | Move shared logic to a third service or redesign the dependency direction. |
| Tests need a full Spring context | The service still hides dependencies. | Pass fake or in-memory dependencies through the constructor. |

### Completion Checklist

- Lab 22 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 22, you practiced spring ioc and dependency injection in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.

## Lab 23: Spring Boot Setup and Auto-Configuration

### Lab Objective

Create, run, and verify the first Spring Boot CRM app.

### Learning Outcomes

- Explain what Spring Boot auto-configuration does.
- Open a Maven Spring Boot project in IntelliJ IDEA or VS Code.
- Run tests with Maven from a terminal.
- Start the application and verify an HTTP endpoint.
- Use application.yml for basic configuration.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-23/lab23/LAB-23-GUIDE.md](module-23/lab23/LAB-23-GUIDE.md).
- Read the starter instructions: [module-23/lab23/starter/README.md](module-23/lab23/starter/README.md).

### Scenario

The CRM needs a first reliable Spring Boot application with Maven, application configuration, a controller, and a health check.

### Exercise Overview

In this lab you will copy the starter project into `lab23-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `pom.xml`
- `src/main/java/com/northstar/crm/CrmApplication.java`
- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/resources/application.yml`
- `src/main/resources/application-dev.yml`
- `src/main/resources/application-prod.yml`

Screenshot placeholder:

- `[Screenshot: lab23-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 23]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-23\lab23"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab23-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab23-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab23-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-23/lab23"
mkdir -p "$HOME/java-bootcamp/examples/lab23-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab23-crm/"
cd "$HOME/java-bootcamp/examples/lab23-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab23-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab23-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open pom.xml and confirm the Spring Boot parent and web starter are present.
2. Open CrmApplication.java and confirm it contains @SpringBootApplication.
3. Open application.yml and confirm the server port and app settings are readable.
4. Run Maven tests from the project folder.
5. Start the app and call the health or customer endpoint.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The application class is the starting point. @SpringBootApplication tells Spring Boot where to begin scanning and auto-configuring the project.

```java
@SpringBootApplication
public class CrmApplication {
  public static void main(String[] args) {
    SpringApplication.run(CrmApplication.class, args);
  }
}
```

### Explanation

Spring Boot reduces setup work by choosing sensible defaults from your dependencies. For example, adding spring-boot-starter-web makes Boot configure an embedded web server.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- mvn -B test ends with BUILD SUCCESS.
- mvn spring-boot:run logs Tomcat started on port 8080 unless the lab config uses another port.
- A browser or HTTP client can reach http://localhost:8080.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Running Maven from the wrong folder.
- Using a Java version older than the course version.
- Deleting the Spring Boot parent from pom.xml.
- Starting two apps on the same port.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| Port 8080 already in use | Another Spring app is still running. | Stop the old app with Ctrl+C or change server.port. |
| Unsupported class file version | Maven is using the wrong JDK. | Set JAVA_HOME to the course JDK and reopen the terminal. |
| 404 for every endpoint | Controller package is not scanned or path is wrong. | Keep classes under com.northstar.crm and check the request URL. |

### Completion Checklist

- Lab 23 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 23, you practiced spring boot setup and auto-configuration in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.

## Lab 24: REST Endpoints and Request Mapping

### Lab Objective

Implement Spring MVC `@RestController` Customer mappings and verify them with MockMvc.

### Learning Outcomes

- Map GET and POST Customer routes with `@GetMapping` / `@PostMapping`.
- Return `ResponseEntity` with 200, 201, and 404.
- Pass `X-Correlation-Id` (`lab-request-001`) on requests.
- Document CORS for the Angular app on `http://localhost:4200`.
- Keep the path REST/JSON only — no Spring-WS, SOAP, or WSDL.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-24/lab24/LAB-24-GUIDE.md](module-24/lab24/LAB-24-GUIDE.md).
- Read the starter instructions: [module-24/lab24/starter/README.md](module-24/lab24/starter/README.md).

### Scenario

Northstar CRM exposes a JSON REST Customer API for the Angular frontend. Your lead freezes URIs that match Lab 13 (`/api/customers` or `/api/v1/customers` — document your choice).

### Exercise Overview

In this lab you will copy the starter project into `lab24-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/test/java/.../CustomerControllerMockMvcTest.java`
- `docs/cors-angular.md`
- `src/main/resources/application.yml`

Screenshot placeholder:

- `[Screenshot: lab24-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 24]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "<path-to-this-course>\labs\Week 3 - Spring Framework and Enterprise Patterns\module-24\lab24"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab24-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab24-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab24-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
cd "<path-to-this-course>/labs/Week 3 - Spring Framework and Enterprise Patterns/module-24/lab24"
mkdir -p "$HOME/java-bootcamp/examples/lab24-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab24-crm/"
cd "$HOME/java-bootcamp/examples/lab24-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab24-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab24-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Complete `@GetMapping("/{id}")` with 200/404 `ResponseEntity`.
2. Complete `@PostMapping` create with 201 + body.
3. Wire `X-Correlation-Id` default `lab-request-001`.
4. Finish `CustomerControllerMockMvcTest` TODOs.
5. Fill `docs/cors-angular.md` for Angular on `http://localhost:4200`.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test -Dtest=CustomerControllerMockMvcTest
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the MockMvc tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

Then GET `/api/customers/CUS-1001` and `/api/customers/CUS-1002` (or `/api/v1/customers/...` if you documented that URI).

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The controller speaks JSON REST. Constructor injection stays the Lab 22 rule.

```java
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getById(@PathVariable String id) {
    return customerService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }
}
```

### Explanation

REST uses HTTP methods and JSON bodies. OpenAPI (Lab 13) describes the contract; this lab implements it with Spring MVC.

Important lines:

- `@RestController` combines `@Controller` and JSON `@ResponseBody`.
- Constructor parameters list the dependencies the class needs.
- Tests should prove both the successful path (Amina/Ravi 200) and at least one failure path (404).

### Expected Output

- `mvn -B test` ends with BUILD SUCCESS.
- GET seeded Amina (`CUS-1001`) and Ravi (`CUS-1002`) returns 200 JSON.
- Missing id returns 404.
- `docs/cors-angular.md` mentions Angular `:4200` and no SOAP path.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Adding Spring-WS `@Endpoint` / WSDL from another course.
- Returning 200 on create instead of 201.
- Skipping CORS notes for Angular on port 4200.
- Testing with SOAP XML instead of JSON.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| 404 on GET | Path does not match `@RequestMapping`. | Align URI with Lab 13 and the controller mapping. |
| MockMvc fails | Status or JSON path wrong. | Assert 200/201/404 and `CUS-1001` / `CUS-1002`. |
| CORS confusion | Mixing SOAP CORS advice. | This course is REST + Angular only. |

### Completion Checklist

- Lab 24 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 24, you practiced REST endpoints and request mapping in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.


## Lab 25: Service and Repository Layers with AI Assistance

### Lab Objective

Refactor the CRM into clear application layers and document AI-assisted decisions.

### Learning Outcomes

- Keep HTTP code in controllers and business rules in services.
- Define a repository interface and an in-memory implementation.
- Seed CUS-1001 and CUS-1002 for predictable tests.
- Use AI suggestions critically and record accepted/rejected changes.
- Prove duplicate and not-found behavior with tests.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-25/lab25/LAB-25-GUIDE.md](module-25/lab25/LAB-25-GUIDE.md).
- Read the starter instructions: [module-25/lab25/starter/README.md](module-25/lab25/starter/README.md).

### Scenario

The CRM team wants a clean Controller -> Service -> Repository structure before adding transactions and security. AI assistance is allowed only with human review.

### Exercise Overview

In this lab you will copy the starter project into `lab25-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/test/java/com/northstar/crm/CustomerServiceTest.java`
- `docs/lab25-001.md`
- `docs/layering-notes.md`

Screenshot placeholder:

- `[Screenshot: lab25-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 25]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-25\lab25"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab25-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab25-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab25-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-25/lab25"
mkdir -p "$HOME/java-bootcamp/examples/lab25-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab25-crm/"
cd "$HOME/java-bootcamp/examples/lab25-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab25-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab25-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open each controller, service, and repository file.
2. Confirm controllers do not import repository classes.
3. Confirm services do not return ResponseEntity or use servlet classes.
4. Use AI only for small drafts or review prompts, then inspect the result line by line.
5. Record AI assistance in docs/lab25-001.md.
6. Run service tests twice.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The repository interface is the contract between business logic and storage. Later labs can replace the in-memory class without changing the controller.

```java
public interface CustomerRepository {
  Customer save(Customer customer);
  Optional<Customer> findByCustomerId(String customerId);
  List<Customer> findAll();
  boolean existsByCustomerId(String customerId);
}
```

### Explanation

Layering keeps responsibilities separate. A controller handles HTTP, a service handles business rules, and a repository handles data access.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- GET CUS-1001 returns Amina Khan.
- GET CUS-1002 returns Ravi Singh.
- Duplicate create of CUS-1001 is rejected.
- CustomerController has no repository imports.
- docs/lab25-001.md explains AI use or says no AI was used.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Accepting AI code that places ResponseEntity in the service.
- Letting a controller access a Map or repository directly.
- Writing tests that only assert objects are not null.
- Skipping the AI review notes.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| Duplicate create overwrites existing data | The service forgot to call existsByCustomerId before save. | Add the duplicate rule in CustomerService. |
| Controller imports repository | The layer boundary was bypassed. | Inject CustomerService only. |
| AI generated unrelated JPA code | The prompt was too broad. | Reject it and ask for interface-only or in-memory code. |

### Completion Checklist

- Lab 25 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 25, you practiced service and repository layers with ai assistance in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.

## Lab 26: Spring Profiles and Configuration

### Lab Objective

Use Spring profiles and configuration properties safely.

### Learning Outcomes

- Explain what a Spring profile is.
- Read application.yml and profile-specific YAML files.
- Bind configuration to a typed @ConfigurationProperties class.
- Run the app with dev and test profiles.
- Avoid committing real secrets.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-26/lab26/LAB-26-GUIDE.md](module-26/lab26/LAB-26-GUIDE.md).
- Read the starter instructions: [module-26/lab26/starter/README.md](module-26/lab26/starter/README.md).

### Scenario

Northstar CRM needs separate local, test, and production-style settings without changing Java code.

### Exercise Overview

In this lab you will copy the starter project into `lab26-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/resources/application.yml`
- `src/main/resources/application-dev.yml`
- `src/main/resources/application-test.yml`
- `src/main/resources/application-prod.yml`
- `src/main/java/com/northstar/crm/config/NorthstarIntegrationProperties.java`
- `.env.example`

Screenshot placeholder:

- `[Screenshot: lab26-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 26]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-26\lab26"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab26-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab26-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab26-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-26/lab26"
mkdir -p "$HOME/java-bootcamp/examples/lab26-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab26-crm/"
cd "$HOME/java-bootcamp/examples/lab26-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab26-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab26-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open all application*.yml files and compare the settings.
2. Open the properties class and match each Java field to a YAML property.
3. Run tests with the test profile.
4. Start the app with the dev profile.
5. Confirm no .env file or real secret is committed.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

A typed properties class gives Java code safe access to configuration values. It is easier to test than reading raw strings everywhere.

```java
@ConfigurationProperties(prefix = "northstar.integration")
public class NorthstarIntegrationProperties {
  private String baseUrl;
  private Duration timeout;

  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }
}
```

### Explanation

A profile is a named set of settings. It lets the same application run differently in development, tests, and production without editing source code.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- mvn -B test ends with BUILD SUCCESS.
- Running with dev profile logs The following 1 profile is active: dev.
- Running with test profile uses test-safe settings.
- .env.example is present, but .env is not committed.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Indenting YAML incorrectly.
- Putting real passwords in application-prod.yml.
- Misspelling the profile name.
- Reading environment variables without documenting them.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| Profile settings ignored | The profile was not activated. | Use -Dspring-boot.run.profiles=dev or SPRING_PROFILES_ACTIVE=dev. |
| YAML parse failure | Indentation or colon spacing is invalid. | Use spaces, align child keys, and avoid tabs. |
| Property is null | Prefix or field name does not match. | Compare application.yml to @ConfigurationProperties prefix and fields. |

### Completion Checklist

- Lab 26 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 26, you practiced spring profiles and configuration in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.

## Lab 27: Transaction Management with AI Assistance

### Lab Objective

Implement and test transactional service behavior with reviewed AI assistance.

### Learning Outcomes

- Explain why transactions protect data consistency.
- Place @Transactional at the service boundary.
- Test successful commit and failed rollback behavior.
- Review AI-generated transaction suggestions before accepting them.
- Document failure experiments and recovery behavior.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-27/lab27/LAB-27-GUIDE.md](module-27/lab27/LAB-27-GUIDE.md).
- Read the starter instructions: [module-27/lab27/starter/README.md](module-27/lab27/starter/README.md).

### Scenario

The CRM must move money or account balances atomically. Either all related updates succeed, or all are rolled back.

### Exercise Overview

In this lab you will copy the starter project into `lab27-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/java/com/northstar/crm/service/TransferService.java`
- `src/main/java/com/northstar/crm/repository/AccountRepository.java`
- `src/main/java/com/northstar/crm/repository/TransferLogRepository.java`
- `src/test/java/com/northstar/crm/TransferServiceTest.java`
- `copilot-notes/ai-transaction-review.md`
- `docs/transaction-notes.md`

Screenshot placeholder:

- `[Screenshot: lab27-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 27]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-27\lab27"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab27-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab27-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab27-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-27/lab27"
mkdir -p "$HOME/java-bootcamp/examples/lab27-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab27-crm/"
cd "$HOME/java-bootcamp/examples/lab27-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab27-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab27-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open TransferService and identify the method that must be atomic.
2. Place @Transactional on the public service method, not on the controller.
3. Run the success test and confirm balances change.
4. Run the failure test and confirm balances roll back.
5. Use AI only to review edge cases or draft tests, then document what you accepted.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The transaction belongs around the business operation. This example debits one account, credits another, and records the transfer as one unit.

```java
@Service
public class TransferService {
  private final AccountRepository accounts;
  private final TransferLogRepository transferLogs;

  public TransferService(AccountRepository accounts, TransferLogRepository transferLogs) {
    this.accounts = accounts;
    this.transferLogs = transferLogs;
  }

  @Transactional
  public void transfer(String fromAccountId, String toAccountId, BigDecimal amount) {
    accounts.debit(fromAccountId, amount);
    accounts.credit(toAccountId, amount);
    transferLogs.record(fromAccountId, toAccountId, amount);
  }
}
```

### Explanation

A transaction groups database work into one unit. If one required update fails, Spring can roll back the whole unit so the data is not half-changed.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- mvn -B test -Dtest=TransferServiceTest ends with BUILD SUCCESS.
- The success test shows source and destination balances changed.
- The failure test shows balances and logs are unchanged after rollback.
- AI review notes explain any transaction code or test suggestions used.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Putting @Transactional on a private method.
- Putting transaction logic in a controller.
- Catching and swallowing exceptions so rollback never happens.
- Trusting AI when it says every exception rolls back the same way.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| Rollback test fails | The exception is caught or the method is not transactional. | Let the exception escape and put @Transactional on the public service method. |
| Transaction annotation ignored | Self-invocation or private method prevents Spring proxying. | Call the public service method through the Spring bean. |
| AI suggests manual connection commits | It is mixing lower-level JDBC patterns into Spring service code. | Reject and keep Spring transaction management. |

### Completion Checklist

- Lab 27 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 27, you practiced transaction management with ai assistance in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.

## Lab 28: Spring Security Basics

### Lab Objective

Add JWT login, protected routes, and role-based checks.

### Learning Outcomes

- Explain the difference between authentication and authorization.
- Configure a stateless Spring Security filter chain.
- Issue and validate JWT bearer tokens.
- Prove 401, 403, and 200 responses.
- Keep tokens and secrets out of Git and logs.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-28/lab28/LAB-28-GUIDE.md](module-28/lab28/LAB-28-GUIDE.md).
- Read the starter instructions: [module-28/lab28/starter/README.md](module-28/lab28/starter/README.md).

### Scenario

The CRM customer API must reject anonymous users, allow agents to read customer records, and reserve admin routes for admins.

### Exercise Overview

In this lab you will copy the starter project into `lab28-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/java/com/northstar/crm/config/SecurityConfig.java`
- `src/main/java/com/northstar/crm/security/JwtService.java`
- `src/main/java/com/northstar/crm/security/JwtAuthenticationFilter.java`
- `src/main/java/com/northstar/crm/security/CrmUserDetailsService.java`
- `src/main/java/com/northstar/crm/controller/AuthController.java`
- `src/main/java/com/northstar/crm/controller/AdminController.java`
- `docs/security-notes.md`
- `.env.example`

Screenshot placeholder:

- `[Screenshot: lab28-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 28]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-28\lab28"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab28-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab28-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab28-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-28/lab28"
mkdir -p "$HOME/java-bootcamp/examples/lab28-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab28-crm/"
cd "$HOME/java-bootcamp/examples/lab28-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab28-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab28-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open SecurityConfig.java and read each request matcher.
2. Confirm /api/auth/login is public and /api/customers/** requires AGENT or ADMIN.
3. Confirm /api/admin/** requires ADMIN.
4. Start the app and call a customer route without a token.
5. Log in as agent1 and use the returned token.
6. Log in as admin1 and prove admin access.
7. Run MockMvc or WebTestClient tests for 401, 403, and 200.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The filter chain defines which requests are public and which require a role. For a bearer-token API, the app should not create server-side sessions.

```java
@Bean
SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
  http.csrf(csrf -> csrf.disable())
      .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
      .authorizeHttpRequests(auth -> auth
          .requestMatchers("/api/auth/login", "/actuator/health").permitAll()
          .requestMatchers("/api/admin/**").hasRole("ADMIN")
          .requestMatchers("/api/customers/**").hasAnyRole("AGENT", "ADMIN")
          .anyRequest().authenticated())
      .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
  return http.build();
}
```

### Explanation

Authentication proves who the caller is. Authorization checks what that caller is allowed to do.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- Missing token returns 401 Unauthorized.
- Agent token can call /api/customers/CUS-1001 and receives 200.
- Agent token on /api/admin/** receives 403 Forbidden.
- Admin token on /api/admin/** receives 200.
- mvn -B test ends with BUILD SUCCESS.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Committing a real JWT secret or .env file.
- Logging the full Authorization header.
- Confusing 401 with 403.
- Forgetting the Bearer prefix before the token.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| HTML login page appears | Default form login is still enabled. | Disable form login for API behavior. |
| Valid admin token still gets 403 | Role names or ROLE_ prefix handling is inconsistent. | Use roles('ADMIN') with hasRole('ADMIN') consistently. |
| Valid token gets 401 | JWT filter order or secret mismatch is wrong. | Register before UsernamePasswordAuthenticationFilter and verify JWT_SECRET / northstar.security.jwt-secret. |

### Completion Checklist

- Lab 28 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 28, you practiced spring security basics in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.

## Lab 29: Validation and Exception Handling

### Lab Objective

Add Bean Validation and a consistent ErrorResponse contract.

### Learning Outcomes

- Use DTO validation annotations such as @NotBlank and @Email.
- Add @Valid at controller boundaries.
- Create a @ControllerAdvice global exception handler.
- Return safe, consistent error bodies for 400, 404, and 409.
- Test invalid input and business exceptions.

### Prerequisites

- Complete the course setup instructions and Lab 0.
- Confirm JDK 21, Maven, Git, and an editor are installed.
- Use IntelliJ IDEA Community Edition as the primary IDE, or VS Code if your instructor allows it.
- Work in your own folder under `java-bootcamp/examples`; do not edit the course starter folder directly.
- Read the original guide before starting: [module-29/lab29/LAB-29-GUIDE.md](module-29/lab29/LAB-29-GUIDE.md).
- Read the starter instructions: [module-29/lab29/starter/README.md](module-29/lab29/starter/README.md).

### Scenario

The CRM needs predictable validation and error responses so clients can fix bad requests without reading stack traces.

### Exercise Overview

In this lab you will copy the starter project into `lab29-crm`, open it in your editor, complete the TODOs, run tests, start the application when required, and record evidence.

Major files you will inspect or modify:

- `src/main/java/com/northstar/crm/dto/CustomerRequest.java`
- `src/main/java/com/northstar/crm/dto/ErrorResponse.java`
- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/main/java/com/northstar/crm/api/GlobalExceptionHandler.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/test/java/com/northstar/crm/ValidationExceptionTest.java`

Screenshot placeholder:

- `[Screenshot: lab29-crm opened in IntelliJ IDEA or VS Code with the project tree visible]`
- `[Screenshot: terminal showing Maven BUILD SUCCESS for Lab 29]`

### Step-by-Step Instructions

#### Step 1: Copy the starter into your own workspace

Do not edit files inside the course `labs` folder. Copy the starter so your work is separate from the handout.

Windows PowerShell:

```powershell
cd "D:\Current_work\Innovation in Software\Java Angular Fullstack bootcamp"
cd "labs\Week 3 - Spring Framework and Enterprise Patterns\module-29\lab29"
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab29-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab29-crm\"
cd "$env:USERPROFILE\java-bootcamp\examples\lab29-crm"
mvn -B -DskipTests package
```

macOS or Linux terminal:

```bash
COURSE_REPO="$HOME/bc-sw-engineer-java-angular-participant"
cd "$COURSE_REPO"
cd "labs/Week 3 - Spring Framework and Enterprise Patterns/module-29/lab29"
mkdir -p "$HOME/java-bootcamp/examples/lab29-crm"
cp -R starter/. "$HOME/java-bootcamp/examples/lab29-crm/"
cd "$HOME/java-bootcamp/examples/lab29-crm"
mvn -B -DskipTests package
```

What the commands do:

- `cd` changes the folder where commands run.
- `New-Item` or `mkdir -p` creates the learner project folder if it does not already exist.
- `Copy-Item` or `cp -R` copies the starter files into the learner's own workspace.
- `mvn -B -DskipTests package` asks Maven to compile and package the starter without running TODO tests yet.

Expected command output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- The terminal prompt returns without an error.
- Maven shows `BUILD SUCCESS`.
- Some labs include TODO tests that fail until you complete the lab. You will run `mvn -B test` after the TODOs are finished.
- A `target` folder may appear. This is generated build output and should not be committed.

#### Step 2: Open the project in your editor

IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File` -> `Open`.
3. Select the folder `lab29-crm` inside `java-bootcamp/examples`.
4. Click `OK` or `Open`.
5. If IntelliJ asks whether to trust the project, click `Trust Project` only for this course folder.
6. Wait for Maven import to finish. The progress bar is usually at the bottom of the window.

VS Code:

1. Open VS Code.
2. Select `File` -> `Open Folder`.
3. Select the folder `lab29-crm` inside `java-bootcamp/examples`.
4. Click `Select Folder`.
5. If prompted, install or enable the Java Extension Pack.

Common beginner mistake:

- Opening only the `src` folder instead of the project folder that contains `pom.xml`. Maven projects must be opened from the folder that contains `pom.xml`.

#### Step 3: Read the TODOs before typing

1. In the editor, search for `TODO`.
2. Read every TODO once before changing code.
3. Open the original lab guide beside the code.
4. Match each TODO to the relevant section in the guide.

Checkpoint:

- You can name the files you will edit.
- You know which tests must pass.
- You know which endpoint or command proves the lab works.

#### Step 4: Complete the lab-specific work

1. Open CustomerRequest.java and add validation annotations to each required field.
2. Open CustomerController.java and add @Valid to request body parameters.
3. Open GlobalExceptionHandler.java and map validation and business exceptions.
4. Run tests.
5. Start the app and submit an invalid request.
6. Confirm the error body has no stack trace or sensitive data.

#### Step 5: Run tests

Execute this command from the project folder:

```powershell
mvn -B test
```

What this command does:

- Maven reads `pom.xml`.
- Maven downloads or reuses dependencies.
- Maven compiles the Java code.
- Maven runs the automated tests.

Expected Output:

```text
[INFO] BUILD SUCCESS
```

How to verify success:

- Look for `BUILD SUCCESS` near the bottom of the terminal.
- If the output says `BUILD FAILURE`, scroll up to the first error, not the last line.

#### Step 6: Start the app when the lab requires manual HTTP testing

Execute this command from the project folder:

```powershell
mvn spring-boot:run
```

Expected Output:

```text
Started CrmApplication
```

How to stop the app:

1. Click inside the terminal window.
2. Press `Ctrl+C`.
3. Wait until the command prompt appears again.

### Code or Configuration

The error response is a stable JSON shape. Clients can read status, message, path, and field errors without depending on Java exception names.

```java
public record ErrorResponse(
    Instant timestamp,
    int status,
    String error,
    String message,
    String path,
    Map<String, String> fieldErrors
) {}
```

### Explanation

Validation checks input before business logic runs. Exception handling converts Java errors into clear HTTP responses for API clients.

Important lines:

- The annotation near the class tells Spring what role the class has.
- Constructor parameters list the dependencies the class needs.
- Final fields make dependencies visible and harder to accidentally replace.
- Tests should prove both the successful path and at least one failure path.

### Expected Output

- Invalid JSON fields return 400 with fieldErrors.
- Missing customer returns 404 with the shared ErrorResponse shape.
- Duplicate customer returns 409 or the status required by the original lab.
- No response body exposes a Java stack trace.
- mvn -B test ends with BUILD SUCCESS.

### Checkpoint

Before continuing, confirm each item:

- The project is copied into your own `java-bootcamp/examples` folder.
- All TODOs for this lab are completed or intentionally documented.
- `mvn -B test` succeeds.
- Required documentation files are updated.
- Screenshots or notes are saved if the lab asks for evidence.

### Common Mistakes

- Adding validation annotations but forgetting @Valid.
- Returning raw exception messages that include internal details.
- Using a different error JSON shape for every handler.
- Letting validation errors become 500 responses.

### Troubleshooting

| Common error | Why it happens | How to fix it |
| --- | --- | --- |
| Invalid request reaches service | @Valid is missing on the controller parameter. | Add @Valid before @RequestBody. |
| Field errors are empty | Handler is not reading BindingResult/FieldError details. | Map MethodArgumentNotValidException field errors. |
| Security hides validation result | Request is unauthenticated. | Log in first, then test validation on protected routes. |

### Completion Checklist

- Lab 29 original guide reviewed from start to finish.
- Starter copied into the learner workspace.
- Required files created or modified.
- Commands run from the correct folder.
- Expected outputs recorded.
- Common mistakes checked.
- Troubleshooting notes reviewed.
- No secrets, generated build folders, or personal data committed.

### Lab Summary

In Lab 29, you practiced validation and exception handling in the Northstar CRM application. You should now be able to explain the purpose of the lab, point to the files you changed, rerun the commands, and show evidence that the lab works.
