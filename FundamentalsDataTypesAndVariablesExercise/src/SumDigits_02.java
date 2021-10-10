import java.util.Arrays;
import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("");
        int[] realNum = new int[numbers.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            realNum[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i <realNum.length ; i++) {
            sum = sum+realNum[i];
        }
        System.out.println(sum);

    }
}
