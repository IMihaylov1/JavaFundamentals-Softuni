package Articles_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Articles> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String currentTittle = tokens[0];
            String currentContent = tokens[1];
            String currentAuthor = tokens[2];
            Articles articles = new Articles(currentTittle, currentContent, currentAuthor);
            list.add(articles);
        }
        String command = scanner.nextLine();

        switch (command) {
            case "title":

                list.stream()
                        .sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()))
                        .forEach(a -> System.out.println(a));
                break;
            case "content":
                list.stream()
                        .sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent()))
                        .forEach(a -> System.out.println(a));
                break;
            case "author":
                list.stream()
                        .sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(a -> System.out.println(a));
                break;
        }
    }
}
