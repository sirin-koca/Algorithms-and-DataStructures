package mix_oppgaver;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CopyString {
    public static void main(String[] args) {
        String[] a = {"Hello", "World", "this", "is", "Sirin"};
        copytxt(a);
    }

    public static String[] copytxt(String[] a){
        String[] b = new String[a.length];

        if(a.length < 1)
            throw new NoSuchElementException("The list is empthy!");

        for (int i = 0, j= 0; i < a.length; i++, j++) {
            b[j] = a[i];
        }
        System.out.println("List B is an exact copy of list A and consists of these words:");
        System.out.println(Arrays.toString(b));
        return b;
    }
}
