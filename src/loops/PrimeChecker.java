package loops;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = readNumber(scanner);
            checkTheNumber(number);
        }
    }

    private static void checkTheNumber(int number) {
        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("The number is prime");
    }


    private static int readNumber(Scanner scanner) {
        while (true) {
            System.out.println("Enter an integer number bigger than 1: ");
            String input = scanner.nextLine().trim();
            try {
                int number = Integer.parseInt(input);
                if (number > 1) {
                    return number;
                }
                System.out.println("The number must be positive integer bigger than 1!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer bigger than 1.");
            }
        }
    }
}
