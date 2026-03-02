package practicum.loops;

public class FeedingsTracker {
    public static void main(String[] args) {
        int money = 500; // деньги на корм
        int foodPerDay = 100; // стоимость пачки корма
        int days = 0; // дни, когда вы сможете покупать корм

        for (int i = money; i > 0; i = i - foodPerDay) {
            days = days + 3;
            System.out.println(
                "На " + days + "-й день останется " + (i - foodPerDay) +
                    " рублей.");
        }

        System.out.println("Денег хватит на " + days + " дней.");
    }
}

