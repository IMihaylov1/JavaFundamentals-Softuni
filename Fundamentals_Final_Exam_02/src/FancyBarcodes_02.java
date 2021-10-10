import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<name>[A-Z]{1}[A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            String productGroup = "";
            if (matcher.find()) {
                String item = matcher.group("name");
                for (int j = 0; j < item.length(); j++) {
                    char currentChar = item.charAt(j);
                    if (Character.isDigit(currentChar)) {
                        productGroup += currentChar;
                    }
                }
                if (productGroup.equals("")) {
                    productGroup = "00";
                    System.out.printf("Product group: %s%n", productGroup);
                }else {
                    System.out.printf("Product group: %s%n", productGroup);
                }
            } else {
                System.out.println("Invalid barcode");

            }

        }
    }
}
