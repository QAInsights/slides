---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 19 - Understanding Flame Graphs 🔥 in yCrash
## naveenkumar ~ qainsights.com

---

# What is Flame Graph 🟪🟩🟦?  

- Invented by Brendan Gregg  
- "are a visualization of profiled software, allowing the most frequent code-paths to be identified quickly and accurately"  

--- 

# How to read Flame Graphs?

- x-axis -> profile population, sorted alphabetically
- y-axis -> stack depth starting from zero
- each rectangle -> stack frame; wider the frame, more often in the stacks
- colors are _random_
- https://github.com/brendangregg/FlameGraph


---
layout: center
class: text-center
---

# Demo ⌛
