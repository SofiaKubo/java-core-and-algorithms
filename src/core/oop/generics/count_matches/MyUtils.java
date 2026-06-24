package core.oop.generics.count_matches;

import java.util.*;

class MyUtils {
    public static <T> void printAll(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static <T> T getFirstElement(ArrayList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Реализуйте здесь метод countMatches
    public static <T> int countMatches(ArrayList<T> list, T sample) {
        int count = 0;
        for (T element : list) {
            if (element.equals(sample)) {
                count++;
            }
        }
        return count;
    }
}
