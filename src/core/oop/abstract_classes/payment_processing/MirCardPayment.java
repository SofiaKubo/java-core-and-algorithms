package core.oop.abstract_classes.payment_processing;

class MirCardPayment extends PaymentProcessor {
  @Override
  protected void makePayment() {
    System.out.println("Оплата через карту Мир.");
  }
}
