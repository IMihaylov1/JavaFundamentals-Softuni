import java.util.Scanner;

public class Secret_Chat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();
        while (!"Reveal".equals(input)) {

            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            switch (command) {
                case "InsertSpace": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < message.length()) {
                        String space = " ";
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(message);
                        stringBuilder.insert(index, space);
                        message = stringBuilder.toString();
                        System.out.println(message);
                    }
                }
                break;
                case "Reverse": {
                    String substring = tokens[1];
                    if (message.contains(substring)) {
                        int index = message.indexOf(substring);
                        String firstPart = message.substring(0, index);
                        int endIndex = index+substring.length();
                        String thirdPart = message.substring(endIndex,message.length());
                        message = message.replace(substring, "");
                        StringBuilder reverse = new StringBuilder(substring);
                        reverse = reverse.reverse();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(firstPart);
                        stringBuilder.append(thirdPart);
                        stringBuilder.append(reverse);
                        message = stringBuilder.toString();

                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                }
                break;
                case "ChangeAll": {
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    if (message.contains(substring)) {
                        int index = message.indexOf(substring);
                        while (index >= 0) {
                            message = message.replace(substring, replacement);
                            index = message.indexOf(substring.charAt(0));
                        }
                    }

                    System.out.print(message);
                    System.out.println();
                    break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
