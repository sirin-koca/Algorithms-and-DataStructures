package kapittel1.oppgaver;

/* Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere
posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til den minste og m2
til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2};
Hvor mange sammenligninger bruker metoden din?
How do you find the maximum of an array in algorithm?
Program to find largest element in an Array - GeeksforGeeks
Algorithm:
Step 1: Create a local variable max and initiate it to arr[0] to store the maximum among the list.
Step 2: Initiate an integer i = 0 and repeat steps 3 to 5 till i reaches the end of the array.
Step 3: Compare arr[i] with max.
Step 4: If arr[i] > max, update max = arr[i].
Step 5: Increment i once.
*/

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinMaks {
    public static int[] minmaks(int[] a)
    {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        // int[] b = new int[]{mi, ma};  // hvis vi deklarerer b[] arrayet her , blir innholde bare 0,0 siden mi=0 og ma=0

        for (int i = 1; i < a.length; i++)
        {
            verdi = a[i];

            if (verdi > maksverdi) { maksverdi = verdi; ma = i;}
            else if (verdi < minverdi) {minverdi = verdi; mi = i;}
        }

        return new int[]{mi,ma};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(minmaks(a)));
    }
}
