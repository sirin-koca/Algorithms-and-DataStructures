package oppgaver;/* DATS2300 - AlgDat - kode eksempler fra pensum og forelesninger */

public class TowerOfHanoi2 {

    public static void main(String[] args){

        System.out.println("Tower of Hanoi!");
        towerOfHanoi('A', 'B', 'C', 3);
    }

    public static void towerOfHanoi(char a, char b, char c, int brikkeantall){

        // Basistilfelle
        if (brikkeantall == 0) return;
        // Flytt alle unntatt nederste fra a til b
        towerOfHanoi(a, c, b, brikkeantall-1);
        // Flytt nederste fra a til c
        System.out.println("Flytter brikke " + brikkeantall +
                " fra " + a + " til " + c);
        // Flytt alle fra b til a
        towerOfHanoi(b, a, c, brikkeantall-1);

    }

}