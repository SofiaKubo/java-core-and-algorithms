package core.oop.generics.answer_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    AnswerHolder<Number> elephantAnswer = new AnswerHolder<>("Сколько весит слон в тоннах", 5);
    elephantAnswer.printSmart();

    HashMap<String, Double> bigRussianEncyclopedia = new HashMap<>();
    bigRussianEncyclopedia.put("Сколько часов в сутках", (double) 24);
    bigRussianEncyclopedia.put("Сколько весит слон в тоннах", 4.3);

    elephantAnswer.replaceAnswer(bigRussianEncyclopedia);
    elephantAnswer.printSmart();

    HardQuestion elephantVolumeQuestion =
        new HardQuestion("Как вычислить объём слона с помощью подручных средств?");
    elephantVolumeQuestion.printSmart();

    ArrayList<SmartPrintable> printables = new ArrayList<>();
    printables.add(elephantAnswer);
    printables.add(elephantVolumeQuestion);
    System.out.println("Всё, что можно распечатать: ");
    print(printables);

    ArrayList<AnswerHolder<Number>> answers = new ArrayList<>();
    answers.add(elephantAnswer);
    System.out.println("Лучшие ответы на вопросы: ");
    print(answers);
  }

  public static void print(List<? extends SmartPrintable> values) {
    for (SmartPrintable value : values) {
      value.printSmart();
    }
  }
}
