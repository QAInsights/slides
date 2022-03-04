---
theme: seriph
background: https://source.unsplash.com/1600x900/?javascript,code
class: text-center
layout: cover
---

# Learn k6 Series

# E8 - Metrics and Result Output 📊

## naveenkumar | qainsights.com

---

# Metrics 📈


- built-in and custom metrics
- `vus`, `vus_max`, `iterations`, and more
- `http_req_...` and more

---

# Custom Metrics 📊 

- four types of metrics
- `counter`, `gauge`, `rate`, and `trend`

```javascript
import { Counter, Gauge, Rate, Trend } from "k6/metrics";

const myMetric = new(<metric_type>);
myMetric.add(<value>);

```
---

# Result Output ☁

- k6 supports streaming results to a variety of output formats
- CSV, JSON, k6 Cloud, Grafana Cloud, AWS Cloud Watch, InfluxDB, and more


---
layout: center
class: text-center
---

# 

# Demo ⌛ 
