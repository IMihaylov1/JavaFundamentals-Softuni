import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int sum = sumEvenNumbers(numbers);
        System.out.println(sum);
    }

    public static int sumEvenNumbers(String[] number) {
        int[] numbers = new int[number.length];
        int sumEvenNum = 0;
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
            if (numbers[i] % 2 == 0) {
                sumEvenNum += numbers[i];
            }
        }
        return sumEvenNum;
    }
}
