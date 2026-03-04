package practicum.loops;

import java.util.Scanner;

public class WeatherValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = readInt(scanner, "Введите текущую температуру:");
        int windSpeed = readInt(scanner, "Введите текущую скорость ветра:");

        System.out.println("Идет ли дождь: да / нет");
        String rain = scanner.nextLine().trim().toLowerCase();

        scanner.close();

        int criteriaCount = countSatisfiedCriteria(temperature, windSpeed, rain);
        if (criteriaCount == 3) {
            System.out.println("Идеальная погода для пикника!");
        } else if (criteriaCount == 2) {
            System.out.println("Можно рискнуть, но будьте готовы к сюрпризам");
        } else if (criteriaCount == 1) {
            System.out.println("Лучше остаться дома");
        } else {
            System.out.println("Категорически не рекомендуется выходить на пикник");
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }

    private static int countSatisfiedCriteria(int temperature, int windSpeed, String rain) {
        int criteriaCount = 0;
        if (temperature >= 20 && temperature <= 30) {
            criteriaCount++;
        }
        if (windSpeed <= 15) {
            criteriaCount++;
        }
        if (rain.equals("нет")) {
            criteriaCount++;
        }
        return criteriaCount;
    }
}
