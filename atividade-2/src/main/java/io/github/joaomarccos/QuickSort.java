package io.github.joaomarccos;

public class QuickSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int start, int end) {
        if (start < end) {
            var pivotPosition = partition(array, start, end);
            quickSort(array, start, pivotPosition - 1);
            quickSort(array, pivotPosition + 1, end);
        }
    }

    private int partition(T[] array, int start, int end) {
        int pivotIndex = start;
        T pivotValue = array[end];
        for (int cursor = start; cursor < end; cursor++) {
            if (array[cursor].equals(pivotValue) || isSmaller(array[cursor], pivotValue)) {
                swap(array, pivotIndex++, cursor);
            }
        }
        swap(array, pivotIndex, end);
        return pivotIndex;
    }
}
