import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");
        double finalResult = 0.0;
        for (String string : input) {
            char firstLetter = string.charAt(0);
            char lastLetter = string.charAt(string.length() - 1);
            String numberAssString = string.substring(1, string.length() - 1);
            double number = Double.parseDouble(numberAssString);

            double result;

            if (Character.isUpperCase(firstLetter)) {
                result = number  / (firstLetter - 64);
            } else {
                result = number * (firstLetter - 96);
            }

            if (Character.isUpperCase(lastLetter)) {
                result -= (lastLetter - 64);
            } else {
                result += (lastLetter - 96);
            }
            finalResult += result;
        }
        System.out.printf("%.2f", finalResult);
    }
}
