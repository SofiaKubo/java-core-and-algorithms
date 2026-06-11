package core.oop.static_fields.forest_simulation;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        season = newSeason;

        if (newSeason.equals("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
