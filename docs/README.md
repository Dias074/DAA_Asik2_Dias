# Boyer-Moore Majority Vote Algorithm

This project implements the Boyer–Moore Majority Vote algorithm for detecting the majority element in a single pass.

## Features
- Single-pass majority element detection
- Performance tracking (comparisons, array accesses)
- JUnit 5 tests for all edge cases
- CLI benchmarking tool for performance measurement

## Run Benchmark
```
mvn compile exec:java -Dexec.mainClass="cli.BenchmarkRunner" -Dexec.args="10000"
```
