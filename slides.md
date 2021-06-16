---
theme: seriph
background: https://source.unsplash.com/1600x900/?trash
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 04 - Garbage Collection 🚮

## naveenkumar ~ qainsights.com

---

# Garbage Collection 🚮

- *Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects*
- automatic memory management
- cleans up unreferenced objects
- expensive process

--- 

# Type of Garbage Collection

- Minor GC
    - Young Generation 🐤
- Major GC
    - Older Generation 🐓
- Full GC
    - Young + Old 💯

---

# How GC works?

- Step 1 > Marking the unreferenced objects
- Step 2 > Sweeping the unreferened objects
    - Compacting

- Mark and Sweep process inefficient in a large heap

- Minor GC - shortly lived objects
- Major GC - long lived objects

---
layout: center
class: text-center
---

# Demo ⌛

