package practicum.conditions;

public class Planner {
    public static void main(String[] args) {
        String season = "spring";
        int totalPeople = 5;
        int dancers = 2;
        int gamePlayers = 3;
        int temperature = 20;

        if (season.equals("summer")) {
            System.out.println("Пойдём гулять!");
        } else if (temperature > 15) { // Проверьте, что на улице тепло
            System.out.println("Пойдём в кафе на веранду!");
        } else if (dancers > 0) {
            System.out.println("Пойдём в бар!");
        } else if (gamePlayers == totalPeople) {
            System.out.println("Пойдём к кому-то в гости и поиграем в настольные игры!");
        }
    }
}
