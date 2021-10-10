import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Имате резервоар за вода с вместимост 255 литра.
//На следващите n реда ще получите литри вода, която трябва да излеете в резервоара си.
//Ако капацитетът не е достатъчен, отпечатайте „Недостатъчен капацитет!“
// и продължете да четете следващия ред.
// На последния ред отпечатайте литрите в резервоара.

        int n =Integer.parseInt(scanner.nextLine());
        int all = 255;
        int capacity=0;

        for (int i = 0; i < n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());

            if (capacity + litres <= all){
                capacity+=litres;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(capacity);
    }
}