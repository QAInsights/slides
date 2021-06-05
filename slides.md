---
theme: seriph
background: https://source.unsplash.com/1600x900/?network,code
class: text-center
layout: cover
---

# Netdata + JMeter

performance monitoring | naveenkumar | qainsights.com

---

# Netdata + Apache JMeter Integration


- 📊 Prometheus

---

# Prerequisites

- Prometheus
- JMeter
- JMeter Plugins w/ Prometheus Listener


---

# Prometheus Config

```yml 
scrape_configs:
  # The job name is added as a label `job=<job_name>` to any timeseries scraped from this config.
  - job_name: 'prometheus'
    static_configs:
    - targets: ['localhost:9090']

  - job_name: 'jmeter'
    static_configs:
    - targets: ['localhost:9270']

```
---

# Execution

- Start Prometheus
- Start JMeter

---
layout: center
class: text-center
---

# Demo

⌛ 
