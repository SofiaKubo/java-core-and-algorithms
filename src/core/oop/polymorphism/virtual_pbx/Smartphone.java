package core.oop.polymorphism.virtual_pbx;

public class Smartphone extends MobilePhone {
  private final String appName;

  public Smartphone(String number, String appName) {
    super(number);
    this.appName = appName;
  }

  @Override
  public void makeCall(String targetNumber) {
    System.out.println("Звоним с номера " + getNumber());
    System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber + ".");
    System.out.println("Привет!");
  }

  public final void sendEmail(String messageText, String email) {
    System.out.println("Напишем другу сообщение " + messageText + " по email " + email + ".");
  }
}
