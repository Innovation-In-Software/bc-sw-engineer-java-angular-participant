# Exercise 3 — Separate Entity and DTO

**Module 8** · Checkpoint D · Exercises 1–6 Pass then Lab 8

## Activity card

| | |
| --- | --- |
| **Objective** | Compile a mini entity + request/response DTO tree (no Spring/JPA) |
| **Skills practiced** | Entity vs DTO field/responsibility split |
| **Expected outcome** | StructureDemo prints a response summary |
| **Estimated time** | 15–20 minutes |
| **File to create** | `examples/module-08-exercises/` → mini-src/... entity, dto, StructureDemo |
| **Checkpoint** | D (after slides 15–21) |

## What you will learn

- Entities model domain state; DTOs shape API/boundary data
- Request and response DTOs can differ from the entity
- Plain Java packages prove the boundary before frameworks arrive

**Enterprise context:** CRM APIs must not leak persistence fields (or future DB ids) blindly to every client.

## Files

```text
mini-src/com/northstar/crm/
├── StructureDemo.java
├── entity/Customer.java
└── dto/
    ├── CustomerRequest.java
    └── CustomerResponse.java
```

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

Complete form of the idea (your file should look similar when TODOs are filled):

```java
package com.northstar.crm.entity;

public class Customer {
    // TODO: declare three final String fields — id, name, status
    private final String _____;
    private final String _____;
    private final String _____;

    public Customer(String id, String name, String status) {
        // TODO: assign each parameter to its matching field (this._____)
        this._____ = id;
        this._____ = name;
        this._____ = status;
    }

    // TODO: add three getters — getId(), getName(), getStatus()
    public String getId() { return _____; }
    public String getName() { return _____; }
    public String getStatus() { return _____; }
}
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Create the directories and files from the tree above. Paste each skeleton, then replace every `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished files.

### `entity/Customer.java`

```java
package com.northstar.crm.entity;

public class Customer {
    // TODO: declare three final String fields — id, name, status
    private final String _____;
    private final String _____;
    private final String _____;

    public Customer(String id, String name, String status) {
        // TODO: assign each parameter to its matching field (this._____)
        this._____ = id;
        this._____ = name;
        this._____ = status;
    }

    // TODO: add three getters — getId(), getName(), getStatus()
    public String getId() { return _____; }
    public String getName() { return _____; }
    public String getStatus() { return _____; }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Entity | Internal customer identity and state (includes generated `id` and `status`) |
| `final` fields | Set once in the constructor; object does not mutate afterward |

### `dto/CustomerRequest.java`

```java
package com.northstar.crm.dto;

public class CustomerRequest {
    // TODO: boundary input fields only — name and email (no id, no status)
    private final String _____;
    private final String _____;

    public CustomerRequest(String name, String email) {
        this._____ = name;
        this._____ = email;
    }

    public String getName() { return _____; }
    public String getEmail() { return _____; }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Request DTO | What the caller sends in — name and email only |

### `dto/CustomerResponse.java`

```java
package com.northstar.crm.dto;

public class CustomerResponse {
    private final String id;
    private final String name;
    private final String status;

    public CustomerResponse(
            String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    // TODO: return a single-line summary — id + " | " + name + " | " + status
    public String summary() {
        return _____;
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Response DTO | Safe outward view — includes `id` and `status`, but no internal-only fields |

### `StructureDemo.java`

```java
package com.northstar.crm;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.entity.Customer;

public class StructureDemo {
    public static void main(String[] args) {
        // TODO: create a CustomerRequest with name "Amina Khan" and email "amina@example.test"
        CustomerRequest request =
                new CustomerRequest(_____, _____);

        // TODO: build a Customer entity — id "CUS-1001", name from request, status "ACTIVE"
        Customer entity =
                new Customer(
                        _____,
                        request.getName(),
                        _____);

        // TODO: map entity fields into a CustomerResponse
        CustomerResponse response =
                new CustomerResponse(
                        entity.getId(),
                        entity.getName(),
                        entity.getStatus());

        System.out.println(response.summary());
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Manual mapping | Demo wires request → entity → response to show layer boundaries |

## Steps

### Step 1 — Create directories and files

**Why:** Package folders must match `package` declarations exactly.

1. Under `module-08-exercises`, create `mini-src/com/northstar/crm/entity/` and `mini-src/com/northstar/crm/dto/`.
2. **New → File** for each `.java` file in the tree.
3. Paste the matching starter skeleton.
4. Fill every `_____` / `// TODO`. Save each file.

### Step 2 — Compile

From `module-08-exercises`:

```text
javac -d mini-out mini-src/com/northstar/crm/entity/Customer.java mini-src/com/northstar/crm/dto/CustomerRequest.java mini-src/com/northstar/crm/dto/CustomerResponse.java mini-src/com/northstar/crm/StructureDemo.java
```

### Step 3 — Run

**Windows:**

```powershell
java -cp mini-out com.northstar.crm.StructureDemo
```

**macOS:**

```bash
java -cp mini-out com.northstar.crm.StructureDemo
```

**Expected:**

```text
CUS-1001 | Amina Khan | ACTIVE
```

## Why three types?

| Type | Purpose |
| ---- | ------- |
| Request DTO | Fields accepted at boundary; no generated ID/status |
| Entity | Internal customer identity/state |
| Response DTO | Safe outward representation |

The demo manually maps objects only to illustrate boundaries. Real behavior arrives in later labs.

## Failure experiment

Change `Customer.java` package to `com.northstar.crm.dto` without moving the file/imports. Compilation should fail. Restore it.


## Debug / design challenge

Put email only on the entity and forget the request DTO — fix the mapping story.

## Predict the Output / Behavior

Can CustomerResponse omit a field that Customer stores internally?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace every blank with real Java |
| `package ... does not match expected package` | File path must match the `package` line |
| `cannot find symbol` on imports | Check folder names (`entity`, `dto`) and package declarations |
| Wrong output | Confirm entity status is `"ACTIVE"` and id is `"CUS-1001"` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Package tree matches declarations | Pass / Fail |
| 2 | Compile and run output matches expected | Pass / Fail |
| 3 | You explain entity vs request/response DTO | Pass / Fail |
