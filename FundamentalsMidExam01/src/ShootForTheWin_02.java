import java.util.Arrays;
import java.util.Scanner;
public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int countShooting = 0;

        while (!command.equals("End")) {
            int indexToShoot = Integer.parseInt(command);
            if (indexToShoot >= 0 && indexToShoot < targets.length) {

                for (int i = 0; i < targets.length; i++) {
                    int target = targets[indexToShoot];
                    if (targets[i] != -1 && i != indexToShoot) {

                        if (targets[i] > target) {
                            targets[i] -= target;
                        } else if (targets[i] <= target) {
                            targets[i] += target;
                        }
                    }
                }
                targets[indexToShoot] = -1;
                countShooting++;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShooting);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
