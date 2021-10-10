import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean passwordIsCorrect = passwordIsValid(password);
        if(passwordIsCorrect){
            System.out.println("Password is valid");
        }
    }

    public static boolean passwordIsValid(String password) {
        boolean isEnough = isValidLength(password);
        boolean containsLettersAndDigits = isContainsLettersAndDigit(password);
        boolean haveAtLeastTwoDigits = haveAtLeastTwoDigits(password);
        boolean isValid = isEnough && containsLettersAndDigits && haveAtLeastTwoDigits;
        return isValid;
    }

    public static boolean isValidLength(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean isContainsLettersAndDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }

        }
        return true;
    }

    public static boolean haveAtLeastTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        if (count == 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }

    }
}
