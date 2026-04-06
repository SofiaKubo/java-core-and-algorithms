package algorithms.arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n <= 0) return;

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }

        int start, end, step;

        if (n % 2 == 0) {
            start = n - 1;
            end = -1;
            step = -1;
        } else {
            start = 0;
            end = n;
            step = 1;
        }
        for (int i = start; i != end; i += step) {
            System.out.println(arr[i]);
        }
    }
}

