package algorithms.arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n <= 0) return;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }

        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

