import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

       StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int length = word.length();

            for (int i = 0; i <length; i++) {
                sb.append(word);
            }
        }
        System.out.println(sb);
    }
}
