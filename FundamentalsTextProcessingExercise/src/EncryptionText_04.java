
import java.util.Scanner;

public class EncryptionText_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int shift = 3;

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i <input.length() ;i++) {
            int symbol = input.charAt(i);
            char currentPosition = (char) (symbol+shift);
            encrypted.append(currentPosition);
        }


        System.out.println(encrypted);
    }
}

