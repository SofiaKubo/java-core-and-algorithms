package core.oop.polymorphism.virtual_pbx;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Вас приветствует виртуальная АТС!");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите ваш номер телефона:");
    String number = scanner.nextLine();
    System.out.println("Введите номер пользователя, которому хотите позвонить:");
    String friendNumber = scanner.nextLine();
    System.out.println(
        "Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
    int type = Integer.parseInt(scanner.nextLine());

    if (type < 1 || type > 3) {
      System.out.println("Введена неверная модель телефона");
      return;
    }

    Phone phone = getPhone(type, number, scanner);
    phone.makeCall(friendNumber);

    if (phone instanceof MobilePhone mobilePhone) {
      System.out.println("Введите текст SMS:");
      String messageText = scanner.nextLine();
      mobilePhone.sendSms(messageText, friendNumber);
    }

    if (phone instanceof Smartphone smartphone) {
      System.out.println("Введите email:");
      String email = scanner.nextLine();
      System.out.println("Введите текст email:");
      String messageText = scanner.nextLine();
      smartphone.sendEmail(messageText, email);
    }
  }

  public static Phone getPhone(int type, String number, Scanner scanner) {
    if (type == 1) {
      return new LandlinePhone(number);
    } else if (type == 2) {
      return new MobilePhone(number);
    } else {
      System.out.println("Введите название приложения для звонка:");
      String appName = scanner.nextLine();
      return new Smartphone(number, appName);
    }
  }
}
