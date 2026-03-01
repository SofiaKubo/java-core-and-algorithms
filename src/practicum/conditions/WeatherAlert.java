package practicum.conditions;

public class WeatherAlert {
  private static final String RAIN = "Дождь";

  public static void main(String[] args) {
    String weather = RAIN;

    System.out.println("Собираюсь на прогулку");
    if (RAIN.equals(weather)) {
      System.out.println("Беру с собой зонт");
    } else {
      System.out.println("Иду налегке");
    }
    System.out.println("Люблю гулять!");
  }
}
