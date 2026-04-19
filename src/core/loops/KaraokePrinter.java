package core.loops;

public class KaraokePrinter {
  public static void main(String[] args) {
    String doubleFaina = "Фаина Фаина";
    String fainaNa = "Файна-на";
    String fainaFainaNa = "Фаина Файна-на";

    for (int line = 1; line <= 10; line++) {
      if (line == 3 || line == 9) {
        System.out.println(fainaNa);
      } else if (line == 4 || line == 10) {
        System.out.println(fainaFainaNa);
      } else {
        System.out.println(doubleFaina);
      }
    }
    System.out.println("Ах люблю тебя, Фаина-Фаина");
  }
}
