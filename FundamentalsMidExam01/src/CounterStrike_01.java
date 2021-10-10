import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countWon = 0;
        boolean isNotWinner = false;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (distance <= initialEnergy) {
                initialEnergy -= distance;
                countWon++;
                if (countWon % 3 == 0) {
                    initialEnergy += countWon;
                }
            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWon, initialEnergy);
                isNotWinner = true;
                break;
            }
            if (initialEnergy <= 0)  {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWon, initialEnergy);
                isNotWinner = true;
                break;
            }
            command = scanner.nextLine();
        }
        if(!isNotWinner){

            System.out.printf("Won battles: %d. Energy left: %d", countWon, initialEnergy);
        }
        }
    }
