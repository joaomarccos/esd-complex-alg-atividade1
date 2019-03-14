package io.github.joaomarccos;

public class QuickSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length -1);
    }

    private void quickSort(T[] array, int start, int end){
        if(start < end){
            var pivotPosition = partition(array, start, end);
            quickSort(array, start, pivotPosition -1);
            quickSort(array, pivotPosition + 1, end);
        }
    }

    private int partition(T[] array, int start, int end) {
        int pivot = start;
        for (int left = start; left < end; left++) {
            /* Elemento atual menor ou igual ao pivô? */
            if (array[left].equals(array[end]) || isSmaller(array[left], array[end])) {
                swap(array, pivot++, left);
            }
        }
        swap(array, pivot, end);
        return pivot;
    }
}
