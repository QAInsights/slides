---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# Learn JMeter Series - #65
# Running JMeter Tests using GitHub Actions

## naveenkumar ~ qainsights.com

---

# What is GitHub Actions? ⚡

- *automate all your software workflows, now with world-class CI/CD*
- Build, Test, and Deploy using GitHub Actions

--- 

# PerfAction 

- is a `GitHub Action` helps to automate performance testing using Apache JMeter and its plugins
- `free` and `open-source`
- https://github.com/marketplace/actions/perfaction-for-jmeter

---

# How it works?

- Create a repo
- Add an action
- Trigger it

```yaml
---
- name: JMeter Test
  uses: QAInsights/PerfAction@v2.0
  with:
    test-plan-path: ./TestPlans/S01_SimpleExample/S01_SimpleExample.jmx
    args: ""

- name: Upload Results
  uses: actions/upload-artifact@v2
  with:
    name: jmeter-results
    path: result.jtl
```
---
layout: center
class: text-center
---

# Demo ⌛

