---
theme: seriph
background: https://source.unsplash.com/1600x900/?tools
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 10 - DeadLock 🔐

## naveenkumar ~ qainsights.com

---

# What is Deadlock? 😐🔒

- *describes a situation where two or more threads are blocked forever, waiting for each other.*

--- 

# BuggyApp 🐛

> `java -Xmx256m -jar .\buggyApp.jar PROBLEM_DEADLOCK`

- two threads: `ThreadA` and `ThreadB`

- `ThreadA` acquires the lock on the resource `foo`, `sleeps` and then trying to acquire `bar`
- `ThreadB` acquires the lock on the resource `bar`, `sleeps` and then trying to acquire `foo`
    - *deadlock*

- put the 🔒 lock using `synchronized`


---
layout: center
class: text-center
---

# Demo ⌛

