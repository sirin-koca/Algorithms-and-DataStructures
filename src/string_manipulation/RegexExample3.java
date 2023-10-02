package string_manipulation;

import java.util.regex.*;

public class RegexExample3 {
    public static void main(String[] args) {
        String text = "There are 100 apples and 20 oranges.";
        String pattern = "\\d+";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        // This will print:
        // 100
        // 20
    }
}
