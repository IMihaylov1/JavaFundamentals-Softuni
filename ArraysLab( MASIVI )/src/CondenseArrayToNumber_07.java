
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                number[j] = number[j] + number[j + 1];
            }
        }
        System.out.println(number[0]);
    }
}
