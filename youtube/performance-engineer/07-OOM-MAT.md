---
theme: seriph
background: https://source.unsplash.com/1600x900/?coffee
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 07 - Out of Memory

## naveenkumar ~ qainsights.com

---

# Types of OOM

- Heap <===
- Metaspace
- GC Overhead
- Swap space
- Stack trace w/ native method
- Requested Array size exceeds
- Compressed class space

--- 

# BuggyApp

- PROBLEM_OOM -> Heap Space
    - `java -Xmx512m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./<file-name>.hprof -jar .\buggyApp.jar PROBLEM_OOM`
    - `java -Xmx512m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./ -jar .\buggyApp.jar PROBLEM_OOM`


---
layout: center
class: text-center
---

# Demo ⌛

