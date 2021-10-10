
import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//                СРАВНЯВАНЕ НА 2 РЕДА СТРИНГОВЕ ОТ МАСИВИ  И ПРИНТИРАНЕ НА ТАКИВА ЕДНАКВИТЕ!
//         Вход 1:         Hey hello 2 4
//         Вход 2:         10 hey 4 hello
//         РЕЗУЛТАТ:       4 hello

        String[] firstLine = scanner.nextLine().split(" ");  // 10 20 30
        String[] secondLine = scanner.nextLine().split(" ");  // 10 20 30

        for (String word : secondLine) {
            for (String secondWord : firstLine) {
                if (word.equals(secondWord)) {
                    System.out.print(word + " ");
                }
            }
        }
    }
}