#  Boyer–Moore Majority Vote Algorithm

##  Overview
This project implements the **Boyer–Moore Majority Vote Algorithm**, a classic linear-time algorithm that efficiently determines whether a majority element exists in an array (i.e., an element appearing more than ⌊n/2⌋ times).

This implementation is part of **Assignment 2: Algorithmic Analysis and Peer Code Review**, under **Pair 3 – Linear Array Algorithms (Student A)**.

---

##  Features
-  Single-pass majority element detection
-  Constant space complexity (O(1))
-  Performance tracking (comparisons, array accesses)
-  JUnit 5 test coverage for all edge cases
-  Command-Line Interface (CLI) for benchmarking
-  Maven build structure (ready for GitHub submission)

---

##  Algorithm Logic
1. Maintain a **candidate** and a **count**.
2. Iterate through the array once:
    - If `count == 0`, assign the current element as the candidate.
    - If the current element equals the candidate, increment count.
    - Otherwise, decrement count.
3. After the first pass, verify if the candidate truly appears more than ⌊n/2⌋ times.

---

##  Complexity Analysis
| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | Θ(n) | Θ(1) |
| Average | Θ(n) | Θ(1) |
| Worst | Θ(n) | Θ(1) |

- **Explanation:**  
  The algorithm performs exactly one pass for candidate selection and one verification pass — both linear in `n`. No extra memory is used beyond a few variables.

---

##  Testing
JUnit 5 tests are provided in `src/test/java/algorithms/BoyerMooreMajorityTest.java` covering:
- Empty array
- Single element array
- Array with no majority element
- Array with a clear majority element

Run tests with:
```bash
mvn test



assignment2-boyer-moore/
├── src/main/java/
│   ├── algorithms/BoyerMooreMajority.java
│   ├── metrics/PerformanceTracker.java
│   └── cli/BenchmarkRunner.java
├── src/test/java/
│   └── algorithms/BoyerMooreMajorityTest.java
├── docs/
│   ├── README.md
│   └── analysis-report.pdf
├── gitlog.txt
└── pom.xml

```

Conclusion

The Boyer–Moore Majority Vote algorithm is an elegant and efficient linear-time approach to detecting a majority element using constant space.
It demonstrates how algorithmic insight can drastically reduce computational complexity while remaining easy to implement and verify.
