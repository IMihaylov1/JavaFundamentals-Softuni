import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "TakeOdd": {
                    for (int i = 0; i < text.length(); i++) {
                        if (i % 2 != 0) {
                            char currentChar = text.charAt(i);
                            stringBuilder.append(currentChar);
                        }
                    }
                    text = stringBuilder.toString();
                    System.out.println(text);
                }
                break;
                case "Cut": {
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String firstPart = text.substring(0, index);
                    String secondPart = text.substring(index + length);

                    text = firstPart + secondPart;
                    System.out.println(text);
                }
                break;
                case "Substitute": {
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    if (text.contains(substring)) {
                        while (text.contains(substring)) {
                            text = text.replace(substring, substitute);
                        }
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",text);
    }
}
