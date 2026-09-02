# Failure taxonomy

| Mode | Example | Action |
| --- | --- | --- |
| Transient | broker blip | bounded retry TODO |
| Poison | bad JSON | DLT TODO |
| Business reject | invalid status | DLT / park TODO |
| Infra | DB down | retry/backoff TODO |
