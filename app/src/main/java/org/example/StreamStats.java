package org.example;

import java.util.Arrays;

public class StreamStats {
    public static int maximumUsingStream(int[] nums) {
        return Arrays.stream(nums).max().orElseThrow();
    }

    public static int minimumUsingStream(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow();
    }

    public static int sumUsingStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static double averageUsingStream(int[] nums) {
        return Arrays.stream(nums).average().orElseThrow();
    }
}
