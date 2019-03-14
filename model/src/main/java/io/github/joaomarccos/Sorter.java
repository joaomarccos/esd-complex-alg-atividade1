package io.github.joaomarccos;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class Sorter<T extends Comparable<T>> {
    /**
     * Sort an array
     *
     * @param array - Array of T
     */
    abstract void sort(T[] array);

    void sortDebug(T[] array){
        var initTime = System.currentTimeMillis();
        sort(array);
        System.out.println("Sorted in "+ TimeUnit.MILLISECONDS.toMillis( System.currentTimeMillis() - initTime) + "ms.");
    }

    /**
     * Returns true if @element is bigger than @other
     *
     * @param element - param 1
     * @param other   - param 2
     * @return Boolean
     */
    boolean isBigger(T element, T other) {
        return element.compareTo(other) > 0;
    }

    /**
     * Returns true id @element is smaller than @other
     *
     * @param element - param 1
     * @param other   - param 2
     * @return Boolean
     */
    boolean isSmaller(T element, T other) {
        return element.compareTo(other) < 0;
    }

    /**
     * Returns true if @element is different of @other
     *
     * @param element - param 1
     * @param other   - param 2
     * @return Boolean
     */
    boolean notEquals(T element, T other) {
        return !element.equals(other);
    }

    /**
     * Swap the values of given indexes of array
     *
     * @param array  - array to swap elements
     * @param index1 - index 1
     * @param index2 - index 2
     */
    void swap(T[] array, int index1, int index2) {
        var aux = array[index2];
        array[index2] = array[index1];
        array[index1] = aux;
    }
}
