import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            Character symbol = input.charAt(i);

            if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else if (Character.isDigit(symbol)) {
                numbers.append(symbol);

            } else {
                symbols.append(symbol);

            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
