package core.oop.generics.answer_app;

import java.util.Map;

public class AnswerHolder<T extends Number> implements SmartPrintable {
  private final String question;
  private T answer;

  public AnswerHolder(String question, T answer) {
    this.question = question;
    this.answer = answer;
  }

  public void replaceAnswer(Map<String, ? extends T> encyclopedia) {
    // метод должен замещать значение answer значением, полученным из аргумента - хеш-таблицы,
    // для данного вопроса
    this.answer = encyclopedia.get(this.question);
  }

  @Override
  public void printSmart() {
    System.out.println("Ответ на вопрос '" + question + "' равен " + answer);
  }
}
