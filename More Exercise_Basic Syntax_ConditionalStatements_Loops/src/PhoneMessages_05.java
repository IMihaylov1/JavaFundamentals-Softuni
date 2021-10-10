
import java.util.Scanner;
public class PhoneMessages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String letterA = "";
        int input1 = Integer.parseInt(input);

        for (int i = 0; i < input1; i++) {
            String currentInput = scanner.nextLine();
            switch (currentInput) {
                case "2":
                    letterA = String.format("%sa", letterA);
                    break;
                case "22":
                    letterA = String.format("%sb", letterA);
                    break;
                case "222":
                    letterA = String.format("%sc", letterA);
                    break;
                case "3":
                    letterA = String.format("%sd", letterA);
                    break;
                case "33":
                    letterA = String.format("%se", letterA);
                    break;
                case "333":
                    letterA = String.format("%sf", letterA);
                    break;
                case "4":
                    letterA = String.format("%sg", letterA);
                    break;
                case "44":
                    letterA = String.format("%sh", letterA);
                    break;
                case "444":
                    letterA = String.format("%si", letterA);
                    break;
                case "5":
                    letterA = String.format("%sj", letterA);
                    break;
                case "55":
                    letterA = String.format("%sk", letterA);
                    break;
                case "555":
                    letterA = String.format("%sl", letterA);
                    break;
                case "6":
                    letterA = String.format("%sm", letterA);
                    break;
                case "66":
                    letterA = String.format("%sn", letterA);
                    break;
                case "666":
                    letterA = String.format("%so", letterA);
                    break;
                case "7":
                    letterA = String.format("%sp", letterA);
                    break;
                case "77":
                    letterA = String.format("%sq", letterA);
                    break;
                case "777":
                    letterA = String.format("%sr", letterA);
                    break;
                case "7777":
                    letterA = String.format("%ss", letterA);
                    break;
                case "8":
                    letterA = String.format("%st", letterA);
                    break;
                case "88":
                    letterA = String.format("%su", letterA);
                    break;
                case "888":
                    letterA = String.format("%sv", letterA);
                    break;
                case "9":
                    letterA = String.format("%sw", letterA);
                    break;
                case "99":
                    letterA = String.format("%sx", letterA);
                    break;
                case "999":
                    letterA = String.format("%sy", letterA);
                    break;
                case "9999":
                    letterA = String.format("%sz", letterA);
                    break;
                case "0":
                    letterA = String.format("%s ", letterA);
                    break;

            }
        }
        System.out.print(letterA);
    }
}