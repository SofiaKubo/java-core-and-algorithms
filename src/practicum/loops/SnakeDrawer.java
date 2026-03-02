package practicum.loops;

public class SnakeDrawer {
  public static void main(String[] args) {
    String head = "(º..º)"; // голова
    String tail = "~"; // хвост
    String body = "≈"; // тело

    String direction = "left"; // направление движения

    if (direction.equals("right")) {
      System.out.print(tail);
      for (int i = 1; i <= 9; i++) {
        System.out.print(body);
      }
      System.out.print(head);
    } else if (direction.equals("left")) {
      System.out.print(head);
      for (int i = 1; i <= 9; i++) {
        System.out.print(body);
      }
      System.out.print(tail);
    } else {
      System.out.println("Команда непонятна.");
    }
  }
}
