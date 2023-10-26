package mix_oppgaver;

import java.util.ArrayList;
import java.util.Collections;

public class FruitsArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Apple");
        words.add("Cherry");
        Collections.sort(words);
        System.out.println(words);  // Output: [Apple, Banana, Cherry]
    }
}
