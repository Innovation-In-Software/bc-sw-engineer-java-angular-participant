# AI Thread — AI in Enterprise Frameworks

**Week 3** · Java & Angular Fullstack Bootcamp

This section is **new** in the Angular outline. Integrate it **alongside** Modules 22–29. Do not replace Labs.

Each AI Thread covers three angles from the course outline:

1. **AI best practices and governance/security**
2. **AI's impact on this week's domain**
3. **Agentic tools in use**

---

## Classroom segment (15–20 minutes)

### A. Best practices and governance/security

- Generated `@RestController` / Security snippets must match **this** course: Spring MVC REST, not Spring-WS or SOAP.
- Never accept Copilot-invented secrets in `application.yml` or JWT signing keys.
- Constructor injection stays the rule — reject field `@Autowired` “because the assistant did it.”

**Discussion prompt:** Copilot added `@CrossOrigin("*")` with credentials on the Customer controller. What would you change for an Angular app on `http://localhost:4200`?

### B. Impact on enterprise frameworks

- Faster Boot starters and mapping boilerplate — you still own bean graphs (Lab 22), auto-config vs ownership (Lab 23), and HTTP status contracts (Lab 24).
- Risk: SOAP/WSDL or React examples from other courses leaking into Labs 24–29.
- Benefit: asking the assistant to *explain* a failing MockMvc assertion after you have run `mvn test`.

### C. Agentic tools in use

- Copilot for mapping methods and test stubs; you keep the Northstar fixtures (`CUS-1001` / `CUS-1002`, `lab-request-001`).
- Optional: Copilot Chat to draft CORS notes — you still own `docs/cors-angular.md`.
- Log one accept / one reject of generated Spring annotations in `java-bootcamp/notes/`.

---

## What is not a Week 3 extra lab

Evidence stays with Labs 22–29. Standing checkpoint: “Did the assistant invent SOAP, WSDL, or React when this week is Spring MVC REST and Angular CORS?”
