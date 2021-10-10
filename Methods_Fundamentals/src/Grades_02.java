import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        printWhatGradeIs(n);
    }

    public static void printWhatGradeIs(double n) {
        if (n >= 2.00 && n <= 2.99) {
            System.out.print("Fail");
        } else if (n >= 3.00 && n <= 3.49){
            System.out.print("Poor");
        }else if (n >= 3.50&& n <= 4.49){
            System.out.print("Good");
        }else if (n >= 4.50&& n <= 5.49){
            System.out.print("Very good");
        }else if (n >= 5.50&& n <= 6.00){
            System.out.print("Excellent");
        }
    }
}
