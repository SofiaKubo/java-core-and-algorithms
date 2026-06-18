package core.oop.abstract_classes.payment_processing;

class SbpPayment extends PaymentProcessor {
  @Override
  protected void makePayment() {
    System.out.println("Оплата через Сервис Быстрых Платежей.");
  }
}
