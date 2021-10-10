import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")) {
            System.out.println(reversedTruOrFalse(number));
            number = scanner.nextLine();
        }
    }

    public static boolean reversedTruOrFalse(String number) {
        boolean itIsPalindrome = false;
        String reversed = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed += number.charAt(i);
        }
        return reversed.equals(number);
    }
}
