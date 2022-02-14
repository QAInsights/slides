---
theme: seriph
background: https://source.unsplash.com/1600x900/?javascript,code
class: text-center
layout: cover
---

# Learn k6 Series

# E6 - Thresholds

## naveenkumar | qainsights.com

---

# Thresholds 🟥


- Service Level Agreement (SLA)
- declare pass/fail criteria to validate the performance
- e.g. `95 percentile response time < 1s`
- must-have for performance testing
- supports custom metrics

---

# How to ❔

```javascript
export const options = {
    thresholds: {
      http_req_duration: [{
        threshold: 'p(95) < 100', //pass criteria
        abortOnFail: true, 
      }]      
    },
  };
```
---

# Metric Types

- Counter 1️⃣
- Gauge 🌡
- Rate 🚤
- Trend 📈

---
layout: center
class: text-center
---

# 

# Demo ⌛ 
