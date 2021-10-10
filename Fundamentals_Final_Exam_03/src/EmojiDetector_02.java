import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> emoji = new ArrayList<>();
        BigDecimal coolT = new BigDecimal(1);
        String regex = "([:]{2}|[*]{2})(?<emojy>[A-Z][a-z]{2,})(\\1)";
        Pattern patternText = Pattern.compile(regex);
        Pattern patternNum = Pattern.compile("(?<num>\\d)");
        Matcher matcher = patternText.matcher(text);
        Matcher matcherNum = patternNum.matcher(text);

        while (matcherNum.find()) {
            int currentNum = Integer.parseInt(matcherNum.group("num"));
            coolT = coolT.multiply(BigDecimal.valueOf(currentNum));
        }
        int emCounter = 0;
        while (matcher.find()){
            String emojy = matcher.group("emojy");
            BigDecimal coolness = new BigDecimal(0);

            Pattern letters = Pattern.compile("[A-Za-z]");
            Matcher letterMatcher = letters.matcher(emojy);

            while (letterMatcher.find()) {
                char value = letterMatcher.group(0).charAt(0);
                coolness = coolness.add(BigDecimal.valueOf(value));
            }
            if (coolness.compareTo(coolT)==0 || coolness.compareTo(coolT)==1){

                emoji.add(matcher.group(1) + matcher.group("emojy") + matcher.group(3));
            }
            emCounter++;
        }
        System.out.println("Cool threshold: " + coolT);
        System.out.println( emCounter + " emojis found in the text. The cool ones are:");
        for (String s : emoji) {
            System.out.println(s );
        }
    }
}