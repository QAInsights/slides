---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
lineNumbers: true
monaco: 'dev'
---
<center>
<img src="/assets/qainsights_logo.png" width=200 height=200 />
</center>

# 76 - Getting Started with JMeter DSL
## naveenkumar ~ qainsights.com

---

# 🤔 Domain Specific Language

- A domain-specific language (DSL) is a computer language specialized in a particular application domain.
- HTML, Regular Expressions, and more

---

# 📦 JMeter DSL

- open source initiative from Abstracta
- JMeter-as-Code
```java
@Test
public void testHelloWorld() throws IOException {
    TestPlanStats helloWorld = testPlan(
            threadGroup(1,1,
                    httpSampler("https://example.com")
                            .children(
                                    responseAssertion().containsSubstrings("Example Domain")
                            )
            ),
            jtlWriter("HelloWorld" + Instant.now().toString().replace(":","-") + ".jtl")
    ).run();
}
```

---

# 🤔 But why?

- JMeter used to be a developer's tool
- After several enhancements and features, it became a tool for test engineers as well

---

# 👍 What problem is JMeter DSL solving?

- making JMeter more Git friendly, developer friendly, and more productive
- CI/CD friendly
- extends JMeter's capabilities further

---

# ✅ Features

- Advanced Thread Group configuration
- Debugging
- Reporting
- Extractions
- Logical Controllers
- Converters e.g. DSL to JMX
- Visualization


---
layout: center
class: text-center
---

# Demo ⌛