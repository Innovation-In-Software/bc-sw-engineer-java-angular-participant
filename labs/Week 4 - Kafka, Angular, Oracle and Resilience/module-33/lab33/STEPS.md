# Lab 33 — do these steps in order

Work in **PowerShell**. Copy the starter first. Do not edit files inside the course `labs/` clone.

## 1. Copy the starter and install

```powershell
$dst = "$env:USERPROFILE\java-bootcamp\examples\lab33-crm-ui"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dst
cd $dst
npm install
```

## 2. Confirm seed data

Open `src\app\features\customers\customer.model.ts`.

You should already see `CUS-1001` Amina Khan ACTIVE and `CUS-1002` Ravi Singh PROSPECT.

## 3. Presentational list item

Open `src\app\features\customers\customer-list-item.component.ts`.

Fill TODOs: `input` for the customer, `output` when the row is selected. No React/JSX.

## 4. Smart list page

Open `src\app\features\customers\customer-list-page.component.ts`.

Own the array from `SEED_CUSTOMERS`. Handle the select event. Show the selected id.

## 5. Host the page

Confirm `AppComponent` renders `<app-customer-list-page />`.

## 6. Run the app

```powershell
npx ng serve --port 4200
```

Open http://localhost:4200. You should see both customers.

## 7. Notes + evidence

Fill `docs\component-notes.md`. Commit your work to your GitHub repo (no screenshots).

Full GUIDE: [`LAB-33-GUIDE.md`](LAB-33-GUIDE.md)
