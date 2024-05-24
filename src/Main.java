public class Main {
  public static void main(String[] args) {
  
    int ticketPrice = 15; // Укажите здесь стоимость билета
    
    if (ticketPrice >= 20) {
        int bonusMiles = ticketPrice / 20;
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    } else {
        System.out.println("Сумма билета меньше 20 рублей, бонусные мили не начисляются.");
    }
  }
}
