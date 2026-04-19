package core.loops;

import java.util.Scanner;

public class NumberReverser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = readInt(scanner, "Enter the number:");
    String reversedNumber = reverseNumber(number);
    System.out.println("The reversed number is " + reversedNumber);
    scanner.close();
  }

  private static int readInt(Scanner scanner, String prompt) {
    while (true) {
      System.out.println(prompt);
      String input = scanner.nextLine().trim();
      try {
        return Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter an integer.");
      }
    }
  }

  private static String reverseNumber(int number) {
    long value = Math.abs((long) number);
    if (value == 0) {
      return "0";
    }

    StringBuilder reversed = new StringBuilder();
    while (value > 0) {
      reversed.append(value % 10);
      value /= 10;
    }

    if (number < 0) {
      reversed.insert(0, '-');
    }
    return reversed.toString();
  }
}
