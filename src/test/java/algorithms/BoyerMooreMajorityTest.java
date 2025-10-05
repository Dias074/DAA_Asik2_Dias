package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreMajorityTest {

    @Test
    public void testMajorityElement() {
        int[] arr = {3, 3, 4, 2, 3, 3, 5, 3};
        PerformanceTracker tracker = new PerformanceTracker();
        assertEquals(3, BoyerMooreMajority.findMajorityElement(arr, tracker));
    }

    @Test
    public void testNoMajorityElement() {
        int[] arr = {1, 2, 3, 4};
        PerformanceTracker tracker = new PerformanceTracker();
        assertNull(BoyerMooreMajority.findMajorityElement(arr, tracker));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        PerformanceTracker tracker = new PerformanceTracker();
        assertNull(BoyerMooreMajority.findMajorityElement(arr, tracker));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {7};
        PerformanceTracker tracker = new PerformanceTracker();
        assertEquals(7, BoyerMooreMajority.findMajorityElement(arr, tracker));
    }
}
