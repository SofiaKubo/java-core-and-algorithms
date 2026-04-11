package algorithms.arrays;

import java.util.Arrays;

public class BinarySearchChecker {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);
        int index = Arrays.binarySearch(sortedArray, element);

        System.out.println(index >= 0);
    }
}
