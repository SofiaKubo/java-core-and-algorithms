package core.loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
  public static void main(String[] args) {
    int secret = ThreadLocalRandom.current().nextInt(1, 11);
    Scanner scanner = new Scanner(System.in);
    int numberOfTrials = 0;
    int number;

    do {
      number = readGuess(scanner);
      numberOfTrials++;

      if (number > secret) {
        System.out.println("Your number is bigger! Try again!");
      } else if (number < secret) {
        System.out.println("Your number is smaller! Try again!");
      }
    } while (number != secret);

    System.out.println(
        "Congratulations! You guessed the number from " + numberOfTrials + " attempt(s)!");
    scanner.close();
  }

  private static int readGuess(Scanner scanner) {
    while (true) {
      System.out.println("Enter the number from 1 to 10:");
      String input = scanner.nextLine().trim();
      try {
        int number = Integer.parseInt(input);
        if (number >= 1 && number <= 10) {
          return number;
        }
        System.out.println("The number must be from 1 to 10.");
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter an integer.");
      }
    }
  }
}
