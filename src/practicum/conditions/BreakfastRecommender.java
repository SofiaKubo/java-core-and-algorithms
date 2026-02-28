package practicum.conditions;

public class BreakfastRecommender {
    public static void main(String[] args) {
        int numberOfEggs = 4;

        if (numberOfEggs >= 3) {
            System.out.println("Рекомендую приготовить омлет.");
        } else {
            System.out.println("Рекомендую позавтракать бутербродами.");
        }

        System.out.println("Приятного аппетита!");
    }
}
