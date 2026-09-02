# Test matrix

| Case | Layer | Expected |
| --- | --- | --- |
| create CUS-1001 | unit/IT | 201 + row + event |
| invalid body | MVC | 400 Problem Details |
| CUS-9999 | MVC | 404 |
| duplicate consume | messaging | idempotent TODO |
