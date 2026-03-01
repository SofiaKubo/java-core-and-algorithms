package practicum.conditions;

import java.util.Scanner;

public class CurrencyConverterAdvanced {
  public static void main(String[] args) {
    double rateUSD = 81.9;
    double rateEUR = 87.7;
    double rateCNY = 11.49;

    System.out.println("Введите сумму рублей для конвертации:");
    Scanner numberReader = new Scanner(System.in);
    double roubles = numberReader.nextDouble();

    System.out.println("Введите номер валюты, в какую перевести рубли:");
    System.out.println("1 – доллары;");
    System.out.println("2 – евро;");
    System.out.println("3 – юани;");

    int command = numberReader.nextInt();

    if (command == 1) {
      double rubToUsd = roubles / rateUSD;
      if (rubToUsd < 0) {
        System.out.println("Ошибка: некорректные значения.");
      } else {
        System.out.println("Было введено " + roubles + ", в долларах это " + rubToUsd);
      }
    } else if (command == 2) {
      double rubToEur = roubles / rateEUR;
      if (rubToEur < 0) {
        System.out.println("Ошибка: некорректные значения.");
      } else {
        System.out.println("Было введено " + roubles + ", в евро это " + rubToEur);
      }
    } else if (command == 3) {
      double rubToCny = roubles / rateCNY;
      if (rubToCny < 0) {
        System.out.println("Ошибка: некорректные значения.");
      } else {
        System.out.println("Было введено " + roubles + ", в юанях это " + rubToCny);
      }
    } else {
      System.out.println("Такой команды нет.");
    }

    System.out.println("Работа с программой завершена.");
  }
}
