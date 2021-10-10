import java.util.Scanner;

public class EnglishNameOfTheLastDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int digits =Math.abs(number %10) ;

        if (digits == 0){
            System.out.println("zero");
        }else if (digits == 1){
            System.out.println("one");
        }else if (digits ==2){
            System.out.println("two");
        }else if (digits == 3){
            System.out.println("three");
        }else if (digits == 4){
            System.out.println("four");
        }else if (digits == 5){
            System.out.println("five");
        }else if (digits == 6){
            System.out.println("six");
        }else if (digits == 7){
            System.out.println("seven");
        }else if (digits == 8){
            System.out.println("eight");
        }else if (digits == 9){
            System.out.println("nine");
        }

    }
}
