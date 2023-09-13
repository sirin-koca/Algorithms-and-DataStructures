package kapittel1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CopyChar {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        copytxt(a);
    }
    public static char[] copytxt(char[] a){
        char[] b = new char[a.length];

        if(a.length < 1)
            throw new NoSuchElementException("The list is empthy!");

        for (int i = 0, j= b.length-1; i < a.length; i++, j--) {
            b[j] = a[i] ;
        }
        System.out.print("char[b] is: ");
        System.out.println(Arrays.toString(b));

        return b;
    }
}
