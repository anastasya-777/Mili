public class Main {
    public static void main(String[] args) {
        // Объявление переменных
        int ticketPrice = 15590; // Стоимость билета
        int milesForRub = 20; // Количество рублей для одной бонусной мили

        // Расчёт бонусных миль
        int bonusMiles = ticketPrice / milesForRub;

        // Сохранение ответа в новую переменную
        int totalBonusMiles = bonusMiles;

        // Вывод на экран
        System.out.println("Количество бонусных миль: " + totalBonusMiles);
    }
}
