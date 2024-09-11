package com.mtjk.patterns.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        Context context = new Context(new InsertionSortStrategy());
        System.out.println("Sorting using Insertion Sort:");
        context.executeStrategy(array);
        printArray(array);

        // Reset array
        array = new int[]{5, 3, 8, 1, 2};

        context.setStrategy(new MergeSortStrategy());
        System.out.println("Sorting using Merge Sort:");
        context.executeStrategy(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
