package io.github.joaomarcos;

public class InsertionSort<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        for (var i = 1; i < array.length; i++) {
            var pivot = array[i];  //pivot start on second element of array
            var j = i - 1;  //j position starts on first element of array
            while (j >= 0 && isBigger(array[j], pivot)) {
                array[j + 1] = array[j]; //swap
                j--; //decrement
            }
            array[j + 1] = pivot; // set pivot to correct position
        }
    }
}
