package algorithms.arrays;

import java.util.Scanner;

public class StringArrayDuplicateRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        removeDuplicates(strings);
        print(strings);

    }

    public static void removeDuplicates(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            boolean hasDuplicate = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] != null && arr[i].equals(arr[j])) {
                    arr[j] = null;
                    hasDuplicate = true;
                }
            }
            if (hasDuplicate) {
                arr[i] = null;
            }
        }
    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}

