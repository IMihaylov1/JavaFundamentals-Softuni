package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String currentName = tokens[0];
            int currentAge = Integer.parseInt(tokens[1]);
            Person person = new Person(currentName, currentAge);
                people.add(person);

        }
        people.stream().filter(person -> person.getAge()>30)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(person -> System.out.println(person.getName() + " - "+person.getAge()));

    }
}
