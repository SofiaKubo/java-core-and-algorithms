package core.loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // не создавайте объект класса Random
        int randomInt = new Random().nextInt(1001); // генерирует новое число от 0 до 1000

        int userInput = -1; // это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        // запускаем цикл игры
        while (userInput != randomInt) {
            userInput = scanner.nextInt(); // в этой переменной должен сохраняться ввод пользователя

            if (userInput > randomInt) { // условие проверяется в цикле
                System.out.println("Меньше");
            }
            if (userInput < randomInt) { // Второе условие
                System.out.println("Больше");
            }
        }
        // печатаем, когда число угадано
        System.out.println("Вы великолепны! Именно это я загадал.");
    }
}
