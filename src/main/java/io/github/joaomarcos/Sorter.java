package io.github.joaomarcos;

public interface Sorter<T extends Comparable<T>> {
    /**
     * Sort an array
     *
     * @param array - Array of T
     */
    void sort(T[] array);

    /**
     * Returns true if @element is bigger than @other
     *
     * @param element - param 1
     * @param other   - param 2
     * @return Boolean
     */
    default boolean isBigger(T element, T other) {
        return element.compareTo(other) > 0;
    }

    /**
     * Returns true id @element is smaller than @other
     *
     * @param element - param 1
     * @param other   - param 2
     * @return Boolean
     */
    default boolean isSmaller(T element, T other) {
        return element.compareTo(other) < 0;
    }

    /**
     * Returns true if @element is different of @other
     *
     * @param element - param 1
     * @param other   - param 2
     * @return Boolean
     */
    default boolean notEquals(T element, T other) {
        return !element.equals(other);
    }

    /**
     * Swap the values of given indexes of array
     * @param array - array to swap elements
     * @param index1 - index 1
     * @param index2 - index 2
     */
    default void swap(T[] array, int index1, int index2) {
        var aux = array[index2];
        array[index2] = array[index1];
        array[index1] = aux;
    }
}
