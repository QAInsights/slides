---
theme: seriph
background: https://source.unsplash.com/1600x900/?javascript,code
class: text-center
layout: cover
---

# Learn k6 Series

# E5 - Checks

## naveenkumar | qainsights.com

---

# Checks ✅


- checkpoints, assertions
- do not stop the execution
- stores the result and compare the `actual` with the `expected`

---

# Prerequisites ✔

- `import { check } from "k6";`

```javascript
export default function () {
    const res = http.get("https://reqres.in/api/users?page=2");

    check(res, {
        'is status 200': r => r.status === 200,        
    });
```

---
layout: center
class: text-center
---

# 

# Demo ⌛ 
