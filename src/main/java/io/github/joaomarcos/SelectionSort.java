package io.github.joaomarcos;

public class SelectionSort<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        for (var i = 0; i < array.length - 1; i++) {
            var minIndex = i; // smaller value index start at first element index of array
            for (var j = i + 1; j < array.length; j++) {
                if (isSmaller(array[j], array[minIndex])) { // search for the smallest value on unsorted part of array
                    minIndex = j;
                }
            }
            if (notEquals(array[minIndex], array[i])) { // put the smallest value on sorted part of array
                swap(array, i, minIndex);
            }
        }
    }
}
