---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# Deploy JMeter on AWS using Terraform
## naveenkumar ~ qainsights.com

---

# Infrastructure as Code (IaC) 🏗 

- helps to build, change, and version infrastructure safely and efficiently

---

# Terraform ☘    

- open-source infrastructure as code software tool that provides a consistent CLI workflow to manage hundreds of cloud services. 
- three flavors: CLI, Cloud, and Enterprise
- Write, Plan, and Apply

--- 

# Prerequisites ✅

- Terraform CLI
- AWS CLI
- AWS IAM
---

# AWS Setup 🏁

- AWS Key Pair
- IAM User
- AWS CLI Configuration

---

# Terraform ✍

- Terraform module for JMeter
    - https://registry.terraform.io/modules/QAInsights/jmeter/aws/latest
    - spins up an EC2 instance
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