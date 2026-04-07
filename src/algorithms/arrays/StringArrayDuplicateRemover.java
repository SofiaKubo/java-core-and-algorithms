package algorithms.arrays;

import java.util.Scanner;

public class StringArrayDuplicateRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                continue;
            }
            boolean hasDuplicate = false;

            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                    hasDuplicate = true;
                }
            }
            if (hasDuplicate) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            if (i < strings.length - 1) {
                System.out.print(strings[i] + ", ");
            } else {
                System.out.print(strings[i]);
            }
        }
    }
}

