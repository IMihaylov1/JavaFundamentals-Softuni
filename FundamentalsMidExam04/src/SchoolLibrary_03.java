import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] list = scanner.nextLine().split("&");
        List<String> shelfBook = new ArrayList<>(Arrays.asList(list));

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            String[] parts = command.split(" \\| ");
            String comm = parts[0];

            switch (comm) {
                case "Add Book": {
                    String bookName = parts[1];
                    if (!shelfBook.contains(bookName)) {
                        shelfBook.add(0, bookName);
                    }
                }
                break;
                case "Take Book": {
                    String bookName = parts[1];
                    if (shelfBook.contains(bookName)) {
                        shelfBook.remove(bookName);
                    }
                }
                break;
                case "Swap Books": {
                    String bookName1 = parts[1];
                    String bookName2 = parts[2];
                    if (shelfBook.contains(bookName1) && shelfBook.contains(bookName2)) {
                        int index1 = shelfBook.indexOf(bookName1);
                        int index2 = shelfBook.indexOf(bookName2);
                        shelfBook.set(index1, bookName2);
                        shelfBook.set(index2, bookName1);
                    }
                }
                break;
                case "Insert Book": {
                    String bookName = parts[1];
                    shelfBook.add(bookName);
                }
                break;
                case "Check Book": {
                    int index = Integer.parseInt(parts[1]);
                    if (index >= 0 && index < shelfBook.size()) {
                        String currentBook = shelfBook.get(index);
                        System.out.println(currentBook);
                    }
                }
                break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < shelfBook.size(); i++) {
            if ((i) == (shelfBook.size() - 1)) {
                System.out.print(shelfBook.get(i));
            } else {
                System.out.print(shelfBook.get(i)+ ", ");
            }
        }

    }
}
