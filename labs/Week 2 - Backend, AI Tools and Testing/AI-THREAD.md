# AI Thread — AI in Backend Development and Testing

**Week 2** · Java & Angular Fullstack Bootcamp

This section is **new** in the Angular outline. Integrate it **alongside** Modules 8–21. Do not replace Labs 8–21.

Each AI Thread covers three angles from the course outline:

1. **AI best practices and governance/security**
2. **AI's impact on this week's domain**
3. **Agentic tools in use**

---

## Classroom segment (15–20 minutes)

### A. Best practices and governance/security

- Never commit Copilot-generated secrets, fake JWTs, or connection strings.
- Generated JUnit/Mockito tests must assert **Northstar fixtures** (`CUS-1001` Amina ACTIVE, `CUS-1002` Ravi PROSPECT) — not invented IDs.
- Review REST/OpenAPI sketches the same way you review Java: status codes, error shape, and resource names.

**Discussion prompt:** Copilot wrote a test that mocks the repository and always returns `null`. What would that hide in Lab 17–18?

### B. Impact on backend and testing

- Faster Maven/`pom.xml` and DTO boilerplate — you still own layer boundaries (Lab 8) and the REST contract (Lab 13).
- Risk: accepting SOAP/WSDL or React snippets from an assistant trained on other courses. This course is **REST + Angular**.
- Benefit: asking the assistant to *explain* a failing Surefire test after you have run `mvn test` yourself.

### C. Agentic tools in use

- GitHub Copilot in IntelliJ for Labs 10–11 (generation + test/refactor).
- Optional: Copilot Chat to draft OpenAPI descriptions — you still own the YAML in Lab 13.
- Log one accept / one reject of generated test code in `java-bootcamp/notes/`.

---

## What is not a Week 2 extra lab

Evidence stays with Labs 8–21. Use this thread after Copilot modules and before Lab 13: “Did the assistant invent SOAP or React when this course uses REST and Angular?”
