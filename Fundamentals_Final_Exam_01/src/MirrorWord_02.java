
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWord_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> equalStrings = new LinkedHashMap<>();
        int count = 0;
        boolean check = false;

        String input = scanner.nextLine();
        Pattern patt = Pattern.compile("(@|#)(?<first>[A-Za-z]{3,})(\\1)(\\1)(?<second>[A-Za-z]{3,})(\\1)");
        Matcher mat = patt.matcher(input);

        while (mat.find()){
            check = true;
            count++;
            String first = mat.group("first");
            String second = mat.group("second");
            StringBuilder temp1 = new StringBuilder(second);
            String reversedSecond = temp1.reverse().toString();
            if (reversedSecond.equals(first)){
                equalStrings.put(first, second);
            }
        }
        if (equalStrings.isEmpty()){
            if (check) {
                System.out.println(String.format("%d word pairs found!", count));
            }else {

                System.out.println("No word pairs found!");

            }
        }else{
            System.out.println(String.format("%d word pairs found!", count));
            System.out.println("The mirror words are:");
            int[] counter = {1};
            equalStrings
                    .entrySet()
                    .forEach(f -> {
                        System.out.print(String.format("%s <=> %s", f.getKey(), f.getValue()));
                        if (counter[0] < equalStrings.size()){
                            System.out.print(", ");
                        }
                        counter[0]++;
                    });
            return;
        }
        System.out.println("No mirror words!");
    }

}
