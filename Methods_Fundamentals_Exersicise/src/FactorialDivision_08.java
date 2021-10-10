import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

double sum = findFactorial(a)/findFactorial(b);
        System.out.printf("%.2f",sum);




    }
    public static double findFactorial (double a){
        double sum = 1;
        for (int i = 1; i <=a ; i++) {
           sum =sum*i;
        }
    return sum;
    }

}
