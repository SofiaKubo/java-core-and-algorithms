package practicum.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParkingCalculator {
    private static final int FIRST_HOUR_PRICE = 100;
    private static final int HOUR_PRICE = 50;
    private static final int AFTER_FIVE_HOURS_PRICE = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hours:");
        int hours;

        try {
            hours = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer number of hours.");
            scanner.close();
            return;
        }

        if (hours < 0) {
            System.out.println("Number of hours cannot be negative.");
            scanner.close();
            return;
        }

        int totalSum = 0;
        int hourPrice;

        for (int i = 1; i <= hours; i++) {
            if (i == 1) {
                hourPrice = FIRST_HOUR_PRICE;
            } else if (i > 5) {
                hourPrice = AFTER_FIVE_HOURS_PRICE;

            } else {
                hourPrice = HOUR_PRICE;
            }
            totalSum += hourPrice;
            System.out.println(
                "Hour " + i + ": " + hourPrice + " RUB. Running total: " + totalSum + " RUB.");
        }

        System.out.println("Final total: " + totalSum + " RUB.");
        scanner.close();
    }
}
