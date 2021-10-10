import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//                       ПРИМЕР
//                              Вход        Изход:
//    Брой четене на редове:     2          80 19
//    Първи ред числа:          80 23       23 31
//    Втори ред числа:          31 19

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstLine = new String[n];
        String[] secondLine = new String[n];

        for (int i = 0; i < n; i++) {
            String[] number = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstLine[i] = number[0];
                secondLine[i] = number[1];
            } else {
                firstLine[i] = number[1];
                secondLine[i] = number[0];
            }
        }
        System.out.println(String.join(" ",firstLine));
        System.out.println(String.join(" ",secondLine));


//        for (String first : firstLine) {
//            System.out.print(first + " ");
//        }
//        System.out.println();
//        for (String second : secondLine) {
//            System.out.print(second + " ");
//        }
    }
}
