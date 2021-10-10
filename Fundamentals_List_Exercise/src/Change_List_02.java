import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Change_List_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] commands = scanner.nextLine().split("\\s+");

        while (!"end".equals(commands[0])) {
            if (commands[0].equals("Delete")) {
                int elementForDeleteInList = Integer.parseInt(commands[1]);

                for (int i = 0; i < inputNumbers.size(); i++) {
                    int number = inputNumbers.get(i);
                    if (number == elementForDeleteInList) {
                        inputNumbers.remove(i);
                        i--;
                    }
                }
            } else if (commands[0].equals("Insert")) {
                int numberToAdd = Integer.parseInt(commands[1]);
                int positionInListToAddTheNumber = Integer.parseInt(commands[2]);

                if ( positionInListToAddTheNumber < inputNumbers.size()) {

                    inputNumbers.add(positionInListToAddTheNumber, numberToAdd);
                }


            }
            commands = scanner.nextLine().split("\\s+");
        }


        for (Integer number : inputNumbers) {
            System.out.print(number + " ");
        }

    }
}
