import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(", ");
        List<String> collection = new ArrayList<>(Arrays.asList(list));

        String[] command = scanner.nextLine().split(" - ");

        while (!command[0].equals("Craft!")) {
            String currentCommand = command[0];
            switch (currentCommand) {
                case "Collect":
                    String item = command[1];
                    if (!collection.contains(item)) {
                        collection.add(item);
                    }
                    break;

                case "Drop":
                    String items = command[1];
                    while (collection.contains(items)) {
                        collection.remove(items);
                    }
                    break;
                case "Combine Items":
                    String[] things = command[1].split(":");
                    String oldItem = things[0];
                    int index = collection.indexOf(oldItem);
                    String newItem = things[1];
                    if (collection.contains(oldItem)) {
                        if(index>=collection.size()-1){
                            collection.add(newItem);
                        }
                        collection.add(index+1,newItem);
                    }
                    break;
                case "Renew":
                    String itemss = command[1];
                    if (collection.contains(itemss)) {
                       collection.remove(itemss);
                        collection.add(itemss);

                    }


            }

            command = scanner.nextLine().split(" - ");
        }
        System.out.print(String.join(", ", collection));
    }
}