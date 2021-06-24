---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 12 - Stack Overflow 📚
## naveenkumar ~ qainsights.com

---

# What is Stack Overflow? 📚

- it happens when the JVM exceeds the stack memory
- e.g. recursive call

```groovy
callthis();

def callthis() {
		
  callthis();

}
```

--- 

# BuggyApp 🐛 

```bash
java -Xss180k -jar .\buggyApp.jar PROBLEM_STACKOVERFLOW
```

---
layout: center
class: text-center
---

# Demo ⌛

