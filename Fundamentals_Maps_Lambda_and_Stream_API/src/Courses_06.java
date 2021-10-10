import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> courses = new LinkedHashMap<>();
        while (!command.equals("end")) {

            String[] tokens = command.split(" : ");
            String courseName = tokens[0];
            String personName = tokens[1];
            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(personName);
            } else {
                courses.get(courseName).add(personName);
            }
            command = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((k, k2) -> {
                    int first = k.getValue().size();
                    int second = k2.getValue().size();
                    return Integer.compare(second, first);
                })
                .forEach(k -> {
                            System.out.println(String.format("%s: %s",
                                    k.getKey(),
                                    k.getValue().size()));
                            k.getValue()
                                    .stream()
                                    .sorted((s1, s2) -> s1.compareTo(s2))
                                    .forEach(s -> System.out.println(String.format("-- %s", s)));
                        }
                );
    }

}
