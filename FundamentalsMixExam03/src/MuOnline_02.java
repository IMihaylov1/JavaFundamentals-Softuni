
import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dungeonsRooms = scanner.nextLine().split("\\|+");
        int health = 100;
        int bitcoins = 0;

        int bestRoom = 0;

        boolean madeIt = true;

        for (String dungeonsRoom : dungeonsRooms) {
            String[] tokens = dungeonsRoom.split("\\s+");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);
            bestRoom++;

            if (command.equalsIgnoreCase("potion")) {
                int currentHealth = health;
                health += number;
                if (health > 100) {
                    health = 100;
                    int amount = 100 - currentHealth;
                    System.out.printf("You healed for %d hp.%n", amount);
                } else {
                    System.out.printf("You healed for %d hp.%n", number);
                }
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equalsIgnoreCase("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);

            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d", bestRoom);
                    madeIt = false;
                    break;
                }
            }
        }
        if (madeIt) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}