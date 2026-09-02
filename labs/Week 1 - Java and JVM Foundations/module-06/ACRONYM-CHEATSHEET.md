# Module 6 — Acronym Cheatsheet

**Topic:** Streams and Functional Programming  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **22** curriculum slide diagram title(s) plus slide text for this module._

---

## Java & JVM

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Lambda** | Lambda Expression | Short anonymous function used with streams/functional APIs. |
| **Optional** | java.util.Optional | Wrapper that may or may not hold a value (avoid raw null). |
| **Stream** | Java Stream API | Pipeline for processing collections functionally. |
| **SAM** | Single Abstract Method | The one method a functional interface must define — what makes it lambda-compatible. |
| **JDK** | Java Development Kit | The compiler/runtime install (JDK 21) used for the module. |
| **JVM** | Java Virtual Machine | Runs the compiled code; its optimizations affect measured stream performance. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## Performance & JVM tuning

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CPU** | Central Processing Unit | Processing resource that heavy/parallel stream work consumes. |
| **GC** | Garbage Collection | Automatic memory cleanup; watch for GC pressure from excess object creation. |
| **I/O** | Input/Output | Reading/writing data (disk, network); minimize and prefer buffered streams. |
| **JIT** | Just-In-Time (compilation) | The JVM compiles hot code paths to native code while running, improving performance. |
| **JFR** | Java Flight Recorder | Built-in profiling tool for measuring where time/memory actually goes. |
| **JMH** | Java Microbenchmark Harness | Tool for accurate micro-benchmarking (used for the stream timing exercises). |
| **NIO** | New I/O (Non-blocking I/O) | Java's high-throughput I/O API, preferred for demanding I/O workloads. |

---

## Enterprise & business context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Business system example — where the groupingBy()-style reporting patterns get reused. |
| **ETL** | Extract, Transform, Load | Data pipeline workflow that streams are well suited to implement. |
| **HR** | Human Resources | Example department used in the grouping/streams exercises. |
| **IoT** | Internet of Things | Example source of real-time event streams (sensor/device data). |
| **KPI** | Key Performance Indicator | Business metric aggregated/reported using stream operations. |

---

## Lab & real-world context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **GitHub** | Your private repo | Where you commit lab practice work (`java-bootcamp`). Nothing is submitted or graded. |

---

## One-line memory aid

> Focus first on: **Lambda** · **Stream** · **Optional** · **API** · **SAM**.

---

**Related:** [Module 6 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
