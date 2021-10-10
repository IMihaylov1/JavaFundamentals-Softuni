import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split("!");
        List<String> shoppingList = new ArrayList<>(Arrays.asList(list));

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("Go") && !command[1].equals("Shopping!")) {
            String currentCommand = command[0];
            switch (currentCommand) {
                case "Urgent": {
                        String commandFor = command[1];
                        if (!shoppingList.contains(commandFor)) {
                            shoppingList.add(0, commandFor);
                        }
                        break;
                    }
                case "Unnecessary": {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        String item = shoppingList.get(i);
                        if (command[1].equals(item)) {
                            shoppingList.remove(item);
                            break;
                        }
                    }
                }
                break;
                case "Correct": {
                    String oldItem = command[1];
                    String newItem = command[2];
                    for (int i = 0; i < shoppingList.size(); i++) {
                        String item = shoppingList.get(i);
                        if (oldItem.equals(item)) {
                            shoppingList.set(i, newItem);
                            break;
                        }
                    }
                }
                break;

                case "Rearrange": {
                    String item = command[1];
                    for (int i = 0; i < shoppingList.size(); i++) {
                        String items = shoppingList.get(i);
                        if (item.equals(items)) {
                            String taken = shoppingList.remove(i);
                            shoppingList.add(taken);
                            break;
                        }
                    }
                }
                break;
            }
            command = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < shoppingList.size(); i++) {
            if ((i) == (shoppingList.size() - 1)) {
                System.out.print(shoppingList.get(i));
            } else {
                System.out.print(shoppingList.get(i) + ", ");
            }

        }
    }
}
