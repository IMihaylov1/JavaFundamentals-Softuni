import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            text = text.replaceAll(word, new String(new char[word.length()]).replace('\0', '*'));
        }
        System.out.println(text);
    }
}

