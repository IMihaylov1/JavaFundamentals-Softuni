import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = sumFirstAndSecond(a, b);
        int endSum = divideSumByThirdInt(sum, c);
        System.out.println(endSum);
    }

    public static int sumFirstAndSecond(int a, int b) {
        return a + b;
    }

    public static int divideSumByThirdInt(int sum, int c) {
        return sum - c;
    }
}
