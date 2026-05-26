package core.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HolidaysMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();

        ArrayList<Integer> january = new ArrayList<>();
        january.add(1);
        january.add(7);
        ArrayList<Integer> february = new ArrayList<>();
        february.add(23);
        ArrayList<Integer> march = new ArrayList<>();
        march.add(8);
        ArrayList<Integer> may = new ArrayList<>();
        may.add(1);
        may.add(9);
        ArrayList<Integer> june = new ArrayList<>();
        june.add(12);
        ArrayList<Integer> november = new ArrayList<>();
        november.add(4);

        stateHolidays.put("January", january);
        stateHolidays.put("February", february);
        stateHolidays.put("March", march);
        stateHolidays.put("May", may);
        stateHolidays.put("June", june);
        stateHolidays.put("November", november);

        System.out.println(stateHolidays);
    }
}
