package core.oop.generics.count_matches;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("груша");
        fruits.add("яблоко");
        fruits.add("слива");

        int count = MyUtils.countMatches(fruits, "яблоко");

        System.out.println("Количество яблок: " + count);
    }
}
