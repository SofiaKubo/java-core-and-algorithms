package algorithms.arrays;

public class PlansUpdater {
    public static void main(String[] args) {
        String[] plans = {"Поехать в Китай по работе",
            "Отметить день рождения с друзьями",
            "Обустроить рабочее место",
            "Научиться вести бюджет",
            "Купить диван",
            "Поехать на музыкальный фестиваль",
            "Попросить на работе один удалённый день в неделю",
            "Заняться спортом",
            "Поехать в Японию в отпуск",
            "Начать внедрять zero waste-подходы в повседневную жизнь",
            "Встречаться с друзьями не реже раза в неделю",
            "Перестать есть в кровати"
        };

        String swap = plans[0];
        plans[0] = plans[4];
        plans[4] = swap;

        plans[8] = "Поехать в Сочи в отпуск";

        System.out.println("Изменения в планах:");
        System.out.println("1. " + plans[0]);
        System.out.println(plans[4]);
        System.out.println(plans[8]);
    }
}
