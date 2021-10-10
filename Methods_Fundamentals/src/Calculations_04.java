import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        switch (calculation) {
            case "add":
                addNum1AndNum2(a, b);
                break;
            case "subtract":
                subtractNum1AndNum2(a, b);
                break;
            case "multiply":
                multiplyNum1AndNum2(a, b);
                break;
            case "divide":
                divideNum1AndNum2(a, b);
                break;
        }

    }

    public static void subtractNum1AndNum2(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public static void multiplyNum1AndNum2(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    public static void divideNum1AndNum2(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    public static void addNum1AndNum2(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}
