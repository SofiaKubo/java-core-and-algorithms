package practicum.loops;

public class DiscountCalculator {
    public static void main(String[] args) {
        int totalSum = 0; // переменная для подсчёта суммы
        int price = 100; // стоимость одного товара
        int itemAmount = 12; // количество товаров

        for (int i = 1; i <= itemAmount; i++) {
            if (i % 4 == 0) {
                totalSum += price / 2;
            } else {
                totalSum += price;
            }
        }

        System.out.println("Общая сумма покупок: " + totalSum + " рублей.");
    }
}
