import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        char firstSymbol = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (firstSymbol == symbol) {

            } else {
                sb.append(firstSymbol);
                firstSymbol = symbol;
            }
        }
        sb.append(firstSymbol);
        System.out.println(sb);
    }

}
