import java.util.Scanner;

public class PascalTriangle_MoreExercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Принтирайте 1 и на всеки следващ ред сумата от предходния ред и накрая пак последното число
        //Вход:    6
        //1
        //1 1
        //1 2 1
        //1 3 3 1
//Обяснение за следващия ред: 1 -> 1+3-> 3+3-> 3+1 и накрая 1
        //                    1     4     6     4       1
        //1 5 10 10 5 1
        int n = Integer.parseInt(scanner.nextLine());
        int number ;
        for (int i = 0; i < n; i++) {
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
