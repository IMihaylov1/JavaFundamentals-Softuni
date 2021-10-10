package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<People> list = new ArrayList<>();
        while (!command.equals("End")){
            String [] tokens = command.split("\\s+");
            String curName = tokens[0];
            int curId =Integer.parseInt(tokens[1]);
            int curAge = Integer.parseInt(tokens[2]);

            People  people = new People(curName,curId,curAge);
            list.add(people);

            command=scanner.nextLine();
        }
        list.stream()
                .sorted((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()))
                .forEach(p->System.out.printf("%s with ID: %d is %d years old.%n",p.getName(),p.getId(),p.getAge()));
    }
}
