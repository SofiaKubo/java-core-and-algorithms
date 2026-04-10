package loops;

public class WorkoutPlanner {
  public static void main(String[] args) {
    int totalRounds = 5;

    for (int i = 1; i <= totalRounds; i++) {
      System.out.println("Круг " + i);
      if (i % 2 == 0) {
        System.out.println("Качаем пресс");
      } else {
        System.out.println("Отжимаемся");
      }
      System.out.println("Бегаем в колесе");
    }
    System.out.println("Отлично позанимались сегодня! Вы молодец!");
  }
}
