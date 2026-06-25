package core.oop.generics.answer_app;

public class HardQuestion implements SmartPrintable {
  private final String questionText;

  public HardQuestion(String questionText) {
    this.questionText = questionText;
  }

  @Override
  public void printSmart() {
    System.out.println("Текст очень сложного вопроса: " + questionText);
  }
}
