

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] num = new int[n];
                    // ПРИМЕР //
        //Input	                                Output
        //3 -Дължина на масива
        //13-Число1
        //24-Число2            Съмите числа    13 24 8
        //8	-Число3            Сумата от числата: 45

        for (int i = 0; i < n; i++) {
            String number = scanner.nextLine();
            num[i] = Integer.parseInt(String.valueOf(number));
            sum += num[i];
        }
        for (int value : num) {                // ----------> ЧЕТЕНЕ НА МАСИВ ОТ ИНТ И ПРИНТИРАНЕ НА СТОЙНОСТИТЕ МУ!
            System.out.print(value + " ");
        }                                         //  <-----------
        System.out.println();
        System.out.println(sum);
    }
}
