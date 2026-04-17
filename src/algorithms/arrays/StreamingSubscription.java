package algorithms.arrays;

class StreamingSubscription {
    public static void main(String[] args) {
        int price = 256;
        int totalMonths = 12;

        int totalCost = 0;
        for (int month = 1; month <= totalMonths; month = month + 1) {
            if (month > 1 && (month - 1) % 3 == 0) {
                price = price / 2;
            }
            totalCost = totalCost + price;
        }

        System.out.println("Общая стоимость за " + totalMonths + " месяцев: " + totalCost + " руб.");
    }
}
