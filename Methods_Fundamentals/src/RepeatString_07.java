import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldString = scanner.nextLine();
        int numbersRepeat = scanner.nextInt();
        repeatStringNTimes(oldString,numbersRepeat);
    }

    public static void repeatStringNTimes(String oldString, int numbersRepeat) {

        for (int i = 1; i <= numbersRepeat; i++) {
            System.out.print(oldString);
        }

    }
}
