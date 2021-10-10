import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> items = new TreeMap<>();
        items.put("shards", 0);
        items.put("motes", 0);
        items.put("fragments", 0);
        TreeMap<String, Integer> junkItem = new TreeMap<>();

        boolean isFound = false;

        while (!isFound) {
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int count = Integer.parseInt(tokens[i]);
                String type = tokens[i+1].toLowerCase();

                if (items.containsKey(type)) {
                    int current = items.get(type);
                    addItem(items, type, count);
                    isFound = hasLegendary(items, type);

                    if(isFound){
                        break;
                    }
                } else {

                    addItem(junkItem, type, count);
                }

            }
        }
        items
                .entrySet()
                .stream()
                .sorted((i1,i2)->Integer.compare(i2.getValue(),i1.getValue()))
                .forEach(i->System.out.println(String.format("%s: %d",i.getKey(),i.getValue())));
        junkItem
                .entrySet()
                .forEach(j->System.out.println(String.format("%s: %d",j.getKey(),j.getValue())));


    }

    private static boolean hasLegendary(TreeMap<String, Integer> specialItem, String type) {
        int count = specialItem.get(type);
        if (count >= 250) {
            specialItem.put(type, count - 250);
            switch (type) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    return true;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    return true;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    return true;
            }
        }
        return false;
    }

    public static void addItem(TreeMap<String, Integer> map, String key, Integer value) {

        map.putIfAbsent(key, 0);
        int count = map.get(key);
        map.put(key, count + value);
    }
}
