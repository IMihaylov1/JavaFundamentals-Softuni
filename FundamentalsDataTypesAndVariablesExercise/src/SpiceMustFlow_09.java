import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield=Integer.parseInt(scanner.nextLine());
        int amount=0;
        int days=0;

        while (startingYield>0){
            if (startingYield<100){
                if (amount<26){
                    break;
                }
                amount-=26;
                break;
            }
            amount+=startingYield-26;
            startingYield-=10;

            days++;
        }
        System.out.println(days);
        System.out.println(amount);
    }
}