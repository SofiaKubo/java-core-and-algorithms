package practicum.conditions;

public class AccessControl {
    public static void main(String[] args) {
        String position = "seller";

        switch (String.valueOf(position)) {
            case "admin":
                System.out.println("Доступ разрешён на все ресурсы.");
                break;
            case "seller":
                System.out.println("Доступ разрешён на создание объявлений.");
                break;
            default:
                System.out.println("Доступ разрешён только на просмотр объявлений.");
                break;
        }
        System.out.println("Проверка окончена.");
    }
}
