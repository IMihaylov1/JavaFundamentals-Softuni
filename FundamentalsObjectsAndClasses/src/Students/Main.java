package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String currentFirstName = tokens[0];
            String currentLastName = tokens[1];
            double currentGrade = Double.parseDouble(tokens[2]);

            Student student = new Student(currentFirstName, currentLastName, currentGrade);
            list.add(student);
        }
        list.stream()
                .sorted((s1,s2)->Double.compare(s2.getGrade(),s1.getGrade()))
                .forEach(s->System.out.println(s));
    }
}
