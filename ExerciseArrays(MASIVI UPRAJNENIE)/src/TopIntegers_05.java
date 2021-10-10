import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < input.length - 1; i++) {
            boolean isBigger = true;
            int currentNum = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int topInteger = input[j];
                if (currentNum <= topInteger) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.println(input[input.length-1]);
    }
}

