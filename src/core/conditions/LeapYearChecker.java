package core.conditions;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0);

        if (!isLeapYear) {
            System.out.println("Согласно григорианскому календарю, этот год - невисокосный!");
        } else {
            System.out.println("Согласно григорианскому календарю, этот год - високосный!");
        }

        scanner.close();
    }
}
