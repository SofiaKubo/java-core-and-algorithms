package core.oop.static_fields.transaction_validation;

public class TransactionValidator {
  public static final int MIN_AMOUNT = 1;
  public static final int MAX_AMOUNT = 5000;

  public static boolean isValidAmount(double amount) {
    if (amount < MIN_AMOUNT) {
      System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
      return false;
    }
    if (amount > MAX_AMOUNT) {
      System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
      return false;
    }
    return true;
  }
}
