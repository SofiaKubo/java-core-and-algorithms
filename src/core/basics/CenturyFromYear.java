package core.basics;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(whatCentury(1999));
        System.out.println(whatCentury(2011));
        System.out.println(whatCentury(2154));
        System.out.println(whatCentury(2259));
        System.out.println(whatCentury(1124));
        System.out.println(whatCentury(2000));
    }

    public static String whatCentury(int year) {
        int century = (year + 99) / 100;
        int lastTwo = century % 100;
        int lastOne = century % 10;
        String suffix;

        if (lastTwo == 11 || lastTwo == 12 || lastTwo == 13) {
            suffix = "th";
        } else if (lastOne == 1) {
            suffix = "st";
        } else if (lastOne == 2) {
            suffix = "nd";
        } else if (lastOne == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        return century + suffix;
    }
}
