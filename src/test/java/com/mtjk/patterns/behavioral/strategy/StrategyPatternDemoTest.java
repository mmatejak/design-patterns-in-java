package com.mtjk.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StrategyPatternDemoTest {

    @Test
    void testInsertionSortStrategy() {
        int[] array = {5, 3, 8, 1, 2};
        Context context = new Context(new InsertionSortStrategy());
        context.executeStrategy(array);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, array);
    }

    @Test
    void testMergeSortStrategy() {
        int[] array = {5, 3, 8, 1, 2};
        Context context = new Context(new MergeSortStrategy());
        context.executeStrategy(array);
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, array);
    }
}
