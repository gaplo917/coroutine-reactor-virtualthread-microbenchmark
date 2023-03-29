## KotlinConf2023 (TBC, under evaluation): Deep Dive the Real-World Performance of Kotlin Coroutine (V.S. Reactor, Java Virtual Threads)

This project is originally designed for testing the performance of Kotlin Coroutines, Reactor, 
and cutting edge Java 19 Virtual Threads for my application of KotlinConf 2023 talk 

| JMH Scenario (Microbenchmark in JVM)         | Goal                                                                                                                         |
|----------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|
| ✅ Kotlin Coroutine Dispatcher                | Compare Coroutine Dispatchers w/ and w/o computational workload                                                              |
| ✅ Reactor Scheduler                          | Compare Rector Schedulers w/ and w/o computational workload                                                                  |
| ✅ Blocking IO Wrapper                        | Compare Kotlin Coroutine, Reactor, and Java virtual threads as a blocking IO wrapper.                                        |
| ✅ Non-Blocking IO Wrapper                    | Compare Kotlin Coroutine, Reactor, and Java virtual threads as a non-blocking IO wrapper.                                    |
| ✅ Coroutine Context Switching                | Compare Kotlin Coroutine context switching w/ and w/o computational workload                                                 |
| ✅ Diminishing of return of large thread pool | Demonstration of large thread pool is not efficient by wrapping wrapping blocking IO in range of 100 - 4000 a IO thread pool |
| ✅ Virtual Threads in JDK 19                  | Compare Virtual Threads and Non-Blocking IO performance difference.                                                          |
| ✅ Structured Concurrency                     | Compare Kotlin Coroutine and JDK 19 structured concurrency feature                                                           |

As all we know, Kotlin Coroutine has provided us a good way to structure our asynchronous codes
in a readable sequence. It is also theoretically more CPU-friendly that reduces unnecessary context
switching to run faster and allow the CPU to work more. However, theory is just the texts on paper,
developers need real world scenarios and performance metrics to make better decisions.

> When we talk about "Real World Performance", we should measure both **machines** and **developers**.

I believe the following questions popped up in my mind will also in yours:

In machine world,

- How fast is Kotlin Coroutine compared to other popular asynchronous solutions in machine?

- What are the performance differences if I misused Kotlin coroutine?

- What are the performance differences when the application runs heavy-blocking-IO or
  heavy-non-blocking-IO operations?

- What are the performance differences when I switched to Kotlin Coroutine in Spring Boot MVC?

- Hardware is cheap and eventually will be cheaper in the future, why should I consider Kotlin Coroutine?

In developer world,

- What are the learning curve of writing performant codes in Kotlin Coroutine compared to Java Reactor?

- What changes required to apply Kotlin Coroutine into existing Spring Boot project?

- Java virtual threads and Structured Concurrency feature are coming to future Java, why should I consider Kotlin Coroutine?

This is a technical talk to deep dive the performance differences on Kotlin Coroutine,
Java virtual threads, and Reactor backed by a list of JMH benchmarks on the JVM to answer those questions.

## Project Goal

This project is to show the performance of using Kotlin Coroutine, Reactor, and
Java virtual threads on both ideal(JMH) and real world(end-to-end) scenarios.

1. Find out the performance differences between the Reactor and Kotlin Coroutine.
2. Find out the performance differences when handling blocking IO and non-blocking IO.
3. Find out the performance differences in the future state of JVM (combined Kotlin Coroutine and Reactor with JDK 19 virtual threads)
4. Find out the cost of context switching and scheduling in Kotlin Coroutine, Reactor, and java virtual threads.
5. Compare the JVM-based(ktor, spring boot, vert.x) Http server performances in heavy non-blocking IO
6. Compare with nodejs, Rust, C#, and more Http server performances in heavy non-blocking IO

## Getting Started (JMH) on Docker
Run benchmark inside docker.
```bash
docker build -t coroutine-reactor-virtualthread-microbenchmark .
docker run -t coroutine-reactor-virtualthread-microbenchmark
```

## Getting Started (JMH) on Local machine
1. Install JDK 19
```bash
# for mac user
brew install openjdk@19
```

2. Use JMH to run micro-benchmarks on Kotlin Coroutine, Virtual Threads, and Reactor.

```bash

# Run JMH benchmark
cd jmh;
./gradlew mainBenchmark;

```