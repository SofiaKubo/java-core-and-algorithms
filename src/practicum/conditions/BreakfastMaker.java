package practicum.conditions;

public class BreakfastMaker {
    public static void main(String[] args) {
        int numberOfEggs = 4;
        double cheeseMass = 52.5;
        int hamSlices = 3;

        if (numberOfEggs > 3) {
            System.out.println("Рекомендую приготовить омлет.");
        } else if (cheeseMass >= 49.5) {
            System.out.println("Рекомендую приготовить бутерброды с сыром.");
        } else if (hamSlices > 2) {
            System.out.println("Рекомендую приготовить бутерброды с колбасой.");
        } else {
            System.out.println("Не смог найти, из чего приготовить завтрак. Оформляю заказ в Яндекс Еде.");
        }
        System.out.println("Приятного аппетита!");
    }
}
