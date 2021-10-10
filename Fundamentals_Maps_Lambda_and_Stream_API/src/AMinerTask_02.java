import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!map.containsKey(command)) {

                map.put(command, quantity);
            } else {
                int current = map.get(command);
                map.put(command, current + quantity);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> k : map.entrySet()) {
            System.out.println(k.getKey() + " -> " + k.getValue());
        }
    }
}
