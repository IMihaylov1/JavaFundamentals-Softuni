import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        printMiddleCharacter(word);
    }

    public static void printMiddleCharacter(String word) {
        if (word.length() % 2 == 0) {
            char symbol = word.charAt(word.length() / 2 - 1);
            System.out.print(symbol);
        }
        char secondSymbol = word.charAt(word.length() / 2);
        System.out.println(secondSymbol);
    }
}

