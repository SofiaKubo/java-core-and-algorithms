package practicum.loops;

public class AlarmClock {
  public static void main(String[] args) {
    int hours = 6;
    int startMinutes = 30;
    int endMinutes = 55;

    for (int minutes = startMinutes; minutes <= endMinutes; minutes = minutes + 5) {
      System.out.println("Время " + hours + ":" + minutes + "! Пора вставать!");
    }
  }
}
