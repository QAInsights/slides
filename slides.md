---
theme: seriph
background: https://source.unsplash.com/1600x900/?javascript,code
class: text-center
layout: cover
---

# Learn k6 Series

# E3 - Data Parameterization in k6  

## naveenkumar | qainsights.com

---

# Data Parameterization 🔢


- testing the application with different data for each iteration
- every request is unique, helps to test the application more realistic
- prevent caching 

---

# How to parameterize ❓

- multiple ways to do data parameterization e.g. `json`, `csv`, or `faker` 
- generate set of data or use `faker` library
- use `SharedArray` from `k6`
- read the data

---

# How SharedArray works? 🔢

- `array-like` object 
- takes `name` and `function`
- readOnly constructor, not possible to communicate between VUs
- `length`, `array[0]`, `for`

---
layout: center
class: text-center
---

# Demo

⌛ 
