package practicum.loops;

public class LoyaltyProgramCompare {
  public static void main(String[] args) {
    int targetAmount = 40000;
    simulateTariff("I", targetAmount, 1, 0, true);
    simulateTariff("II", targetAmount, 100, 100, false);
  }

  private static void simulateTariff(
      String tariffName, int targetAmount, int initialIncome, int incomeStep, boolean isDoubling) {
    int day = 1;
    int dailyIncome = initialIncome;
    int totalAmount = 0;

    while (totalAmount < targetAmount) {
      totalAmount += dailyIncome;
      System.out.println("День " + day + ". На счету " + totalAmount);
      if (totalAmount >= targetAmount) {
        break;
      }

      if (isDoubling) {
        dailyIncome *= 2;
      } else {
        dailyIncome += incomeStep;
      }
      day++;
    }

    System.out.println(
        "В варианте " + tariffName + " на " + day + "-й день будет достигнута нужная сумма.");
  }
}
