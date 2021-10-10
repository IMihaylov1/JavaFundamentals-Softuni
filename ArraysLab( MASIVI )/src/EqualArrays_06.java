
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] firstArray = scan.nextLine().split(" ");
        int[] numberFirst = new int[firstArray.length];

        String[] secondArray = scan.nextLine().split(" ");
        int[] numberSecond = new int[secondArray.length];

        int sumFirst = 0;
        int different = 0;
        int position = 0;

        for (int i = 0; i < firstArray.length; i++) {
            numberFirst[i] = Integer.parseInt(firstArray[i]);
            numberSecond[i] = Integer.parseInt(secondArray[i]);
            if (numberFirst[i] != numberSecond[i]){
                different++;
                position = i;
                break;
            }
            sumFirst += numberFirst[i];
        }

        if (different == 0){
            System.out.printf("Arrays are identical. Sum: %d",sumFirst);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",position);
        }
    }
}
