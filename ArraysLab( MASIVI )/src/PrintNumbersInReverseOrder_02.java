import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int a = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            numbers[i] = a;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] +" ");
        }

    }
}