package string_manipulation;

public class RegexExample4 {
    public static void main(String[] args) {
        String text = "The cat sat on the cat mat.";
        String replacedText = text.replaceAll("cat", "dog");
        System.out.println(replacedText);  // "The dog sat on the dog mat."
    }
}
