import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int power = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '>') {
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                result.append('>');
            } else if (power == 0) {
                result.append(symbol);
            }else {
                power--;
            }
        }
        System.out.println(result);
    }
}
