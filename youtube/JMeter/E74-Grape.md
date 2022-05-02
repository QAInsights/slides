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

# 74 - 🍇 Grape in Groovy
# in JSR223 Sampler
## naveenkumar ~ qainsights.com

---

# 🚀 Extending the JSR223 Sampler 

- built-in features might not be enough to handle all the scenarios
- leverage existing libraries 🎡

---

# 🍇 Grape

- The Groovy Adaptable Packaging Engine
- Groovy Advanced Packaging Engine
- JAR dependency manager embedded into Groovy
- based on Ivy [https://ant.apache.org/ivy/](https://ant.apache.org/ivy/)

---

# 📜 Annotations

- Example
```groovy
@Grapes(
    @Grab(group='org.apache.httpcomponents', module='httpclient', version='4.5.13')
)
```
- Short annotation

```groovy
@Grab('org.springframework:spring-orm:5.2.8.RELEASE')
```
- Multiple annotations
```groovy
@Grapes([
   @Grab(group='commons-primitives', module='commons-primitives', version='1.0'),
   @Grab(group='org.ccil.cowan.tagsoup', module='tagsoup', version='0.9.7')
])
```

- Windows: `C:\Users\<user>\.groovy\grapes`
- macOS: `/Users/<user>/.groovy/grapes`
- Linux: `/home/<user>/.groovy/grapes`

---

# 👩‍💻 Command Line Tool 

```groovy
grape -v // print version

grape list // list all installed grapes

grape install com.google.guava guava 31.1-jre // install guava

grape uninstall com.google.guava guava 31.1-jre // uninstall guava

```
---

# 📥 Repository

```groovy
@GrabResolver(name='restlet', root='http://maven.restlet.org/')
@Grab(group='org.restlet', module='org.restlet', version='1.1.6')
```
---

# 👋 Hello Time

```groovy
@Grapes(
    @Grab(group='joda-time', module='joda-time', version='2.10.14')
)
import org.joda.time.LocalDateTime

LocalDateTime currentDateTime = new LocalDateTime()
log.info "Local Time is " + currentDateTime 
```

---

# 🧰 Ivy Settings

- `grapeConfig.xml`

```xml
<ivysettings>
  <settings defaultResolver="downloadGrapes"/>
  <resolvers>
    <chain name="downloadGrapes" returnFirst="true">
      <filesystem name="cachedGrapes">
        <ivy pattern="${user.home}/.groovy/grapes/[organisation]/[module]/ivy-[revision].xml"/>
        <artifact pattern="${user.home}/.groovy/grapes/[organisation]/[module]/[type]s/[artifact]-[revision](-[classifier]).[ext]"/>
      </filesystem>
      <ibiblio name="localm2" root="${user.home.url}/.m2/repository/" checkmodified="true" changingPattern=".*" changingMatcher="regexp" m2compatible="true"/>
      <!-- TODO: add 'endorsed groovy extensions' resolver here -->
      <ibiblio name="ibiblio" m2compatible="true"/>
    </chain>
  </resolvers>
</ivysettings>
```
---
layout: center
class: text-center
---

# Demo ⌛
