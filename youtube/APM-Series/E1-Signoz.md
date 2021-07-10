---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# APM & Observability Series  

# Episode 01 - SigNoz 🔥  

## naveenkumar ~ qainsights.com

---

# SigNoz 📊

- observability platform  
- open source alternative  
- native support for OpenTelemetry
- Golang & React-Typescript

--- 

# Installation 🗜

- https://github.com/SigNoz/signoz
- Using Docker or Helm
- `git clone https://github.com/SigNoz/signoz.git && cd signoz/deploy/`

---

# Performance Testing ⚡

```bash
kubectl -n sample-application run strzal --image=djbingham/curl --restart='OnFailure' -i --tty --rm --command 
-- curl -X POST -F 'locust_count=6' -F 'hatch_rate=2' http://locust-master:8089/swarm
```

```bash
kubectl -n sample-application run strzal --image=djbingham/curl --restart='OnFailure' -i --tty --rm --command 
-- curl http://locust-master:8089/stop
```

---
layout: center
class: text-center
---

# Demo ⌛
