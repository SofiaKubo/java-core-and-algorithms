package practicum.loops;

public class CountDown {
  public static void main(String[] args) {
      int secondsBeforeStart = 70;

    for (int i = secondsBeforeStart; i >= 0; i =  i - 7) {
      System.out.println("До старта SpaceY осталось " + i);
    }
    System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");
  }
}
