package com.mtjk.patterns.behavioral.strategy;

public class MergeSortStrategy implements Strategy {

    @Override
    public void sort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        sort(left);
        sort(right);
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[arrayIndex++] = left[leftIndex++];
            } else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }
}
