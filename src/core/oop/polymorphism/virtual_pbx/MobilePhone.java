package core.oop.polymorphism.virtual_pbx;

public class MobilePhone extends Phone {
  public MobilePhone(String number) {
    super(number);
  }

  public final void sendSms(String messageText, String targetNumber) {
    System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber + ".");
  }
}
