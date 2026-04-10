package algorithms.arrays;

import java.util.Arrays;

public class ArraysToStringPrinter {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        String str1 = Arrays.deepToString(strings);
        String str2 = Arrays.deepToString(ints);

        System.out.println(str1);
        System.out.println(str2);
    }
}
