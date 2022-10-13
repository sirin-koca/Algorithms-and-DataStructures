package uke36_søking_og_sortering;

import java.util.Arrays;
import java.util.OptionalInt;

public class IntStream {
    public class Program {
        public static void main(String ... args)
        {
            int[] a = {8,3,5,7,9,6,10,2,1,4};  // en heltallstabell
            java.util.stream.IntStream s = Arrays.stream(a);    // fra int-tabell til IntStream

            OptionalInt resultat = s.max();    // kaller max-metoden

            if (resultat.isPresent()) System.out.println(resultat.getAsInt());
            else System.out.println("Ingen verdi!");
        }
    }

}
