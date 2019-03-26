package io.github.joaomarccos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountingSort<T extends AsNumber> extends Sorter<T> {

    @Override
    void sort(T[] array) {
        var max = max(array);
        var copy = Arrays.copyOf(array, array.length);
        var countingArr = new int[max];
        Arrays.fill(countingArr, 0);

        for (T t : copy) {
            countingArr[t.intValue() - 1]++;
        }

        for (var i = 1; i < countingArr.length; i++) {
            countingArr[i] = countingArr[i] + countingArr[i - 1];
        }

        for (var i = copy.length - 1; i >= 0; i--) {
            array[--countingArr[copy[i].intValue() - 1]] = copy[i];
        }
    }

    /**
     * Returns the max element of array
     *
     * @param array
     * @return
     */
    int max(T[] array) {
        var max = Integer.MIN_VALUE;
        for (var el : array) {
            if (el.intValue() > max) max = el.intValue();
        }
        return max;
    }

    /**
     * Returns the min element of array
     *
     * @param array
     * @return
     */
    int min(T[] array) {
        var min = Integer.MAX_VALUE;
        for (var el : array) {
            if (el.intValue() < min) min = el.intValue();
        }
        return min;
    }
}
