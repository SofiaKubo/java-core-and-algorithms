package core.oop.abstract_classes.payment_processing;

abstract class PaymentProcessor {
  public final void processPayment() {
    System.out.println("Начинаю обрабатывать транзакцию.");
    verifyDetails();
    makePayment();
    sendNotification();
  }

  protected abstract void makePayment();

  private void verifyDetails() {
    System.out.println("Данные проверены.");
  }

  private void sendNotification() {
    System.out.println("Уведомление отправлено.");
  }
}
