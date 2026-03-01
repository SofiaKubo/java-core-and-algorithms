package practicum.basics;

public class AnswerChecker {
  public static void main(String[] args) {
    checkQuestion(1, 3 == 2);
    checkQuestion(2, 4 != 4);
    checkQuestion(3, 1 == 1);
  }

  private static void checkQuestion(int number, boolean isCorrect) {
    System.out.println("Результат проверки вопроса " + number + ": " + isCorrect);
  }
}
