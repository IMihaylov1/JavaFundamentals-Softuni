import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLecture = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double totalBonusPerPerson = 0;
        int maximumLecture = 0;
        double maxBonus = 0;


        if (countOfStudents == 0 || countOfLecture == 0) {
            System.out.printf("Max Bonus: %.0f.", maxBonus);
            System.out.println();
            System.out.printf("The student has attended %d lectures.", maximumLecture);
            return;
        }

        for (int i = 1; i <= countOfStudents; i++) {
            int attendancesOfEachStudent = Integer.parseInt(scanner.nextLine());

            totalBonusPerPerson = 1.0 * attendancesOfEachStudent / countOfLecture * (5 + initialBonus);
            if (totalBonusPerPerson > maxBonus) {
                maxBonus = totalBonusPerPerson;
                maximumLecture = attendancesOfEachStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.", Math.ceil(maxBonus));
        System.out.println();
        System.out.printf("The student has attended %d lectures.", maximumLecture);
    }
}
