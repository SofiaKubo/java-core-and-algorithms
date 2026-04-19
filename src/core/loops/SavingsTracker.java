package core.loops;

public class SavingsTracker {
  public static void main(String[] args) {
    int days = 5;
    int moneyPerDay = 200;
    int moneyTotal = 0;

    for (int day = 1; day <= days; day++) {
      moneyTotal += moneyPerDay;
      System.out.println("День " + day + ". Уже " + moneyTotal + " руб.");
    }
  }
}
