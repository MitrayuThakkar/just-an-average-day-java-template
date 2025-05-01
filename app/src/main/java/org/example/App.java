package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] data = {1, 3, -2, 7, 0};

        System.out.println("--- For Loop Methods ---");
        System.out.println("Max: " + ForLoopStats.maximumUsingForLoop(data));
        System.out.println("Min: " + ForLoopStats.minimumUsingForLoop(data));
        System.out.println("Sum: " + ForLoopStats.sumUsingForLoop(data));
        System.out.println("Average: " + ForLoopStats.averageUsingForLoop(data));

        System.out.println("--- Stream Methods ---");
        System.out.println("Max: " + StreamStats.maximumUsingStream(data));
        System.out.println("Min: " + StreamStats.minimumUsingStream(data));
        System.out.println("Sum: " + StreamStats.sumUsingStream(data));
        System.out.println("Average: " + StreamStats.averageUsingStream(data));

        System.out.println("--- Add-Ons ---");
        System.out.println("Evens: " + Arrays.toString(AddOnStats.evensOnly(data)));
        System.out.println("Odds: " + Arrays.toString(AddOnStats.oddsOnly(data)));
        System.out.println("Add Five: " + Arrays.toString(AddOnStats.addFive(data)));
        System.out.println("Squares: " + Arrays.toString(AddOnStats.squareNumbers(data)));
    }
}
