import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardName_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        boolean isWinnerFirst;
        while (isWinnerFirst = true) {
            if (firstDeck.get(0) > secondDeck.get(0)) {
                Integer tempRemoveFromFirstDeck = firstDeck.remove(0);
                Integer tempRemoveFromSecondDeck = secondDeck.remove(0);
                firstDeck.add(tempRemoveFromFirstDeck);
                firstDeck.add(tempRemoveFromSecondDeck);

            } else if (secondDeck.get(0) > firstDeck.get(0)) {
                Integer tempRemoveFromSecondDeck = secondDeck.remove(0);
                Integer tempRemoveFromFirstDeck = firstDeck.remove(0);
                secondDeck.add(tempRemoveFromSecondDeck);
                secondDeck.add(tempRemoveFromFirstDeck);

            } else {
                Integer tempRemoveFromFirstDeck = firstDeck.remove(0);
                Integer tempRemoveFromSecondDeck = secondDeck.remove(0);

            }
            if (firstDeck.isEmpty()) {
                isWinnerFirst =false;
            break;
            } else if (secondDeck.isEmpty()) {
                isWinnerFirst=false;
                break;
            }
        }
        if (secondDeck.isEmpty()) {
            int sumFirst = 0;
            for (Integer number : firstDeck) {
                sumFirst += number;
            }
            System.out.printf("First player wins! Sum: %d", sumFirst);
        } else {
            int sumSecond = 0;
            for (Integer num : secondDeck) {
                sumSecond += num;
            }
            System.out.printf("Second player wins! Sum: %d", sumSecond);
        }
    }
}
