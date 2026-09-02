# Lab 34 starter — timed path (~45 minutes)

**Theme:** Signals + reactive filter form + loading/empty/error UI

## Activity card

| | |
| --- | --- |
| **Objective** | Filter Northstar customers with Signals and show three UI states |
| **Skills practiced** | `signal` / `computed`, reactive forms, async UI states |
| **Expected outcome** | ACTIVE→Amina · PROSPECT→Ravi · empty/error demo · state notes |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab34-crm-ui/` |

Full steps: [`../LAB-34-GUIDE.md`](../LAB-34-GUIDE.md)

## Copy into your workspace

This folder is a complete Angular 19 app (Lab 33 UI plus Lab 34 TODOs).

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab34-crm-ui" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab34-crm-ui\"
cd $env:USERPROFILE\java-bootcamp\examples\lab34-crm-ui
npm install
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab34-crm-ui
cp -R starter/. ~/java-bootcamp/examples/lab34-crm-ui/
cd ~/java-bootcamp/examples/lab34-crm-ui
npm install
```

## 45-minute checklist

- [ ] `customers` / `loading` / `error` Signals (service or page)
- [ ] `computed` filtered list
- [ ] Reactive form updates filter Signal
- [ ] Template branches: loading · error · empty · list
- [ ] Seeds include CUS-1001 Amina and CUS-1002 Ravi
- [ ] `docs/state-notes.md` — Signals vs Observables

## Smoke test

```bash
npx ng serve --open
# Filter ACTIVE / PROSPECT; force empty or error once
npx ng build
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Filter isolates Amina / Ravi correctly | Pass / Fail |
| Loading UI appears during mock load | Pass / Fail |
| Empty or error branch demonstrated | Pass / Fail |
| `docs/state-notes.md` present | Pass / Fail |
| Smoke serve/build OK | Pass / Fail |
