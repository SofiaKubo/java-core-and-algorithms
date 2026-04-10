package algorithms.arrays;

import java.util.Arrays;

public class ArrayHalfFiller {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int middle =
            array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;

        Arrays.fill(array, 0, middle, valueStart);
        Arrays.fill(array, middle, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
