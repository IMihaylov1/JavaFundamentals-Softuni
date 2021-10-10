import java.util.LinkedHashMap;
import java.util.Scanner;

public class Parking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> registered = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String registeredOrUnregistered = commands[0];
            String username = commands[1];


            if (registeredOrUnregistered.equals("register")) {
                String licensePlate = commands[2];
                if (!registered.containsKey(username)) {
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                    registered.put(username, licensePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                }


            } else if (registeredOrUnregistered.equals("unregister")) {
                if(!registered.containsKey(username)){
                    System.out.println(String.format("ERROR: user %s not found",username));
                }else {
                    System.out.println(String.format("%s unregistered successfully",username));
                    registered.remove(username);
                }
            }


        }
        registered.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
