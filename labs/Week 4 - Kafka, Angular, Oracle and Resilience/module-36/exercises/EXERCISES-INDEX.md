# Module 36 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab36/LAB-36-GUIDE.md`](../lab36/LAB-36-GUIDE.md)

**Module:** 36 — Secure Frontend Communication
**Next:** [`../lab36/LAB-36-WINDOWS.md`](../lab36/LAB-36-WINDOWS.md) or [`../lab36/LAB-36-MACOS.md`](../lab36/LAB-36-MACOS.md) → [`../lab36/LAB-36-GUIDE.md`](../lab36/LAB-36-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-36-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Threat Sketch](exercise-01-threat-sketch.md) | **A** | `notes/lab36-security.md` |
| 2 | [Token Storage Options](exercise-02-token-storage.md) | **A** | `notes/lab36-security.md` |
| 3 | [XSS and CSP Notes](exercise-03-xss-csp.md) | **B** | `notes/lab36-security.md` |
| 4 | [CSRF Notes](exercise-04-csrf-notes.md) | **B** | `notes/lab36-security.md` |
| 5 | [Fill Route Guard TODOs](exercise-05-fill-guard-todos.md) | **C** | `notes/lab36-todos.md` |
| 6 | [Lab 36 Readiness](exercise-06-lab36-readiness.md) | **D** | `notes/lab36-readiness.md` |

Then **checkpoint E** → Lab 36.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Write threat notes, storage choices, and guard TODOs | Do not configure a real IdP such as Okta or Auth0 |
| Use the fake token lab-token-001 in notes | Do not commit real tokens or any DB password |
| Reason about UI-versus-API authorization | Do not treat a hidden button as access control |
| Document XSS and CSRF stances | Do not use localStorage as the taught practice |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-36-exercises` | `~/java-bootcamp/examples/module-36-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-36-exercises\notes | Out-Null
cd examples\module-36-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-36-exercises/notes
cd examples/module-36-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 36 OS guide.
