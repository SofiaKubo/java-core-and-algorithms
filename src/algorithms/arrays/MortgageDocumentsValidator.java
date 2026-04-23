package algorithms.arrays;

public class MortgageDocumentsValidator {
    public static void main(String[] args) {
        String[] participants = {"Петр", "Надежда", "Валентин"};
        String[] documents = {"Паспорт", "Водительские права", "Свидетельство о рождении"};

        if (documents.length == participants.length) {
            System.out.println("Документы загружены верно. Список документов:");
            for (int i = 0; i < documents.length; i++) {
                System.out.println(participants[i] + ": " + documents[i]);
            }
        } else {
            System.out.println("Количество документов не соответствует количеству участников сделки.");
        }
    }
}
