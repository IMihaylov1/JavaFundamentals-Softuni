import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            StringBuilder word = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                word.append(input.charAt(i));
            }
            System.out.printf("%s = %s%n", input, word.toString());

            input = scanner.nextLine();
        }
    }


}

