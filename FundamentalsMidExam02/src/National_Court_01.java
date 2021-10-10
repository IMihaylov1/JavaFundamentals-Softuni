import java.util.Scanner;

public class National_Court_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int peoplePerHour = firstEmployee + secondEmployee + thirdEmployee;

        int timeNeeded = 0;
        int days = 0;

        while (peopleCount > 0) {
            peopleCount -= peoplePerHour;
            timeNeeded++;
            if (timeNeeded % 4 == 0 && timeNeeded != 0) {
                timeNeeded++;
                if (timeNeeded >= 24) {
                    days++;
                    timeNeeded = timeNeeded - 24;
                }
            }
        }
        System.out.printf("Time needed: %dh.", days * 24 + timeNeeded);

    }

}
