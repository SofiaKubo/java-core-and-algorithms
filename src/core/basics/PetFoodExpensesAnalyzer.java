package core.basics;

public class PetFoodExpensesAnalyzer {
    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello("Пиксель");
        findMaxExpense(feedExpensesCat);
        findExpensesSum(feedExpensesCat);
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        findMaxExpense(feedExpensesHamster);
        findExpensesSum(feedExpensesHamster);
        sayEnjoyMeal("Байт");


    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");

    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name + "!");

    }

    public static void findMaxExpense(double[] feedExpenses) {
        double maxFeedExpense = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            if (feedExpenses[i] > maxFeedExpense) {
                maxFeedExpense = feedExpenses[i];
            }
        }

        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpense);

    }

    public static void findExpensesSum(double[] feedExpenses) {
        double sumFeedCat = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            sumFeedCat = sumFeedCat + feedExpenses[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedCat);
    }
}
