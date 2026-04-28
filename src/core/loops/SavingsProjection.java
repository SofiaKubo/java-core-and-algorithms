package core.loops;

public class SavingsProjection {
    public static void main(String[] args) {
        double roubles = 5000;
        double yearRate = 4;
        int numOfMonth = 36;
        double monthRefill = 1000;
        double monthMaintenanceRate = 0.1 / 100;
        double monthRate = yearRate / 12;

        for (int i = 1; i <= numOfMonth; i++) {
            double depositInterest = roubles * (monthRate / 100);
            roubles += depositInterest;
            double monthMaintenance = monthMaintenanceRate * roubles;
            roubles -= monthMaintenance;
            roubles += monthRefill;
        }

        System.out.println(
            "Через " + numOfMonth + " месяцев накопится " +
                Math.round(roubles * 100.0) / 100.0 +
                " рублей");

        if (roubles >= 41000) {
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}
