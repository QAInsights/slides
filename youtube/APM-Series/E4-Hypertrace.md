---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# APM & Observability Series

# Episode 04 - Hypertrace

## naveenkumar ~ qainsights.com

---

# Hypertrace 🤖  

- real-time observability platform that helps teams make sense of their production requests and trends within their network
- which services are causing overload?
- why a specific user's request failed?
- new version is causing a problem?

---

# Features ✅

- basic features: UI, Supports k8s w/ Helm
- advanced features: supports major trace formats, no samplling collector, realtime processing

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
