---
theme: seriph
background: https://source.unsplash.com/1600x900/?coffee
class: 'text-center'
highlighter: shiki
---

# Performance Engineering Series
# Episode 04 - JVM Memory

## naveenkumar ~ qainsights.com

---

# mem.o.ry

- you need memory to run any applications
- Java has automatic memory management `garbage collector`

---

# JVM Memory
- Stack
- Heap
    - Young 🍼
        - Eden
        - Survivor S0
        - Survivor S1
    - Old 👴
- Metaspace

---

# Stack
- stores local variables
- fast access ⚡
- contiguous block 📦
- Last In First Out
- JVM argument Xss

---

# Heap
- stores object 🚗
- size is more 🆙
- random allocation 
- slower 🐌
- JVM argument Xms and Xmx
