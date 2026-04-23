package algorithms.arrays;

import java.util.Random;

public class WeeklyExpensesCalculator {
    public static void main(String[] args) {
        int[] expenses = new int[7];

        Random random = new Random();

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");

        for (int i = 0; i < expenses.length; i++) {
            System.out.println(
                "День " + (i + 1) + ". Потрачено рублей: " + expenses[i]);
        }

        int sum = 0;
        for (int expense : expenses) {
            sum += expense;
        }
        System.out.println("Траты в рублях за неделю: " + sum);
    }
}
