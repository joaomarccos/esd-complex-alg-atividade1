package io.github.joaomarccos;

public class HeapSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public void sort(T[] array) {
        buildMaxHeap(array);
        for(var i = array.length - 1; i>=0; i--){
            swap(array, i , 0);
            maxHeapify(array, 0, i);
        }
    }

    /**
     * Reorganize the array to be a max heap
     *
     * @param array - array that will be transformed in a max heap
     */
    public void buildMaxHeap(T[] array) {
        for (var i = (array.length / 2); i >= 1; i--){
            maxHeapify(array, i - 1, array.length);
        }
    }

    /**
     * Keep properties of the heap. All childs smallest than parents.
     *
     * @param array  - the array to apply the operation
     * @param parent - parent to verify if is a max heap. If not, adjust it.
     */
    public void maxHeapify(T[] array, int parent, int heapLength) {
        int left = leftChild(array, parent);
        int right = rightChild(array, parent);
        int max = parent;
        if (left < heapLength && isBigger(array[left], array[parent])) {
            max = left;
        }
        if (right < heapLength && isBigger(array[right], array[max])) {
            max = right;
        }
        if (max != parent) {
            swap(array, max, parent);
            maxHeapify(array, max, heapLength);
        }
    }

    /**
     * Return the index(starting at 0) that represents the left child from @parent in the given @array
     *
     * @param parent - index of array
     * @return index from left child
     */
    private int leftChild(T[] array, int parent) {
        return (parent + 1) * 2 - 1;
    }

    /**
     * Return the index(starting at 0) that represents the right child from @parent in the given @array
     *
     * @param parent - index of array
     * @return index from right child
     */
    private int rightChild(T[] array, int parent) {
        return (parent + 1) * 2 + 1 - 1;
    }

}
