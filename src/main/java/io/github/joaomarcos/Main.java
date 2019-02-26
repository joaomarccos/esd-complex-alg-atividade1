package io.github.joaomarcos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author João Marcos
 */
public class Main {
    public static void main(String[] args) {

        Integer[] arr = getIntegers();

        var algorithm = new InsertionSort<Integer>();
        algorithm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    /**
     * Get list of integers from inputstream.
     * First input is the number of integers to read
     *
     * @return Array of Integers
     */
    private static Integer[] getIntegers() {
        Scanner in = new Scanner(System.in);
        var nlines = in.nextInt();
        in.nextLine();
        Integer[] arr = new Integer[nlines];

        for (var i = 0; i < nlines; i++) {
            arr[i] = in.nextInt();
            in.nextLine();
        }
        return arr;
    }
}
