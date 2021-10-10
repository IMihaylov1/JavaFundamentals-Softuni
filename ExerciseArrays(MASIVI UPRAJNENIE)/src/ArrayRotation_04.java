import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" "); // 10 20
        int numberRotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numberRotation ; i++) {
            String saveFirstNumber = input[0];
            for (int j = 0; j <input.length-1 ; j++) {
                input[j]=input[j+1];
            }
            input[input.length-1] = saveFirstNumber;
        }
        System.out.println(String.join(" ",input));
    }
}
