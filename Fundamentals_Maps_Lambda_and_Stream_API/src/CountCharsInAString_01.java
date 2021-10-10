import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[] input = scanner.nextLine().toCharArray();


        LinkedHashMap<Character, Integer> symbol = new LinkedHashMap<>();

        for (char s : input) {
            if (s == ' ') {
                continue;
            }
            if (!symbol.containsKey(s)) {
                symbol.put(s, 1);
            } else {
                symbol.put(s, symbol.get(s) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbol.entrySet()) {

            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
