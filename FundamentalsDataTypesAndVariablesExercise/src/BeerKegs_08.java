import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Напишете програма, която изчислява обема на n пити с бира.
//Ще получите общо 3 * n реда. Всеки три реда ще съдържа информация за единичен бут.
//Първо нагоре е моделът на бурето, след това е радиусът на бурето и на последно място е височината на бурето.
//Изчислете обема по следната формула: π * r ^ 2 * h.
//В края отпечатайте модела на най-големия бут.
//
// •	First – model – string.
//•	Second –radius – floating-point number
//•	Third – height – integer number
        int counter = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String biggestKeg = "";

        while (counter-- > 0)
        {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggestKeg = model;
            }

        }
        System.out.println(biggestKeg);
    }
}