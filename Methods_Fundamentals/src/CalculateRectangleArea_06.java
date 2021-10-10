import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = rectangleArea(width,length);
        System.out.printf("%.0f",area);
    }

    public static double rectangleArea(double width, double length) {
        return width*length;
    }
}
