import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int numbers : number) {
            if (numbers % 2 == 0) {
                evenSum += numbers;
            } else {
                oddSum += numbers;
            }
        }

//        String[] numbers = scanner.nextLine().split(" ");
//        int[] number = new int[numbers.length];

//        for (int i = 0; i < number.length; i++) {
//            number[i] = Integer.parseInt(number[i]);
//
//            if (number[i] % 2 == 0) {
//                evenSum += number[i];
//            }else {
//                oddSum += number[i];
//            }
//        }

        System.out.println(evenSum - oddSum);
    }
}
