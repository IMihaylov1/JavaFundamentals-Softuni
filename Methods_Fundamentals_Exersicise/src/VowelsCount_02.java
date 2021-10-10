
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int sum = sumAllVowels(word);
        System.out.println(sum);
    }

    public static int sumAllVowels(String word) {
        int sum = 0;
      String words =word.toLowerCase();
        for (int i = 0; i < words.length(); i++) {
            char symbol = words.charAt(i);
            switch (symbol) {
                case 'a':
                case 'u':
                case 'e':
                case 'o':
                case 'i':
                    sum++;
                    break;
            }
        }
        return sum;
    }
}
