# Lab 33 starter — timed path (~45 minutes)

**Do this first:** numbered PowerShell steps in [`../STEPS.md`](../STEPS.md).

**Theme:** Standalone Angular CRM UI — smart vs presentational components

## Activity card

| | |
| --- | --- |
| **Objective** | Wire a customer list with inputs/outputs and feature folders |
| **Skills practiced** | CLI app, templates, `input`/`output`, composition |
| **Expected outcome** | Browser list shows CUS-1001 / CUS-1002 · component notes |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab33-crm-ui/` copied from this starter |

**Boilerplate reduced:** This folder is a complete Angular 19 app. Fill the `TODO`s in `features/customers/` — reject React/JSX drafts.

Full steps: [`../LAB-33-GUIDE.md`](../LAB-33-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab33-crm-ui" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab33-crm-ui\"
cd $env:USERPROFILE\java-bootcamp\examples\lab33-crm-ui
npm install
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab33-crm-ui
cp -R starter/. ~/java-bootcamp/examples/lab33-crm-ui/
cd ~/java-bootcamp/examples/lab33-crm-ui
npm install
```

## 45-minute checklist

- [ ] `customer.model.ts` seeds CUS-1001 Amina and CUS-1002 Ravi (already provided)
- [ ] Presentational `CustomerListItemComponent` (`input` + `output`)
- [ ] Smart `CustomerListPageComponent` owns the array and selection
- [ ] `AppComponent` hosts the smart page
- [ ] `docs/component-notes.md` — smart vs presentational + folder map
- [ ] Commit this work to your GitHub repo (no screenshots)

## Smoke test

```bash
npx ng serve --open
# Confirm CUS-1001 and CUS-1002 visible; click selects a row
npx ng build
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| List shows CUS-1001 and CUS-1002 | Pass / Fail |
| Child uses input/output (not hard-coded names only) | Pass / Fail |
| Feature folder `features/customers/` exists | Pass / Fail |
| `docs/component-notes.md` present | Pass / Fail |
| `ng serve` or `ng build` smoke OK | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
