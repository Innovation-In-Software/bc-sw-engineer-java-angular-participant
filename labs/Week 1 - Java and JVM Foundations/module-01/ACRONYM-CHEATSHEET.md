# Module 1 — Acronym Cheatsheet

**Topic:** JVM Architecture and Runtime Model  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **52** curriculum slide diagram title(s) plus slide text for this module._

---

## Java & JVM

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Bytecode** | — | Platform-neutral instructions the JVM executes. |
| **CCS** | Compressed Class Space | Metaspace sub-area for compressed class pointer data; shown in `jstat -gc`'s M/CCS columns. |
| **Class Loader** | — | Loads class files into the JVM. |
| **CMS** | Concurrent Mark Sweep | Older, mostly-concurrent GC with no compaction; low pause but deprecated. |
| **G1 GC** | Garbage-First Garbage Collector | Region-based collector, default since Java 9; balances pause time and throughput. |
| **GC** | Garbage Collection | Automatic memory cleanup of unused objects. |
| **Heap** | — | JVM memory area for objects. |
| **IHOP** | Initiating Heap Occupancy Percent | Heap-occupancy threshold (default ~45%) that triggers G1's concurrent marking cycle. |
| **JDK** | Java Development Kit | Tools to write and compile Java (javac, jars, docs). |
| **JIT** | Just-In-Time (compiler) | Turns hot bytecode into native machine code at runtime. |
| **JNI** | Java Native Interface | Lets Java call native (C/C++) libraries. |
| **JRE** | Java Runtime Environment | What you need to run Java programs (no full compiler toolchain). |
| **JVM** | Java Virtual Machine | Runs Java bytecode on your machine; makes Java portable. |
| **LIFO** | Last In, First Out | The order the Stack grows and shrinks in — the most recent frame is removed first. |
| **Metaspace** | — | JVM area for class metadata (replaces PermGen). |
| **NIO** | New I/O | Java's non-blocking, buffer-based I/O API (Collections, IO/NIO, JDBC live here). |
| **OOM / OOME** | OutOfMemoryError | JVM error thrown when it can't allocate more memory (heap, metaspace, or native threads). |
| **PC Register** | Program Counter Register | Per-thread pointer to the address of the next instruction to execute. |
| **Stack** | — | Per-thread memory for method frames and local primitives. |
| **STW** | Stop-The-World | A GC pause where all application threads freeze so the collector can safely work. |
| **WORA** | Write Once, Run Anywhere | Compile once to bytecode; run on any JVM. |
| **ZGC** | Z Garbage Collector | Low-pause GC for large heaps. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **DB** | Database | Persistent data store; one possible source a class loader reads classes from. |
| **JAR/WAR** | Java Archive / Web Archive | Packaged, deployable bundles of compiled classes and resources. |
| **OOP** | Object-Oriented Programming | Design with objects that hold data and behavior. |

---

## Java platform & enterprise APIs

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **EE** | Enterprise Edition | Java EE (now Jakarta EE): distributed-system APIs — EJB, JMS, JPA — for enterprise apps. |
| **EJB** | Enterprise JavaBeans | Java EE component model for distributed, transactional server-side business logic. |
| **JDBC** | Java Database Connectivity | Standard Java API for connecting to and querying relational databases. |
| **ME** | Micro Edition | Java ME: a compact Java platform for resource-constrained and embedded devices. |
| **SE** | Standard Edition | Java SE: the core Java platform this bootcamp focuses on (desktop/server apps). |
| **SSL** | Secure Sockets Layer | Legacy protocol (predecessor to TLS) for encrypting network connections; e.g. OpenSSL. |

---

## Native & bytecode tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ASM** | — | Low-level Java bytecode manipulation/analysis library, used alongside javap. |
| **CFR** | — | A popular Java decompiler tool for turning bytecode back into readable source. |
| **DLL** | Dynamic Link Library | Windows native library format (.dll) loaded by native methods via JNI. |
| **ICU** | International Components for Unicode | Native library providing locale/internationalization support. |
| **IR** | Intermediate Representation | Internal form the compiler builds mid-compilation, before generating bytecode. |
| **JAI** | Java Advanced Imaging | Java API/native library wrapper for advanced image processing. |

---

## Systems

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CPU** | Central Processing Unit | The processor executing instructions; a resource the JVM and native code compete for. |
| **OS** | Operating System | The platform (Windows/Linux/macOS) the JVM and native libraries run on top of. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |
| **JFR** | JDK Flight Recorder | Low-overhead, built-in JVM profiler that captures runtime events for later analysis. |
| **JMC** | JDK Mission Control | GUI tool for analyzing JFR recordings and monitoring the JVM. |
| **MAT** | Memory Analyzer Tool | Eclipse tool for analyzing heap dumps to find memory leaks. |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HA** | High Availability | Design so the system stays up despite failures. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SLA** | Service Level Agreement | Contracted reliability promise to customers. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables. |

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JMS** | Java Message Service | Java API for async messaging (queues/topics). |

---

## One-line memory aid

> Focus first on: **JDK** · **JRE** · **JVM** · **WORA** · **JNI**.

---

**Related:** [Module 1 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
