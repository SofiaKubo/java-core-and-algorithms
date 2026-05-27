package core.collections.financeapp;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    private HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " +
            moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> listOfExpenses = expensesByCategories.get(category);
            listOfExpenses.add(expense);
        } else {
            ArrayList<Double> listOfExpenses = new ArrayList<>();
            listOfExpenses.add(expense);
            expensesByCategories.put(category, listOfExpenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);

            for (double expense : expensesByCategories.get(category)) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            for (double expense : expensesByCategories.get(category)) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }
}
