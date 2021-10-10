import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordForRemove = scanner.nextLine();
        String word = scanner.nextLine();

        while (word.contains(wordForRemove)) {
            word = word.replace(wordForRemove, "");
        }
        System.out.println(word);
    }
}
