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
//        search for the correct position of pivot on array. that index starts on start position.
        int pivotIndex = start;
//        choose a pivot. In this case, the pivot is the last element of array
        T pivotValue = array[end];
//        from start to end do. Verify if the element on cursor position is smaller or equals the pivot value
        for (int cursor = start; cursor < end; cursor++) {
//            if true, swap (if not equals) the last index found for pivot (that is pointed for an element bigger than pivot) with cursor position.
            if (array[cursor].equals(pivotValue) || isSmaller(array[cursor], pivotValue)) {
                swap(array, pivotIndex++, cursor);
            }
        }
//        at the end. Swap the pivot index (end of array) with the last index found for pivot.
        swap(array, pivotIndex, end);
//        return the pivot index found.
        return pivotIndex;
    }
}
