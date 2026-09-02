# Exercise 2 — Activate Build Profiles

**Module 9** · Checkpoint D · Exercises 1–6 Pass then Lab 9

## Activity card

| | |
| --- | --- |
| **Objective** | Explain dev/prod profiles, -P, and activeByDefault |
| **Skills practiced** | Maven profiles |
| **Expected outcome** | notes/profiles-notes.md with activation rules |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-09-exercises/` → notes/profiles-notes.md |
| **Checkpoint** | D (after slides 52–53) |

## What you will learn

- Profiles customize build/config without forking the whole POM
- -P selects a profile; activeByDefault needs care in CI
- Do not hide secrets inside committed profile properties

**Enterprise context:** Banks often use profiles for environment-specific endpoints — secrets stay outside Git.

## Profile map

| Idea | Easy meaning |
| ---- | ------------ |
| Profile | Named set of POM properties/plugins activated together |
| `activeByDefault` | Turns on unless another profile selection replaces the default set |
| `-Pprod` | Activate the `prod` profile from the command line |
| Property such as `app.env` | Value that resources or docs can document per environment |

## Example fragment (study only)

```xml
<profiles>
  <profile>
    <id>dev</id>
    <activation>
      <activeByDefault>true</activeByDefault>
    </activation>
    <properties>
      <app.env>dev</app.env>
    </properties>
  </profile>
  <profile>
    <id>prod</id>
    <properties>
      <app.env>prod</app.env>
    </properties>
  </profile>
</profiles>
```

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
Keep `dev` as the laptop default.
Activate `prod` intentionally with `-Pprod`.
Never store real production secrets in `pom.xml` profiles.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Answer without running Maven yet

| Question | Your answer |
| -------- | ----------- |
| Which profile is active when you run plain `mvn package`? | |
| How do you activate `prod` on the command line? | |
| What is the `app.env` value under `dev`? | |
| What is the `app.env` value under `prod`? | |

### Step 2 — Check the reference

| Question | Answer |
| -------- | ------ |
| Default profile | `dev` (`activeByDefault`) |
| Activate prod | `mvn -Pprod …` (example: `mvn -Pprod package`) |
| `dev` `app.env` | `dev` |
| `prod` `app.env` | `prod` |

### Step 3 — Spot the mistakes

Explain why each is dangerous:

- putting production database passwords inside the `dev` profile;
- making `prod` `activeByDefault` on every engineer laptop;
- assuming profiles change Java package names (they do not — they change build/config properties);
- documenting secrets in profile properties or GitHub.

### Step 4 — Write one activation rule

Add to `profiles-notes.md`:

```markdown
Keep `dev` as the laptop default.
Activate `prod` intentionally with `-Pprod`.
Never store real production secrets in `pom.xml` profiles.
```

## Expected result

You can name the default profile, activate `prod` deliberately, and refuse secrets in POM properties.


## Debug / design challenge

Both dev and prod activeByDefault — what goes wrong?

## Predict the Output / Behavior

Which flag activates profile prod?

## Troubleshooting

See steps above if Maven commands fail. Prefer full logs (no `-q`) while learning.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Four Q&A rows match the reference | Pass / Fail |
| 2 | You flag at least two profile mistakes | Pass / Fail |
| 3 | Activation rule is written | Pass / Fail |
