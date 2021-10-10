import java.util.Scanner;

public class BiscuitsFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workerCount = Integer.parseInt(scanner.nextLine());
        int biscuitsFor30daysOtherFactory = Integer.parseInt(scanner.nextLine());
        double production = biscuitsPerDay * workerCount;
        double sum = 0;
        double diff = 0;

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                diff = production * 0.75;
                diff = Math.floor(diff);
                sum += diff;
            } else {
                sum += production;

            }

        }
        double difference = sum - biscuitsFor30daysOtherFactory;
        double percentage = difference/ biscuitsFor30daysOtherFactory * 100;
        if(sum>biscuitsFor30daysOtherFactory){
            System.out.printf("You have produced %.0f biscuits for the past month.%n",sum);
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        }else {
            double percentage2 = difference/biscuitsFor30daysOtherFactory*100;
            System.out.printf("You have produced %.0f biscuits for the past month.%n",sum);
            System.out.printf("You produce %.2f percent less biscuits.",Math.abs(percentage2));
        }
    }
}
