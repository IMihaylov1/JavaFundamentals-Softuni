import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberInput = scanner.nextLine();
        int multiply = Integer.parseInt(scanner.nextLine());

        if (multiply == 0) {
            System.out.println(0);
            return;
        }

        while (numberInput.charAt(0) == '0') {
            numberInput = numberInput.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        int remainder = 0;

        for (int i = numberInput.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(numberInput.charAt(i)));
            int product = digit * multiply + remainder;
            sb.append(product % 10);
            remainder = product / 10;
        }
        if (remainder != 0) {
            sb.append(remainder);
        }
        System.out.println(sb.reverse());
    }
}
