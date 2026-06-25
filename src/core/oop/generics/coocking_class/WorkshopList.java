package core.oop.generics.coocking_class;

import java.util.ArrayList;

public class WorkshopList<T extends Participant & HasCertificate & HasCard> {
  private final ArrayList<T> participants = new ArrayList<>();

  /**
   * Регистрирует участника и печатает подтверждение
   */
  public void register(T participant) {
    // Используем методы из базового класса и интерфейсов:
    System.out.println("Зарегистрирован: " + participant.getInfo());
    System.out.println(
        "  Сертификат: "
            + participant.getCertificateId()
            + ", Карта: "
            + participant.getCardNumber());
    participants.add(participant);
  }

  /**
   * Печатает всех участников мастер-класса
   */
  public void printAll() {
    for (T p : participants) {
      System.out.println(
          p.getInfo() + " [cert=" + p.getCertificateId() + ", card=" + p.getCardNumber() + "]");
    }
  }
}
