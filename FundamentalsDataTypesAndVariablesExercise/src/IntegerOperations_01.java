import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        int four = Integer.parseInt(scanner.nextLine());

        int sum1and2 = first+second;
        int secondSum = sum1and2 / three;
        int result = secondSum *four;

        System.out.println(result);
    }
}
