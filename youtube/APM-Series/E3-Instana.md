---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# APM & Observability Series

# Episode 03 - Instana 🤖 

## naveenkumar ~ qainsights.com

---

# Instana 🤖  

- acquired by IBM
- first and only fully automated Application Performance Management (APM) solution designed specifically for the challenges of managing microservice and cloud-native applications
- supports variety of agents
- supports hundreds of technolgies
- https://play-with.instana.io 🏑

---

# Features ✅

- monitor web, mobile
- monitor apps, services, k8s, serverless
- monitor infrastructure
- RCA 
- automatic discovery 
- supports OpenTelemetry, Jaeger and more
- unbounded analytics
- pipeline feedback

--- 

# Installation 🗜

- https://www.instana.com/trial/
- https://github.com/instana/robot-shop

```docker
#!/bin/bash

sudo docker run \
--detach \
--name instana-agent \
--volume /var/run:/var/run \
--volume /run:/run \
--volume /dev:/dev:ro \
--volume /sys:/sys:ro \
--volume /var/log:/var/log:ro \
--privileged \
--net=host \
--pid=host \
--env="INSTANA_AGENT_ENDPOINT=ingress-orange-saas.instana.io" \
--env="INSTANA_AGENT_ENDPOINT_PORT=443" \
--env="INSTANA_AGENT_KEY=XXXXXXXXXXX" \
instana/agent
```

---
layout: center
class: text-center
---

# Demo ⌛
