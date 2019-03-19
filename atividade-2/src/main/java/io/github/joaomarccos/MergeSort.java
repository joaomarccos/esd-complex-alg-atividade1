package io.github.joaomarccos;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public void sort(T[] array) {
        mergeSort(array, 0, array.length - 1);
    }


    private void mergeSort(T[] array, int start, int end) {
        if (start < end) {
            var middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private void merge(T[] array, int start, int middle, int end) {

        var leftArray = Arrays.copyOfRange(array, start, middle + 1);
        var rightArray = Arrays.copyOfRange(array, middle + 1, end + 1);

        int i = 0, j = 0;
        var cursor = start;

        while (i < leftArray.length && j < rightArray.length) {
            if (isSmaller(leftArray[i], rightArray[j])) {
                array[cursor++] = leftArray[i++];
            } else {
                array[cursor++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[cursor++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[cursor++] = rightArray[j++];
        }

    }
}
