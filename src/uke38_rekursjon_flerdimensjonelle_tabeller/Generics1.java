package uke38_rekursjon_flerdimensjonelle_tabeller;

public class Generics1 {

    public static void main(String[] args) {

        Integer [] v = {10,12,13,45,11};
        System.out.println(max(v));

        Character [] ch = {'a', 'n','q', 'x', 'ø'};
        System.out.println(max(ch));

        String[] s = {"Algdat", "er ", "kjempegøy"};

        System.out.println(max(s));

        Pokemon[] pokemons={
                new Pokemon("Blastoise", 10, 100),
                new Pokemon("Pikachu", 100, 10000)
        };
        for(Pokemon p: pokemons) System.out.println(p);
    }
    public static int simpleIntervalCheck (int x){
        //return if x < 0 and 1 if x >= 0
        int out = 0;
        if( x < -5) out --;
        else if (x > 5) out ++;
        return out;
    }
    public static int ternaryIntervalCheck(int x){
        return (x < -5) ? -1 :(x > 5) ? 1 : 0;
    }

    public static int maxint( int []x ){
        int max = 0;
        int maxValue = x[max];
        for (int j = 1; j < x.length; j++) {
            //legg til en if -setning som sjekker om det er flere like tall, hvis det er flere like tall, så skipper den over den første om sammenligner med den siste
            if (x[j] > x[max]) max = j;
        }
        return max + maxValue;
    }
    public static int maxchar( char []x ){
        int max = 0;
        char maxValue = x[max];
        for (int j = 1; j < x.length; j++) {
            //legg til en if -setning som sjekker om det er flere like tall, hvis det er flere like tall, så skipper den over den første om sammenligner med den siste
            if (x[j] > x[max]) max = j;
        }
        return max + maxValue;
    }

    public static <T extends Comparable <? super T>> int max( T[]x ){
        int max = 0;
        T maxValue = x[max];
        for (int j = 1; j < x.length; j++) {
            //legg til en if -setning som sjekker om det er flere like tall, hvis det er flere like tall, så skipper den over den første om sammenligner med den siste
            if (x[j].compareTo(x[max])> 0) max = j;
        }
        return max;
    }
}

