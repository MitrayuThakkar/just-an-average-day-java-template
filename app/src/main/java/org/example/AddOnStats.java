package org.example;

import java.util.Arrays;

public class AddOnStats {
    public static int[] evensOnly(int[] nums) {
        return Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();
    }

    public static int[] oddsOnly(int[] nums) {
        return Arrays.stream(nums).filter(n -> n % 2 != 0).toArray();
    }

    public static int[] addFive(int[] nums) {
        return Arrays.stream(nums).map(n -> n + 5).toArray();
    }

    public static int[] squareNumbers(int[] nums) {
        return Arrays.stream(nums).map(n -> n * n).toArray();
    }
}
