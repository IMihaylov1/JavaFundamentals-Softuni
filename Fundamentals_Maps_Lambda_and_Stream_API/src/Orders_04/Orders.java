package Orders_04;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> rememberProducts = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String[] tokens = command.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!orders.containsKey(name)) {
                orders.put(name, price * quantity);
                rememberProducts.put(name, quantity);
            } else{
                rememberProducts.put(name,rememberProducts.get(name)+quantity);
                orders.put(name,rememberProducts.get(name)*price);
            }
                command = scanner.nextLine();
        }
        orders.forEach((key,value)->System.out.println(String.format("%s -> %.2f",key,value)));
    }
}
