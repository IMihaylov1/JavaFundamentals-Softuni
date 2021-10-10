import java.sql.Struct;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
//        REGEX За Тези Изисквания
//     -	It starts with a group of  symbols and ends with the same symbols (the same length)
//-	There is a greater than sign (>) after the first group and a less than sign (<) before the last one
//-	In between the greater than sign and the less than sign there are four groups (each of three characters), separated by pipe ("|")
//-	The first group consists only of numbers
//-	The second group – only lower case letters
//-	The third one – only upper case letters
//-	The fourth one – all symbols except '<' and '>'
//              ПРИМЕРИ КОЙТО СА ВАЛИДНИ!!!
//        ##>123|yes|YES|!!!<##
//        aa>111|mqu|BAU|mqu<aa
//        o>088|abc|AAA|***<o
//        $$$>312|dfe|KFE|@!#<$$$

        String regex = "^(.+)>(?<num>\\d{3})\\|(?<letLow>[a-z]{3})\\|(?<letUpp>[A-Z]{3})\\|(?<symb>[^<>]{3})<\\1$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String num = matcher.group("num");
                String letLow = matcher.group("letLow");
                String letUpp = matcher.group("letUpp");
                String symb = matcher.group("symb");
                String password = num+letLow+letUpp+symb;
                System.out.printf("Password: %s%n",password);
            }else {
                System.out.println("Try another password!");
            }
        }

    }
}
