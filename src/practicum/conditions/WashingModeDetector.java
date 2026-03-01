package practicum.conditions;

class WashingModeDetector {
    public static void main(String[] args) {
        int dirtyLevel = 3;
        boolean isDelicate = false;
        int clothesWeight = 4;

        String washingMode;

        if (dirtyLevel <= 2) { // Проверьте уровень загрязнения
            if (isDelicate) { // В случае, если нужна деликатная стирка
                washingMode = "Деликатный"; // Режим "Деликатный"
            } else {
                washingMode = "Стандартный"; // Иначе "Стандартный"
            }
        } else {
            if (clothesWeight > 5) { // Если вещей больше 5 килограмм
                washingMode = "Большая загрузка"; // Режим "Большая загрузка"
            } else {
                washingMode = "Сильные загрязнения";// Иначе "Сильные загрязнения"
            }
        }
        System.out.println("Выбран режим стирки: " + washingMode +
                "."); // Выведите информацию о выбранном режиме
    }
}
