package practicum.conditions;

import java.util.Scanner;

public class CurrencyConverterAdvanced {
    private static class CurrencyOption {
        private final double rate;
        private final String currencyName;

        private CurrencyOption(double rate, String currencyName) {
            this.rate = rate;
            this.currencyName = currencyName;
        }
    }

    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        System.out.println("Введите сумму рублей для конвертации:");
        double roubles = numberReader.nextDouble();

        printMenu();
        int command = numberReader.nextInt();

        CurrencyOption option = resolveCurrencyOption(command);
        if (option == null) {
            System.out.println("Такой команды нет.");
            System.out.println("Работа с программой завершена.");
            numberReader.close();
            return;
        }

        printConversion(roubles, option.rate, option.currencyName);
        System.out.println("Работа с программой завершена.");
        numberReader.close();
    }

    private static void printMenu() {
        System.out.println("Введите номер валюты, в какую перевести рубли:");
        System.out.println("1 – доллары;");
        System.out.println("2 – евро;");
        System.out.println("3 – юани;");
    }

    private static CurrencyOption resolveCurrencyOption(int command) {
        switch (command) {
            case 1:
                return new CurrencyOption(81.9, "долларах");
            case 2:
                return new CurrencyOption(87.7, "евро");
            case 3:
                return new CurrencyOption(11.49, "юанях");
            default:
                return null;
        }
    }

    private static void printConversion(double roubles, double rate, String currencyName) {
        if (roubles < 0) {
            System.out.println("Ошибка: некорректные значения.");
            return;
        }

        double converted = roubles / rate;
        System.out.println(
            "Было введено " + roubles + ", в " + currencyName + " это " +
                converted + ".");
    }
}
