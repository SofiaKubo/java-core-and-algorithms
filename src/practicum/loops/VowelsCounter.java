package practicum.loops;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCounter {
    private static final String VOWELS = "аеёиоуыэюя";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");

        String text = scanner.nextLine();
        int counter = 0;

        String updatedText = text.toLowerCase(Locale.forLanguageTag("ru"));

        for (int i = 0; i < updatedText.length(); i++) {
            if (VOWELS.indexOf(updatedText.charAt(i)) != -1) {
                counter++;
            }
        }
        System.out.println("Number of vowels: " + counter);
        scanner.close();
    }
}
