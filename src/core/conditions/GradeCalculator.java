package conditions;

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int points = readPoints(scanner);
      printResults(points);
    }
  }

  private static void printResults(int points) {
    if (points >= 90) {
      System.out.println("Sehr gut (1)!");
    } else if (points >= 80) {
      System.out.println("Gut (2)!");
    } else if (points >= 70) {
      System.out.println("Befriedigend (3)!");
    } else if (points >= 60) {
      System.out.println("Genügend (4)!");
    } else {
      System.out.println("Nicht genügend (5)!");
    }
  }

  private static int readPoints(Scanner scanner) {
    while (true) {
      System.out.println("Enter your score from 0 to 100:");
      String input = scanner.nextLine().trim();
      try {
        int score = Integer.parseInt(input);
        if (score >= 0 && score <= 100) {
          return score;
        }
        System.out.println("The number must be from 0 to 100.");
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter an integer.");
      }
    }
  }
}
