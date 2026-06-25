package core.oop.generics.coocking_class;

public class Main {
  public static void main(String[] args) {
    // Создайте список мастер-класса для продвинутых участников
    WorkshopList<AdvancedParticipant> list = new WorkshopList<>();

    // Регистрируем нескольких участников
    list.register(new AdvancedParticipant("Мария", "CERT-001", "CARD-1001"));
    list.register(new AdvancedParticipant("Александр", "CERT-002", "CARD-1002"));

    // Печатаем всех участников
    System.out.println("=== Все участники ===");
    list.printAll();
  }
}
