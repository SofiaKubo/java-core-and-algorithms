package algorithms.arrays;

import java.util.Scanner;

public class StreamingMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0) return;

        int min = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current < min) {
                min = current;
            }
        }

        System.out.println(min);
    }
}
