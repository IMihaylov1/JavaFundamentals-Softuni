import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "swap": {
                    int index1 = Integer.parseInt(parts[1]);
                    int index2 = Integer.parseInt(parts[2]);
                    int indextoken1 = targets.get(index1);
                    int indextoken2 = targets.get(index2);
                    targets.set(index1, indextoken2);
                    targets.set(index2, indextoken1);
                }
                break;
                case "multiply": {
                    int index1 = Integer.parseInt(parts[1]);
                    int index2 = Integer.parseInt(parts[2]);
                    int indextoken1 = targets.get(index1);
                    int indextoken2 = targets.get(index2);
                    int multy = indextoken1 * indextoken2;
                    targets.set(index1, multy);
                }
                break;
                case "decrease": {
                    for (int i = 0; i <targets.size() ; i++) {
                        int taken = targets.get(i);
                        int diff = taken-1;
                        targets.set(i,diff);
                    }

                }
                break;
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < targets.size(); i++) {
            if ((i) == (targets.size() - 1)) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + ", ");
            }
        }

    }
}
