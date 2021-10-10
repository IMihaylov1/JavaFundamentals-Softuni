import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> students = new ArrayList<>();
        while (!command.equals("end")) {
            String[] parts = command.split(" ");
            String name = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String town = parts[3];

            Student student = new Student(name, lastName, age, town);
            students.add(student);

            command = scanner.nextLine();
        }
        String town = scanner.nextLine();
        for (Student student : students) {
            if (student.getTown().equals(town)) {
                System.out.printf("%s %s is %d year old%n", student.getName(), student.getLastName(), student.getAge());
            }
        }

    }
}
