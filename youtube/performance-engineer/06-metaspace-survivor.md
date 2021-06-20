---
theme: seriph
background: https://source.unsplash.com/1600x900/?coffee
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 06 - Metaspace & Survivor 💝

## naveenkumar ~ qainsights.com

---

# Metaspace

- `Metaspace` was known as `Permgen`
    - class metadata
    - `Permgen` removed in JDK 8
    - It also leads to OOM
- Starting JDK 8 -> `Metaspace`
    - keep growing automatically by default
    - keeps objects on native memory (on disk)
    - `-XX:MaxMetaspaceSize=256m` in JMeter

--- 

# Survivor 0 and 1

- It makes GC process efficient

---
layout: center
class: text-center
---

# Demo ⌛

