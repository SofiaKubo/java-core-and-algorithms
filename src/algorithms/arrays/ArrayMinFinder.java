package algorithms.arrays;

import java.util.Scanner;

public class ArrayMinFinder {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
