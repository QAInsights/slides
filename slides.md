---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# Performance Engineering Series
# Episode 15 - jmap and JCmd 📈
## naveenkumar ~ qainsights.com

---

# jmap 📈

- prints shared object memory maps or heap memory details of a given process or core file or a remote debug server
- `jmap`
- packaged with JDK

--- 

# jmap commands ⏩

- `jmap -h`
- `jmap -dump:format=b,file=dumphere.hrof <pid>`
- `jmap -dump:live,format=b,file=dumphere <pid>`
- `jmap -histo:live <pid>`
- `jmap -finalizerinfo <pid>`
- `jmap -clstats <pid>`

---

# JCmd

- utility is used to send diagnostic command requests to the JVM
- must be used on the same machine where the JVM is running

---

# JCmd commands 🌌

- `jcmd -h`
- `jcmd <pid>`
- `jmcd <pid> VM.version`
- `jcmd <pid> GC.heap_dump here`

---
layout: center
class: text-center
---

# Demo ⌛

