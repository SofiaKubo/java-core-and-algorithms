package practicum.conditions;

class WashingModeDetector {
  public static void main(String[] args) {
    int dirtyLevel = 3;
    boolean isDelicate = true;
    int clothesWeight = 6;

    String washingMode;

    if (dirtyLevel <= 2) {
      if (isDelicate) {
        washingMode = "Деликатный";
      } else {
        washingMode = "Стандартный";
      }
    } else {
      if (clothesWeight > 5) {
        washingMode = "Большая загрузка";
      } else {
        washingMode = "Сильные загрязнения";
      }
    }
    System.out.println("Выбран режим стирки: " + washingMode + ".");
  }
}
