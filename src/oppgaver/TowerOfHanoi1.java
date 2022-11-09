package oppgaver;/* DATS2300 - AlgDat - kode eksempler fra pensum og forelesninger */

public class TowerOfHanoi1 {

    public static void main(String[] args) {
        towerOfHanoi(3);
    }

    /**
     * Lag en funksjon som kjører "tower of hanoi"
     * ved hjelp av rekursive kall
     * @param num_pieces Antall brikker å bruke i spillet
     */
    public static void towerOfHanoi(int num_pieces) {
        hanoiMove(num_pieces, 'A', 'C', 'B');
    }

    /**
     * Utfør et rekursivt flytt i "Tower of hanoi"
     * @param piece_number Brikken vi skal flytte på nå.
     * @param from Stikken vi flytter fra => "A"
     * @param to Stikken vi flytter til => "C"
     * @param helper Hjelpestikken => "B"
     */
    public static void hanoiMove(int piece_number, char from, char to, char helper) {
        if (piece_number == 0) { return; }                                           //Vi slutter rekursjon når vi har kommet til øverste brikke
        hanoiMove(piece_number-1, from, helper, to);                     //Punkt 1: Flytt alt fra stikke C over til stikke B // Bruk stikke A som hjelpestikke
        System.out.println("Flytter " + piece_number + " " + from + "-" + to);      //Punkt 2: Flytt øverste brikke fra A til C // Trenger ingen hjelpestikke => flytter bare en brikke
        hanoiMove(piece_number-1, helper, to, from);                     //Punkt 3: Flytt alt på stikke B (fra punkt 1) over på stikke C // Bruk stikke A som hjelpestikke
    }
}

/**
 * How many disks? :  3
 *    ┌┐      ┌┐      ╔╗
 *   ████     ││      ║║
 *  ██████    ││      ║║
 * ████████   ││      ║║
 * ───┴┴──────┴┴──────╨╨───
 * ─SOURCE──HELPER──TARGET─
 * Base case. Solve this directly.
 *    ┌┐      ┌┐      ┌┐
 *    ││      ││      ││
 *  ██████    ││      ││
 * ████████   ││     ████
 * ───┴┴──────┴┴──────┴┴───
 * ────────────────────────
 * Step 2: ok, 1 disks have been moved to helper. Now I'm able to move one to target.
 * move ( 1 pieces , source : 1 , helper : 3 , target : 2 )
 *    ┌┐      ╔╗      ┌┐
 *    ││      ║║      ││
 *  ██████    ║║      ││
 * ████████   ║║     ████
 * ───┴┴──────╨╨──────┴┴───
 * ─SOURCE──TARGET──HELPER─
 * Base case. Solve this directly.
 *    ┌┐      ┌┐      ┌┐
 *    ││      ││      ││
 *    ││      ││      ││
 * ████████ ██████   ████
 * ───┴┴──────┴┴──────┴┴───
 * ────────────────────────
 * Step 3: finally have to move 1 disks from the helper to the final target. Second recursion:
 * move ( 1 pieces , source : 3 , helper : 1 , target : 2 )
 *
 * @author damiano
 */