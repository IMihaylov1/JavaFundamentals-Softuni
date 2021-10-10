import java.util.*;

public class WizardPoker_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weapon = scanner.nextLine().split(":");
        List<String> weapons = new ArrayList<>(Arrays.asList(weapon));
        List<String> deck = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("Ready")) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "Add": {
                    String cardName = parts[1];
                    if (weapons.contains(cardName)) {
                        deck.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                }
                break;
                case "Insert": {
                    String cardName = parts[1];
                    int index = Integer.parseInt(parts[2]);
                    if (weapons.contains(cardName) && index >= 0 && index < deck.size()) {
                        deck.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                }
                break;
                case "Remove": {
                    String cardName = parts[1];
                    if (deck.contains(cardName)) {
                        deck.remove(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                }
                break;
                case "Swap": {
                    String cardName1 = parts[1];
                    String cardName2 = parts[2];
                    int indexName1 = deck.indexOf(cardName1);
                    int indexName2 = deck.indexOf(cardName2);
                    deck.remove(cardName1);
                    deck.remove(cardName2);
                    deck.add(indexName1, cardName2);
                    deck.add(indexName2, cardName1);
                }
                break;
                case "Shuffle": {
                    Collections.reverse(deck);

                }
                break;
            }

            command = scanner.nextLine();
        }
        for (String card : deck) {
            System.out.print(card + " ");
        }

    }
}
