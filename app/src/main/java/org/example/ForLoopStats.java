package org.example;

public class ForLoopStats {
    public static int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int n : nums) if (n < min) min = n;
        return min;
    }

    public static int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static double averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums) / (double) nums.length;
    }
}
