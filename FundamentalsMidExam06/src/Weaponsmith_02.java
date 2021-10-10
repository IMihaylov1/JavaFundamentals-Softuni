import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Weaponsmith_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weapon = scanner.nextLine().split("\\|");
        List<String> weapons = new ArrayList<>(Arrays.asList(weapon));

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] parts = command.split(" ");
            if (parts[0].equals("Move") && parts[1].equals("Left")) {
                int index = Integer.parseInt(parts[2]);
                if (index > 0 && index < weapons.size()) {
                    String getIndex = weapons.get(index);
                    weapons.remove(index);
                    weapons.add(index - 1, getIndex);
                }


            } else if (parts[0].equals("Move") && parts[1].equals("Right")) {
                int index = Integer.parseInt(parts[2]);
                if (index >= 0 && index < weapons.size() - 1) {
                    String getIndex = weapons.get(index);
                    weapons.remove(index);
                    weapons.add(index + 1, getIndex);
                }

            } else if (parts[0].equals("Check") && parts[1].equals("Even")) {
                for (int i = 0; i < weapons.size(); i++) {
                    if (i % 2 == 0) {
                        System.out.printf(weapons.get(i) + " ");
                    }
                }
                System.out.println();


            }else if (parts[0].equals("Check") && parts[1].equals("Odd")) {
                for (int i = 0; i < weapons.size(); i++) {
                    if (i % 2 == 1) {
                        System.out.printf(weapons.get(i) + " ");
                    }
                }
                System.out.println();
            }

                command = scanner.nextLine();
        }
        System.out.print("You crafted ");
        for (String s : weapons) {
            System.out.print(s);
        }
        System.out.print("!");

    }
}
