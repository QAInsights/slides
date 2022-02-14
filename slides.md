---
theme: seriph
background: https://source.unsplash.com/1600x900/?javascript,code
class: text-center
layout: cover
---

# Learn k6 Series

# E7 - Scenarios and Executors 🏃‍♀️

## naveenkumar | qainsights.com

---

# Scenarios 📦


- available since 0.27.0
- advanced configuration for the VUs and iterations
- parallel or sequential execution or both
- multiple scenarios

---

# How to ❔

- leverages the `options` object

```javascript
export const options = {
  scenarios: {
    my_scenario: {
      executor: 'shared-iterations',
      startTime: '10s',
      gracefulStop: '5s',
      vus: 10,
      iterations: 2,
      maxDuration: '10s',
    },
    my_another_scenario: {
      /*...*/
    },
  },
};
```
---

# Executors 🚀

- work engines 🏇

- `shared-iterations`
- `per-vu-iterations`
- `constant-vus`
- `ramping-vus`
- `constant-arrival-rate`
- `ramping-arrival-rate`
- `externally-controlled`


---
layout: center
class: text-center
---

# 

# Demo ⌛ 
