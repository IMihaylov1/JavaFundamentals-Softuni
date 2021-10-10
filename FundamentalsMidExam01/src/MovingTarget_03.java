import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("End")) {
            String stileCommand = command[0];
            switch (stileCommand) {
                case "Shoot": {
                    int indexForShoot = Integer.parseInt(command[1]);
                    int powerOfShooting = Integer.parseInt(command[2]);
                    if (indexForShoot >= 0 && indexForShoot < targets.size()) {
                        int currentTarget = targets.get(indexForShoot);
                        int diff = currentTarget - powerOfShooting;
                        if (diff <= 0) {
                            targets.remove(indexForShoot);
                        } else {
                            targets.set(indexForShoot, diff);
                        }

                    }
                }
                break;
                case "Add": {
                    int index = Integer.parseInt(command[1]);
                    int value = Integer.parseInt(command[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }

                }
                break;
                case "Strike": {
                    int index = Integer.parseInt(command[1]);
                    int radius = Integer.parseInt(command[2]);
                    if (index + radius >= targets.size() - 1 || index - radius < 0) {
                        System.out.println("Strike missed!");
                    } else {
                        int leftBound = Math.max(0, index - radius);
                        int rightBound = Math.min(targets.size() - 1, index + radius);

                        for (int i = rightBound; i >= leftBound; i--) {
                            targets.remove(i);
                        }
                    }
                }
                break;
            }

            command = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < targets.size(); i++) {
//            int current = targets.get(targets.size()-1);
            if ((i) == (targets.size() - 1)) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }

        }


    }
}
