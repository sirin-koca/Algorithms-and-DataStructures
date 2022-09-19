import java.util.OptionalInt;
// krever import java.util.OptionalInt;
/**
 * makstest() tester om maks-metoden kaster et unntak for en tom tabell og om unntaket er av rett type. Dette vil
 * stemme for den versjonen av maks-metoden som er gitt i Programkode 1.1.2, men ikke for de to versjonene i
 * Programkode 1.1.4 og Programkode 1.1.5. Se Oppgave 1 - 3. Det er imidlertid mange situasjoner der det ikke er
 * gunstig å kaste et unntak for en tom tabell. En mulighet er da å signalisere dette ved hjelp av en bestemt returverdi.
 * I maks-metoden kunne vi f.eks. vi bruke -1 (eller en annen negativ verdi) siden -1 ikke kan være en tabellindeks.
 * Men hvis vi har en maks-metode som gir oss den største verdien (dvs. verdien og ikke posisjonen), kan ikke -1 brukes.
 * Hvis tabellen a inneholder negative verdier, vil vi da ikke kunne vite om -1 er den største av dem eller
 * om -1 signaliserer en «feil».

 * Vi kan løse dette problemet ved å la metoden returnere et objekt. Det skal inneholde korrekt resultat hvis alt
 * fungerer som normalt, men ingenting hvis det oppstår en feil. Vi kan lage en egen klasse for dette, men det er
 * unødvendig siden det allerede finnes en slik klasse i Java. Det er OptionalInt. Det engelske ordet optional kan
 * oversettes med valgfri eller frivillig. Her er imidlertid OptionalInt «a container object which may or may not
 * contain an int value». Klassen har ingen offentlig konstruktør, men derimot to konstruksjonsmetoder, dvs.
 * to statiske metoder som begge returnerer en instans av klassen. Flg. metode finner indeks til største verdi i
 * en tabell og bruker en OptionalInt som returverdi (se også Avsnitt 1.1.11):
 */

public class OptionalIntMethod {
    public static void main(String[] args) {
        int[] a = {8, 3, 5, 7, 9, 6, 10, 2, 1, 4}, b = {};  // to tabeller

        System.out.println(maksOptional(a));       // utskrift: OptionalInt[6]
        System.out.println(maksOptional(b));       // utskrift: OptionalInt.empty
    } // main end

    // krever import java.util.OptionalInt;

    public static OptionalInt maksOptional(int[] a) {           // indeks til største verdi
        if (a.length < 1) {
            return OptionalInt.empty(); // en konstruksjonsmetode
        }

        int m = 0, maksverdi = a[0];                    // startindeks og verdi

        for (int i = 1; i < a.length; i++) {            // starter med i = 1
            if (a[i] > maksverdi) {
                m = i;
                maksverdi = a[i];                    // oppdaterer
            }
        }

        return OptionalInt.of(m);                       // en konstruksjonsmetode
    }
}