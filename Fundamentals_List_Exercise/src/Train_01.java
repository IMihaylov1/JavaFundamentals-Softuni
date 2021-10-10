import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacityWagon = Integer.parseInt(scanner.nextLine());
        String[] adding = scanner.nextLine().split("\\s+");

        while (!"end".equals(adding[0])) {

            if (adding[0].equals("Add")) {
                int passenger = Integer.parseInt(adding[1]);
                inputNumbers.add(passenger);

            } else {
                int addPeopleToWagon = Integer.parseInt(adding[0]);
                int sum = 0;
                for (int i = 0; i < inputNumbers.size(); i++) {
                    int number = inputNumbers.get(i);
                    sum = addPeopleToWagon + number;
                    if (sum <= capacityWagon) {
                        inputNumbers.set(i, sum);
                        break;
                    } else {
                        sum = 0;
                    }

                }
            }
            adding = scanner.nextLine().split("\\s+");
        }
        for (Integer number : inputNumbers) {
            System.out.print(number + " ");
        }

    }

}
