---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# APM & Observability Series

# Episode 02 - Jaeger 

## naveenkumar ~ qainsights.com

---

# Jaegar 📊  

- distributed tracing system  
- inspired by Dapper and OpenZipkin  
- Go and React/Javascript UI  
- CNCF Graduated project

---

# Features ✅

- Distributed context propagation
- Distributed transaction monitoring
- Root cause analysis
- Service dependency analysis
- Performance / latency optimization
- Multiple storage backends - Cassandra and ElasticSearch

--- 

# Installation 🗜

- https://github.com/jaegertracing/jaeger

```docker
$ docker run -d --name jaeger \
  -e COLLECTOR_ZIPKIN_HOST_PORT=:9411 \
  -p 5775:5775/udp \
  -p 6831:6831/udp \
  -p 6832:6832/udp \
  -p 5778:5778 \
  -p 16686:16686 \
  -p 14268:14268 \
  -p 14250:14250 \
  -p 9411:9411 \
  jaegertracing/all-in-one:1.24

```

---

# OpenTelemetry 🎯

- OpenCensus + OpenTracing = OpenTelemetry
- *is a collection of tools, APIs, and SDKs. You can use it to instrument, generate, collect, and export telemetry data (metrics, logs, and traces) for analysis in order to understand your software's performance and behavior.*

- Jaeger falls under OpenTracing standards

---

# Terms 🏗

- `Span` - representing an individual unit of work done in a distributed system
- `Tags` - annotation using key:value pairs
- `Logs` - timed logs messages using key:value pairs
- `Baggage` - `SpanContext` carries data across process boundaries
- `Tracer` - implementation of `Spans`

---
layout: center
class: text-center
---

# Demo ⌛
