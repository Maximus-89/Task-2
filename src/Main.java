public class Main {
    public static void main(String[] args)
    {int score = 430;
        int depositAccount = 1500;

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 50;
        } else {
            bonus = 0;
        }
        int balance = score + depositAccount + bonus;
        System.out.println(" Итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}