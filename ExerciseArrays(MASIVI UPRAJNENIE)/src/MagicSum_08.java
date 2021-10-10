import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());
        int sum;

        for (int i = 0; i < input.length; i++) {
            int currentNum = input[i];

            for (int j = i + 1; j < input.length; j++) {
                int nextNum = input[j];
                sum = currentNum + nextNum;
                if (magicNum == sum) {
                    System.out.println(currentNum + " " + nextNum);
                }
            }
        }
    }
}