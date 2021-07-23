---
theme: seriph
background: https://source.unsplash.com/1600x900/?javascript,code
class: text-center
layout: cover
---

# Learn k6 Series

# E4 - HTTP Methods

## naveenkumar | qainsights.com

---

# HTTP Methods 🔢


- set of request methods to perform the desired action on the given resource
- HTTP verbs
- GET, POST, PUT, PATCH, OPTIONS, DEL, HEAD and more

---

# HTTP requests in k6 ▶

- `k6/http` module contains functionality 
- `get()`,`post()`,`put()`, `patch()`, `del()`, `options()`, `batch()` and `request()`
- k6 will automatically apply `tags` which will be helpful in filtering

```json
{
	"type": "Point",
	"data": {
		"time": "2021-07-22T16:54:22.5019632-04:00",
		"value": 413.0009,
		"tags": {
			"expected_response": "true",
			"group": "",
			"method": "GET",
			"name": "https://reqres.in",
			"proto": "HTTP/2.0",
			"scenario": "default",
			"status": "200",
			"tls_version": "tls1.3",
			"url": "https://reqres.in"
		}
	},
	"metric": "http_req_duration"
}
```

---
layout: center
class: text-center
---

# 

# Demo ⌛ 
