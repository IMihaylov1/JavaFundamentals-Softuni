import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int numberProduct = scanner.nextInt();
        endPrice(product,numberProduct);
    }

    public static void endPrice(String product, int numberProduct) {
        double price;
        double endPrice;
        switch (product) {
            case "coffee":
                price = 1.50;
                endPrice = price * numberProduct;
                System.out.printf("%.2f", endPrice);
                break;
            case "water":
                price = 1.00;
                endPrice = price * numberProduct;
                System.out.printf("%.2f", endPrice);

                break;
            case "coke":
                price = 1.40;
                endPrice = price * numberProduct;
                System.out.printf("%.2f", endPrice);

                break;
            case "snacks":
                price = 2.00;
                endPrice = price * numberProduct;
                System.out.printf("%.2f", endPrice);

                break;
        }

    }
}
