import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];
            switch (command) {
                case "Contains": {
                    String substring = tokens[1];
                    if (word.contains(substring)) {
                        System.out.printf("%s contains %s%n", word, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                }
                break;
                case "Flip": {
                    String upOrDown = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String firstPart = word.substring(0, startIndex);
                    String secondPart = word.substring(endIndex, word.length());
                    String substring = word.substring(startIndex, endIndex);
                    if (upOrDown.equals("Upper")) {
                        substring = substring.toUpperCase();
                        word = firstPart + substring + secondPart;
                        System.out.println(word);
                        break;
                    } else if (upOrDown.equals("Lower")) {
                        substring = substring.toLowerCase();
                        word = firstPart + substring + secondPart;
                        System.out.println(word);
                        break;
                    }
                }
                break;
                case "Slice": {
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    String firstPart = word.substring(0, startIndex);
                    String secondPart = word.substring(endIndex, word.length());
                    word =firstPart+secondPart;
                    System.out.println(word);
                }
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",word);
    }
}
