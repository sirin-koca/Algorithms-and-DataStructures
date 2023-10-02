package string_manipulation;

import java.util.regex.*;

public class RegexExample1 {
    public static void main(String[] args) {
        String pattern = "hello";
        String text = "hello";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        if (matcher.matches()) {
            System.out.println("The text matches the pattern!");
        } else {
            System.out.println("The text does not match the pattern.");
        }
    }
}

