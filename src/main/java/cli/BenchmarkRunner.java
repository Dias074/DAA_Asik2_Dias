package cli;

import algorithms.BoyerMooreMajority;
import metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int size = args.length > 0 ? Integer.parseInt(args[0]) : 1000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }

        PerformanceTracker tracker = new PerformanceTracker();
        long start = System.nanoTime();
        Integer result = BoyerMooreMajority.findMajorityElement(array, tracker);
        long end = System.nanoTime();

        System.out.println("Majority Element: " + result);
        System.out.println("Comparisons: " + tracker.getComparisons());
        System.out.println("Array Accesses: " + tracker.getArrayAccesses());
        System.out.println("Execution Time (ns): " + (end - start));
    }
}
