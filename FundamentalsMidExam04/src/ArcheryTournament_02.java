import java.util.Arrays;
import java.util.Scanner;

public class ArcheryTournament_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\|"))
                .mapToInt(Integer::parseInt).toArray();
        int points = 0;

        String command = scanner.nextLine();

        while (!command.equals("Game over")) {
            String[] parts = command.split("@");
            String comm = parts[0];
            switch (comm) {
                case "Shoot Left": {
                    int startIndexLeft = Integer.parseInt(parts[1]);
                    int lengthLeft = Integer.parseInt(parts[2]);
                    if (startIndexLeft >= 0 && startIndexLeft < targets.length) {
                        int targetIndex = startIndexLeft - lengthLeft;
                        while (targetIndex < 0) {
                            targetIndex = targets.length + targetIndex;
                        }
                        if (targets[targetIndex] >= 5) {
                            targets[targetIndex] -= 5;
                            points += 5;
                        } else {
                            points += targets[targetIndex];
                            targets[targetIndex] = 0;
                        }
                    }
                }
                break;
                case "Shoot Right":
                    int startIndexRight = Integer.parseInt(parts[1]);
                    int lengthRight = Integer.parseInt(parts[2]);
                    if (startIndexRight >= 0 && startIndexRight < targets.length) {
                        int targetIndex = startIndexRight + lengthRight;
                        while (targetIndex >= targets.length) {
                            targetIndex = targetIndex - targets.length;
                        }
                        if (targets[targetIndex] >= 5) {
                            targets[targetIndex] -= 5;
                            points += 5;
                        } else {
                            points += targets[targetIndex];
                            targets[targetIndex] = 0;
                        }
                    }
                    break;
                case "Reverse":
                    for (int i = 0; i < targets.length / 2; i++) {
                        int firstNum = targets[i];
                        targets[i] = targets[targets.length - 1 - i];
                        targets[targets.length - 1 - i] = firstNum;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < targets.length; i++) {
            if ((i) == (targets.length - 1)) {
                System.out.print(targets[i]);
            } else {
                System.out.print(targets[i] + " - ");
            }
        }
        System.out.println();
        System.out.printf("Iskren finished the archery tournament with %d points!", points);

    }
}
