---
theme: seriph
background: https://source.unsplash.com/1600x900/?tools
class: text-center
layout: cover
---

# Performance Engineering Series
# Episode 02 - Tools

## naveenkumar ~ qainsights.com

---

# Tools Arsenal 🏹

- Eclipse MAT
- VisualVM
- Java Mission Control
- yCrash


---

# Eclipse Memory Analyzer Tool (MAT)

- Java heap analyzer tool
- stand-alone or use it in Eclipse IDE
- https://www.eclipse.org/mat/downloads.php

---

# VisualVM

- stand-alone or use it with GraalVM
- integrates with IDE
- Oracle JDK 6~8. Discontinued since 9
- https://visualvm.github.io

--- 

# Java Mission Control (JMC)

- suite for the JVM
- stand-alone or use it in Eclipse IDE
- free
- https://adoptopenjdk.net/jmc
- https://www.oracle.com/java/technologies/javase/products-jmc8-downloads.html

---

# yCrash

- Java Root Cause Analyzer
- captures & analyzes GC Logs, thread dumps, heap dumps and more
- free trial
- https://ycrash.io/yc-trial.jsp

---
layout: center
class: text-center
---

# Demo

⌛

---
theme: seriph
background: https://source.unsplash.com/1600x900/?coffee,java
class: text-center
layout: cover
---

# Performance Engineering Series
# Episode 03 - Java, JDK, JRE, and JVM

## naveenkumar ~ qainsights.com

---

# Java ☕

- general-purpose programming language
- Object-Oriented Paradigm
- James Gosling
- May 23, 1995 ( I was 8 years old 👦)
- Java 16 (Stable Release)

---

# Java Development Kit 💼

- kit to develop Java applications 
- multiple vendors
    - Oracle
    - OpenJDK
    - Azul
    - IBM
    - Microsoft
- free and commercial 💰
- includes Java Runtime Enviroment

---

# Java Runtime Environment 🏃‍♂️

- helps to run Java code
- includes Java Virtual Machine, core classes and other files
- you do not need JDK in production

---

# Java Virtual Machine 💻

- creates during Java program execution
- make sure the Java app runs smoothly
- JVMs can also run Scala, Kotlin, Groovy and more

---

# Hello there!

```
```
| Java Code
```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello there!");
    }
}
```

| Compile 
```bash
$ javac Hello.java
```
| Output

```bash
$ java Hello
Hello there!

```