package algorithms;

import metrics.PerformanceTracker;

public class BoyerMooreMajority {

    public static Integer findMajorityElement(int[] nums, PerformanceTracker tracker) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        Integer candidate = null;
        int count = 0;

        for (int num : nums) {
            tracker.incrementArrayAccesses();
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
            tracker.incrementComparisons();
        }

        // Second pass to verify
        int occurrence = 0;
        for (int num : nums) {
            tracker.incrementArrayAccesses();
            if (num == candidate) {
                occurrence++;
            }
        }

        return occurrence > nums.length / 2 ? candidate : null;
    }
}
