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
    if (roubles < 0) {
      System.out.println("Ошибка: некорректные значения.");
      System.out.println("Работа с программой завершена.");
      numberReader.close();
      return;
    }

    System.out.println("Введите номер валюты, в какую перевести рубли:");
    System.out.println("1 – доллары;");
    System.out.println("2 – евро;");
    System.out.println("3 – юани;");

    int command = numberReader.nextInt();

    double selectedRate = 0;
    String currencyName = "";

    switch (command) {
      case 1:
        selectedRate = rateUSD;
        currencyName = "долларах";
        break;
      case 2:
        selectedRate = rateEUR;
        currencyName = "евро";
        break;
      case 3:
        selectedRate = rateCNY;
        currencyName = "юанях";
        break;
      default:
        System.out.println("Такой команды нет.");
        return;
    }

    double converted = roubles / selectedRate;
    System.out.println("Было введено " + roubles + ", в " + currencyName + " это " + converted);

    System.out.println("Работа с программой завершена.");
    numberReader.close();
  }
}
