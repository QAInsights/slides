---
theme: seriph
background: https://source.unsplash.com/1600x900/?code
class: 'text-center'
layout: cover
---

# Learn JMeter Series - #66
# Running JMeter Tests using Maven
## naveenkumar ~ qainsights.com

---

# Maven 🌀

- software project management and comprehension tool
- project's build, reporting and documentation
- based on POM 
- https://maven.apache.org

--- 

# Maven Plugin for JMeter 🧪

- https://github.com/jmeter-maven-plugin/jmeter-maven-plugin
```xml
<plugin>
    <groupId>com.lazerycode.jmeter</groupId>
    <artifactId>jmeter-maven-plugin</artifactId>
    <version>3.4.0</version>
    <executions>
        <!-- Generate JMeter configuration -->
        <execution>
            <id>configuration</id>
            <goals>
                <goal>configure</goal>
            </goals>
        </execution>
       ...
    </executions>
</plugin>
```
---

# Steps 🔢

- Add the plugin in `pom.xml`
- Place your JMeter test plan and its dependencies
- Run the test `mvn clean verify`

---
layout: center
class: text-center
---

# Demo ⌛

