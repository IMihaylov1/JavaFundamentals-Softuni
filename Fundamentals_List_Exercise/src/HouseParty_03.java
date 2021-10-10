import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCommand = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < numberOfCommand; i++) {
            String[] inputCommand = scanner.nextLine().split("\\s+");
            String name = inputCommand[0];
            if (inputCommand[1].equals("is") && inputCommand[2].equals("going!")) {
                if (guestList.contains(inputCommand[0])) {
                    System.out.println(inputCommand[0] + " is already in the list!");
                } else {
                    guestList.add(inputCommand[0]);
                }
            } else {
                if (guestList.contains(inputCommand[0])) {
                    guestList.remove(name);
                } else {
                    System.out.println(inputCommand[0] + " is not in the list!");
                }
            }
        }
        for (String nameOnTheList : guestList) {
            System.out.println(nameOnTheList);
        }
    }
}
