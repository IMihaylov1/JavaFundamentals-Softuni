import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        TreeMap<String, List<String>> companyUsers = new TreeMap<>();
        while (!command.equals("End")) {

            String[] tokens = command.split("\\s+->\\s+");

            String name = tokens[0];
            String id = tokens[1];

            if (!companyUsers.containsKey(name)) {
                companyUsers.put(name, new ArrayList<>());

            }

            if (!companyUsers.get(name).contains(id)) {
                companyUsers.get(name).add(id);
            }
            command = scanner.nextLine();
        }
        for (String s : companyUsers.keySet()) {
            System.out.printf("%s\n", s);
            for (int i = 0; i < companyUsers.get(s).size(); i++) {
                System.out.printf("-- %s\n", companyUsers.get(s).get(i));
            }
        }
    }
}
