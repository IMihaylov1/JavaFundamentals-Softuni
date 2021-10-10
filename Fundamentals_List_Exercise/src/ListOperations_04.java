import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split("\\s+");

//        •	Add {number} – add number at the end
//•	Insert {number} {index}” – insert number at given index
//•	Remove {index} – remove at index
//•	Shift left {count} – first number becomes last ‘count’ times
//•	Shift right {count} – last number becomes first ‘count’ times

        while (!"End".equals(commands[0])) {
            if (commands[0].equals("Add")) {
                int numToAdd = Integer.parseInt(commands[1]);
                input.add(numToAdd);

            } else if (commands[0].equals("Insert")) {

                int index = Integer.parseInt(commands[2]);
                if (index >= 0 && index < input.size()) {
                    int numToAdd = Integer.parseInt(commands[1]);
                    input.add(index, numToAdd);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (commands[0].equals("Remove")) {
                int index = Integer.parseInt(commands[1]);
                if (index >= 0 && index < input.size()) {
                    input.remove(index);
                } else {
                    System.out.println("Invalid index");

                }

            } else if (commands[0].equals("Shift") && commands[1].equals("left")) {
                int count = Integer.parseInt(commands[2]);
                for (int j = 0; j < count; j++) {
                    int temp = input.get(0);
                    for (int i = 0; i < input.size() - 1; i++) {
                        input.set(i, input.get(i + 1));
                    }
                    input.set(input.size() - 1, temp);
                }

            } else if (commands[0].equals("Shift") && commands[1].equals("right")) {
                int count = Integer.parseInt(commands[2]);
                for (int i = 0; i < count; i++) {
                    int temp = input.get(input.size() - 1);
                    for (int j = input.size() - 1; j > 0; j--) {
                        input.set(j, input.get(j - 1));
                    }
                    input.set(0, temp);
                }

            }

            commands = scanner.nextLine().split("\\s+");
        }
        for (Integer num : input) {
            System.out.print(num + " ");
        }

    }
}
