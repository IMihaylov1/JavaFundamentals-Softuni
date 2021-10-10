import java.util.Scanner;

public class DisneylandJourney_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyCost = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double moneyPerDaySaved = journeyCost * 0.25;
        double savedMoney = moneyPerDaySaved;

        for (int i = 2; i <= months; i++) {
            if (i % 2 != 0) {
                savedMoney = savedMoney - savedMoney * 0.16;

            }
            if (i % 4 == 0) {
                savedMoney = savedMoney + savedMoney * 0.25;
            }
            savedMoney += moneyPerDaySaved;

        }


        if (savedMoney > journeyCost) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", savedMoney - journeyCost);
        } else if (savedMoney < journeyCost) {
            System.out.printf("Sorry. You need %.2flv. more.", journeyCost - savedMoney);
        }

    }
}
