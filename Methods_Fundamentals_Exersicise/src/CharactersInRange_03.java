import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);

        if (start > end) {
            printCharactersInRange(end, start);
        } else {
            printCharactersInRange(start, end);
        }

    }

    public static void printCharactersInRange(char start, char end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(String.format("%c ", i));
        }
    }
}