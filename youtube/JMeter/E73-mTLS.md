---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---
<center>
<img src="/assets/qainsights_logo.png" width=200 height=200 />
</center>

# 73 - mTLS in JMeter
# w/ nginx and flask demo
## naveenkumar ~ qainsights.com

---

# 🔐 mTLS

- mutual Transport Layer Security (TLS)
    - TLS formerly known as SSL
- both client and server use X. 509 digital certificates to authenticate
- often used in Zero Trust security framework

---

# 📦 Entities

- public and private keys
- anything encrypted with the public key can be decrypted with the private key
- anything encrypted with the private key can be decrypted with the public key

---

# 🙋‍♂️ How mTLS works?

<center>
<img src="/assets/mtls.png" width=500 height=500 />
</center>

---

# 🔐 mTLS in JMeter 

- JMeter supports JKS and PKCS12 e.g. *.p12

- `KeyStore Explorer` to create JKS and export to various formats

- A Java KeyStore is a file format that stores a collection of cryptographic keys and certificates.
- `JAVA_HOME/jre/lib/security/cacerts`
- default keystore password `changeit`

- in `system.properties` add `javax.net.ssl.keyStore=<JKS_filename.jks>` and `javax.net.ssl.keyStore=<JKS_filename.jks>`

---

# 🙋‍♂️ What is required for PKCS12?

- `client.crt`
- `client.key`
- optionally `ca-cert`

---

# ⏲ Demo

- certificates generation
- nginx
- python

---
layout: center
class: text-center
---

# Demo ⌛
