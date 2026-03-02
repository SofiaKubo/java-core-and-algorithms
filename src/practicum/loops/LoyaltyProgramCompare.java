package practicum.loops;

public class LoyaltyProgramCompare {
    public static void main(String[] args) {
        int targetAmount = 40000; // сколько нужно накопить
        int day = 1; // переменная для подсчёта количества дней
        int dailyIncome = 1; // переменная, показывающая ежедневные поступления

        // условие для цикла, переменную для накопления результата назовите totalAmount
        for (int totalAmount = dailyIncome;
             totalAmount <= targetAmount; totalAmount += dailyIncome) {
            System.out.println("День " + day + ". На счету " + totalAmount);
            dailyIncome *= 2;
            day++;
        }

        System.out.println("В варианте I на " + day +
            "-й день будет достигнута нужная сумма.");

        // не забудьте задать значения переменных day и dailyIncome,
        // соответственно условиям второго тарифа
        int daySecond = 1;
        int dailyIncomeSecond = 100;

        for (int totalAmount = dailyIncomeSecond;
             totalAmount <= targetAmount; totalAmount += dailyIncomeSecond) {
            System.out.println(
                "День " + daySecond + ". На счету " + totalAmount);
            dailyIncomeSecond += 100;
            daySecond++;
        }
        System.out.println("В варианте II на " + daySecond +
            "-й день будет достигнута нужная сумма.");
    }
}
