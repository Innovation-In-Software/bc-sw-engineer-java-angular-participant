# Lab 19 — do these steps in order

Work in **PowerShell**. Copy the starter first. Do not edit files inside the course `labs/` clone.

The API for this lab uses `/api/customers` (same classroom path as Lab 24). Lab 13 OpenAPI used `/api/v1` as the design freeze.

## 1. Copy the starter

```powershell
$dst = "$env:USERPROFILE\java-bootcamp\examples\lab19-crm"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dst
cd $dst
```

You should see `pom.xml`, `src\`, `ui\`, and `docs\`.

## 2. Fill the PostgreSQL strategy note

Open `docs\postgres-test-strategy.md`. Pick **one** option (A Testcontainers, B dedicated test DB, or C timed-path stub). Write 4–6 lines. Keep seeds CUS-1001 / CUS-1002. Do not use Oracle URLs.

## 3. Fill `CustomerApiIT`

Open `src\test\java\com\northstar\crm\CustomerApiIT.java`.

Replace each `fail("TODO")` with MockMvc calls:

1. GET `/api/customers/CUS-1001` with header `X-Correlation-Id: lab-request-001` → 200, name Amina Khan
2. GET `/api/customers/CUS-9999` → 404
3. POST a new customer → 201

The Boot API is already seeded. You only write the tests.

## 4. Run the API test

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
mvn -B test -Dtest=CustomerApiIT
```

Expected: `BUILD SUCCESS` and tests green.

## 5. Confirm Angular selectors

Open `ui\index.html` (and the Boot copy `src\main\resources\static\index.html`).

Every `TODO` `data-testid` must become:

- `customer-list`
- `customer-row-CUS-1001`
- `customer-row-CUS-1002`
- `customer-create-name`
- `customer-create-submit`

Also copy the same hooks into `ui\src\app\features\customers\customer-list-page.component.ts`.

## 6. Fill the Selenium test

Open `src\test\java\com\northstar\crm\CustomerUiSeleniumIT.java`.

Use `WebDriverWait` (not `Thread.sleep`). Assert the Amina row is visible.

```powershell
mvn -B test -Dtest=CustomerUiSeleniumIT
```

Chrome must be installed. The test starts Boot on a random port and opens the static page (no `ng serve` required for the timed path).

## 7. GitHub Actions notes

Open `docs\github-actions-ui-tests.md`. List two jobs (`api-it`, `ui-it`), headless Chrome flags, and screenshot artifacts. This course uses **GitHub Actions**, not Bitbucket.

## Commit to GitHub

Commit your files to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.

