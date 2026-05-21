package core.conditions;

public class MaxExpenseFinder {
  public static void main(String[] args) {
    double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
    double maxExpense = findMaxExpense(expenses);
    System.out.println("Самая большая трата недели " + maxExpense);
  }

  public static double findMaxExpense(double[] array) {
    double maxExpense = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > maxExpense) {
        maxExpense = array[i];
      }
    }
    return maxExpense;
  }
}
