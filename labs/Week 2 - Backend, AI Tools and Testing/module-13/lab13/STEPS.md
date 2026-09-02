# Lab 13 — do these steps in order

Work in **PowerShell**. Copy the starter first. Do not edit files inside the course `labs/` clone.

## 1. Copy the starter

```powershell
$dst = "$env:USERPROFILE\java-bootcamp\examples\lab13-crm"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dst
cd $dst
```

## 2. Fill the URI table

Open `docs\rest-design-notes.md`. Replace every `TODO` in the URI table:

| Resource | Method | URI | Success |
| -------- | ------ | --- | ------- |
| Replace | PUT | `/api/v1/customers/{customerId}` | 200 |
| Delete | DELETE | `/api/v1/customers/{customerId}` | 204 |
| Patch status | PATCH | `/api/v1/customers/{customerId}/status` | 200 |

Paste the 404 JSON example for `CUS-9999`. Fill the list URL:

`GET /api/v1/customers?status=ACTIVE&page=0&size=20&sort=fullName,asc`

## 3. Finish the OpenAPI file

Open `openapi\northstar-crm-customers.yaml`.

- Change the `info.description` TODO to a one-line summary.
- Change PUT and DELETE `summary: TODO` to real summaries.
- Keep Amina (`CUS-1001` ACTIVE) and Ravi (`CUS-1002` PROSPECT) examples.
- Keep `X-Correlation-Id` default `lab-request-001`.

## 4. Check the YAML

Open the YAML in IntelliJ. Fix any red squiggles (indent with spaces only).

Optional:

```powershell
npx --yes @redocly/cli lint openapi/northstar-crm-customers.yaml
```

## Commit to GitHub

Commit your files to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## 6. Optional Boot stub (homework)

A thin GET Amina stub is optional homework. Timed path does **not** require it.

Full GUIDE: [`LAB-13-GUIDE.md`](LAB-13-GUIDE.md)
