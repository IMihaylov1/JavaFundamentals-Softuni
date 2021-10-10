import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int  b = scanner.nextInt();
        System.out.println(new DecimalFormat("0.####").format(MathPower(a,b)));
    }

    public static double MathPower(double a ,int b) {
        return Math.pow(a,b);
    }
}
