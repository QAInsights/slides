---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---
<center>
<img src="/assets/qainsights_logo.png" width=200 height=200 />
</center>

# Deploy JMeter Distributed Load Testing Infra on AWS using Terraform
## naveenkumar ~ qainsights.com

---

# Recap ⏪

- Infrastructure as Code (IaC) 🏗
- Terraform ☘ 
- Prerequisites ✅
- AWS Setup 🏁
- Terraform ✍

---

# Prerequisites ✅

- Terraform CLI
- AWS CLI
- AWS IAM
---

# Distributed Load Testing Infra 🏭

- one node to run JMeter controller
- distribute the load using multiple worker nodes for high scale testing
- manual setup consumes time and error prone


---

# Terraform ✍

- Terraform module for JMeter
    - https://registry.terraform.io/modules/QAInsights/jmeter-distributed-load-test-infra/aws/latest
    - spins up an controller EC2 instance
    - spins up `n` worker EC2 instances
    - `t2.small` - NOT FREE TIER
    - install Java, JMeter, and JMeter Plugins

<br> 

```
terraform init
terraform plan
terraform apply
```
```
terraform destroy
```

---
layout: center
class: text-center
---

# ⌛