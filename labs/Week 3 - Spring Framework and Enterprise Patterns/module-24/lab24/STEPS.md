# Lab 24 — do these steps in order

Work in **PowerShell**. Copy the starter first. Do not edit files inside the course `labs/` clone.

## 1. Copy the starter

```powershell
$dst = "$env:USERPROFILE\java-bootcamp\examples\lab24-crm"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dst
cd $dst
```

## 2. Finish GET by id

Open `src\main\java\com\northstar\crm\api\CustomerController.java`.

Replace the GET TODO: `customerService.find(id)` → `200` if present, `404` if missing.

Keep header `X-Correlation-Id` default `lab-request-001`.

## 3. Finish POST create

Replace the POST TODO: save the body, return `201` with `Location: /api/customers/{id}`.

## 4. Add CORS for Angular

Add `@CrossOrigin(origins = "http://localhost:4200")` on the controller.

## 5. Finish MockMvc tests

Open `src\test\java\com\northstar\crm\CustomerControllerMockMvcTest.java`.

Replace each `fail("TODO")`:

1. GET `/api/customers/CUS-1001` → 200, name Amina Khan
2. GET `/api/customers/CUS-9999` → 404
3. POST Maya `CUS-1003` → 201 + Location

## 6. Run tests

```powershell
mvn -B test -Dtest=CustomerControllerMockMvcTest
```

Expected: `BUILD SUCCESS`.

## 7. CORS note

Fill `docs\cors-angular.md` (Angular on `:4200`, API on `:8080`).

## Commit to GitHub

Commit your files to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.

