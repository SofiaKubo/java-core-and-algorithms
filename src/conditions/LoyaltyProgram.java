package practicum.conditions;

public class LoyaltyProgram {
  public static void main(String[] args) {

    int age = 23;
    String dayOfWeek = "SATURDAY";

    int ticketPrice;

    if (age < 6) {
      ticketPrice = 0;
    } else if (age >= 65) {
      ticketPrice = "SUNDAY".equals(dayOfWeek) ? 3 : 5;
    } else {
      ticketPrice = "MONDAY".equals(dayOfWeek) ? 8 : 10;
    }

    System.out.println("Цена билета составляет: " + ticketPrice);
  }
}
