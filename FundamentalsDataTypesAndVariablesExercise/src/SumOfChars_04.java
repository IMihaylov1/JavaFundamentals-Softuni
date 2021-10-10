import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char letter = scanner.next().charAt(0);
            int suma = letter;
            sum += suma;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
