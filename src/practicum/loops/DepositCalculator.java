package practicum.loops;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        double exchangeRateUSD = 94.8;
        double exchangeRateEUR = 103.8;
        double exchangeRateCNY = 13.1;

        double interestRateRUB = 7;
        double interestRateUSD = 1;
        double interestRateEUR = 0.8;
        double interestRateCNY = 1.5;


        System.out.println("Введите номер валюты:");
        System.out.println("1 – рубли;");
        System.out.println("2 – доллары;");
        System.out.println("3 – евро;");
        System.out.println("4 – юани.");

        Scanner scanner = new Scanner(System.in);
        int currency = scanner.nextInt();

        double exchangeRate = 1;
        double interestRate;
        String currencySymbol;

        if (currency == 1) {
            interestRate = interestRateRUB;
            currencySymbol = "RUB";
        } else if (currency == 2) {
            exchangeRate = exchangeRateUSD;
            interestRate = interestRateUSD;
            currencySymbol = "USD";
        } else if (currency == 3) {
            exchangeRate = exchangeRateEUR;
            interestRate = interestRateEUR;
            currencySymbol = "EUR";
        } else if (currency == 4) {
            exchangeRate = exchangeRateCNY;
            interestRate = interestRateCNY;
            currencySymbol = "CNY";
        } else {
            System.out.println("Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.");
            currency = 1; // устанавливаем валюту по умолчанию — рубли
            interestRate = interestRateRUB;
            currencySymbol = "RUB";
        }

        System.out.println("Введите начальную сумму в выбранной валюте:");
        double amount = scanner.nextDouble();

        System.out.println("Введите количество лет для расчёта:");
        int years = scanner.nextInt();

        for (int i = 1; i <= years; i++) {
            amount *= 1 + interestRate / 100;

            // добавьте условие, при котором каждые три года сумма также увеличивается на 1%
            if (i % 3 == 0) {
                // формула для изменения на 1%
                amount *= 1.01;
            }
        }

        System.out.printf("К окончанию срока сумма составит: %.2f %s%n", amount, currencySymbol);

        // если валюта – не рубли
        if (currency != 1) {
            // сохраните в переменную roubles результат перевода в рубли
            double roubles = amount * exchangeRate;

            // выведите на экран сообщение с результатом: "В рублях это будет: ... руб."
            System.out.printf("В рублях это будет: %.2f руб.%n", roubles);
        }

        // выведите на экран сообщение о завершении работы программы: "Работа с программой завершена"
        System.out.println("Работа с программой завершена.");
        scanner.close();
    }
}
