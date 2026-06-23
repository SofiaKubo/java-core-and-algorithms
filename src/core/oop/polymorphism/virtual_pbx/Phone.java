package core.oop.polymorphism.virtual_pbx;

public abstract class Phone {
  private final String number;

  public Phone(String number) {
    this.number = number;
  }

  protected final String getNumber() {
    return number;
  }

  public void makeCall(String targetNumber) {
    System.out.println("Звоним с номера " + number);
    System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
    System.out.println("Привет!");
  }
}
