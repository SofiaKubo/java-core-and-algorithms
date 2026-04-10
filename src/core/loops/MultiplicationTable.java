package loops;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    System.out.println("Enter a number");

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      int result = number * i;
      System.out.println(number + " x " + i + " = " + result);
    }
    scanner.close();
  }
}
