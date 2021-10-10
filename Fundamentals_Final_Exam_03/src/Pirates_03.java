
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, Integer> cityAndPopulation = new TreeMap<>();
        TreeMap<String, Integer> cityAndGold = new TreeMap<>();
        int count = 0;


        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (!cityAndPopulation.containsKey(city) && !cityAndGold.containsKey(city)) {
                cityAndPopulation.put(city, population);
                cityAndGold.put(city, gold);
                count++;
            } else {
                int currentPopulation = cityAndPopulation.get(city);
                int currentGold = cityAndGold.get(city);
                cityAndPopulation.put(city, currentPopulation + population);
                cityAndGold.put(city, currentGold + gold);
            }
            input = scanner.nextLine();
        }
        String text = scanner.nextLine();

        while (!text.equals("End")) {
            String[] tokens = text.split("=>");
            String command = tokens[0];
            switch (command) {
                case "Plunder": {
                    String city = tokens[1];
                    int people = Integer.parseInt(tokens[2]);
                    int gold = Integer.parseInt(tokens[3]);
                    int currentPeople = cityAndPopulation.get(city);
                    int currentGold = cityAndGold.get(city);
                    int diffAfterAttackPeople = currentPeople - people;
                    int diffAfterAttackGold = currentGold - gold;
                    cityAndPopulation.put(city, currentPeople - people);
                    cityAndGold.put(city, currentGold - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);
                    if (diffAfterAttackGold <= 0 || diffAfterAttackPeople <= 0) {
                        cityAndPopulation.remove(city);
                        cityAndGold.remove(city);
                        System.out.printf("%s has been wiped off the map!%n", city);
                        count--;
                    }
                }

                break;
                case "Prosper": {
                    String city = tokens[1];
                    int gold = Integer.parseInt(tokens[2]);
                    int currentGold = cityAndGold.get(city);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        cityAndGold.put(city, currentGold + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n"
                                , gold, city, currentGold + gold);
                    }

                }
                break;

            }
            text = scanner.nextLine();
        }
        if (cityAndGold.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", count);
            cityAndGold.entrySet()
                    .stream()
                    .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                    .forEach(c1 -> {
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                                , c1.getKey(), cityAndPopulation.get(c1.getKey()), c1.getValue());
                    });

        }

    }
}
