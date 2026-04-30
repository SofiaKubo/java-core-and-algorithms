package algorithms.arrays;

import java.util.Scanner;

public class ShoppingListApp {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить программу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                if (productCount >= 8) {
                    System.out.println("Извините, список полон!");
                } else {
                    System.out.println("Введите название товара:");
                    String product = scanner.next();
                    shoppingList[productCount] = product;

                    System.out.println("Товар " + product +
                        " добавлен в список под номером " + (productCount + 1));
                    productCount++;
                }

            } else if (actionNumber == 2) {

            } else if (actionNumber == 3) {

            } else if (actionNumber == 4) {
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}
