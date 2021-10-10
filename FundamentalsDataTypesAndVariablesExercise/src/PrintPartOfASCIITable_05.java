import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        char one = (char) first;
        char two = (char) second;

        for (char letter = one; letter <= two; letter++) {
            System.out.printf("%c", letter);
        }
    }
}