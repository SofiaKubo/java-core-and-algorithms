package core.oop.abstract_classes.payment_processing;

public class Main {
  public static void main(String[] args) {
    MirCardPayment mir = new MirCardPayment();
    SbpPayment sbp = new SbpPayment();

    sbp.processPayment();
    mir.processPayment();
  }
}
