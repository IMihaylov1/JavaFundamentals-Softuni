import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <=n; i++) {
            printTriangle(1, i);
        }
        for (int i = n-1; i >=1 ; i--) {
            printTriangle(1,i);
        }
    }
    public static void printTriangle(int n, int b) {

        for (int i = n; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
