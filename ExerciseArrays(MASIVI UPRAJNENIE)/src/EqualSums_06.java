
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//   Вход:     1 2 3 3
//   Изход:       2---това е каутъра за колко пъти сумата от ляво съответства на другата от дясно.
//            1 2                 3
//   left sum = 3,     right sum = 3
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean flag = false;
        int divider = 0;

        for (int i = 0; i < input.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += input[j];
            }
            for (int k = i + 1; k < input.length; k++) {
                rightSum += input[k];
            }
            if (leftSum == rightSum) {
                flag = true;
                divider = i;

                break;
            }
        }
        if (flag) {
            System.out.println(divider);
        } else {
            System.out.println("no");
        }
    }
}
