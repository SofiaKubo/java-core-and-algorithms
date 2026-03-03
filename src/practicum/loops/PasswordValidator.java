package practicum.loops;

import java.util.Scanner;

public class PasswordValidator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите пароль:");

    String password = scanner.nextLine();

    boolean hasDigit = false;
    boolean hasUpper = false;
    boolean hasLower = false;

    for (int i = 0; i < password.length(); i++) {
      if (Character.isDigit(password.charAt(i))) {
        hasDigit = true;
      }
      if (Character.isUpperCase(password.charAt(i))) {
        hasUpper = true;
      }
      if (Character.isLowerCase(password.charAt(i))) {
        hasLower = true;
      }
    }
    scanner.close();

    int criteriaCount = 0;
    if (hasDigit) criteriaCount++;
    if (hasUpper) criteriaCount++;
    if (hasLower) criteriaCount++;

    if (criteriaCount == 3 && password.length() >= 8) {
      System.out.println("Сильный пароль");
    } else if (criteriaCount >= 2) {
      System.out.println("Средний пароль");
    } else {
      System.out.println("Слабый пароль");
    }
  }
}
