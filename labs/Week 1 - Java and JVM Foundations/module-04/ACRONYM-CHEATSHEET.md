# Module 4 — Acronym Cheatsheet

**Topic:** Memory Management and Performance  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **17** curriculum slide diagram title(s) plus slide text for this module._

---

## Java & JVM

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **G1 GC** | Garbage-First Garbage Collector | Default modern JVM collector that balances pause time and throughput. |
| **GC** | Garbage Collection | Automatic memory cleanup of unused objects. |
| **Heap** | — | JVM memory area for objects. |
| **JDK** | Java Development Kit | Tools to write, compile, and run Java (this module's Lab 4 requires JDK 21). |
| **JIT** | Just-In-Time (compiler) | Turns hot bytecode into native machine code at runtime. |
| **JVM** | Java Virtual Machine | Runs Java bytecode on your machine; makes Java portable. |
| **Metaspace** | — | JVM area for class metadata (replaces PermGen); can also run out of memory (OOM: Metaspace). |
| **OOM / OOME** | OutOfMemoryError | JVM error thrown when it can't allocate more memory (heap space or metaspace). |
| **Stack** | — | Per-thread memory for method frames and local primitives. |
| **STW** | Stop-The-World | A GC pause where all application threads freeze so the collector can safely work. |
| **try-with-resources** | — | Auto-closes resources (files, connections) in a try block. |
| **ZGC** | Z Garbage Collector | Low-pause GC for large heaps. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DB** | Database | Persistent data store; unclosed DB connections are a common memory-leak cause. |
| **I/O** | Input/Output | Reading/writing files, sockets, and streams — a common performance bottleneck. |

---

## Tooling & diagnostics

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app for Lab 4 (IntelliJ IDEA Community or VS Code). |
| **JMH** | Java Microbenchmark Harness | Tool for writing accurate, JIT-aware microbenchmarks to measure code performance. |
| **JMX** | Java Management Extensions | Technology JConsole and similar tools use to monitor/manage a running JVM. |
| **LRU** | Least Recently Used | Common cache eviction policy — discard the least recently accessed entries first. |
| **PID** | Process ID | OS process identifier used to target JVM diagnostic commands (jstat, jmap, jcmd) at a running JVM. |

---

## Systems

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CPU** | Central Processing Unit | The processor; high CPU with low I/O wait signals a CPU-bound bottleneck. |
| **OS** | Operating System | The platform (Windows/macOS/Linux) the JVM and its native memory sit on top of. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Latency** | — | How long one request/message takes end-to-end. |
| **P95 / P99** | 95th / 99th Percentile | Latency below which 95%/99% of requests complete; shows worst-case, not average, performance. |
| **Throughput** | — | How much work/messages processed per unit time. |

---

## One-line memory aid

> Focus first on: **JVM** · **GC** · **G1 GC** · **ZGC** · **Heap**.

---

**Related:** [Module 4 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
