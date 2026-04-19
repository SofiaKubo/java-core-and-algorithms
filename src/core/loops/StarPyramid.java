package core.loops;

import java.util.Scanner;

public class StarPyramid {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int number = readNumber(scanner);
      printThePyramid(number);
    }
  }

  private static void printThePyramid(int number) {

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= (number - i); j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static int readNumber(Scanner scanner) {
    while (true) {
      System.out.println("Enter an integer number: ");
      String input = scanner.nextLine().trim();
      try {
        int number = Integer.parseInt(input);
        if (number > 0) {
          return number;
        }
        System.out.println("The number must be positive integer!");
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a positive integer.");
      }
    }
  }
}
