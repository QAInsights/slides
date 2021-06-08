---
theme: seriph
background: https://source.unsplash.com/1600x900/?network,code
class: text-center
layout: cover
---

# Performance Engineering Series
# Episode 01 - BuggyApp

performance engineering | naveenkumar | qainsights.com

---

# About this series


- Less Performance Testing ☕
- More Performance Engineering 🔝


---

# Prerequisites

- BuggyApp
- JMeter
- Eclipse MAT
- VisualVM
- JMC
- yCrash


---

# About BuggyApp 🐛

- 🐛 simple Java app to simulate various failures
- 👩‍💻 CLI and Web app

---

# CLI Installation 

```bash

git clone https://github.com/ycrash/buggyapp

cd buggyapp

ant clean

ant dist-ee

ant dist-cmd

```

--- 

# Web App Installation

```bash

buggyapp\launch.bat

buggyapp\launch.sh

```

> launch http://localhost:9010



---

# Execution

```java

java -Xmx50m -jar buggyApp.jar PROBLEM_OOM

java -jar buggyApp.jar PROBLEM_STACKOVERFLOW

```

---
layout: center
class: text-center
---

# Demo

⌛ 