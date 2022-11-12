package oblig2;

////////////////// class DobbeltLenketListe //////////////////////////////

        import java.util.*;

public class DobbeltLenketListe<T> implements Liste<T> {

    /*
      Node class
      @param //<T>
     */

/*
    public static void main(String[] args) {

        // Sjekk at følgende programbit gir rett utskrift (forutsetter at Oppgave 1 er ferdig):
        // Utskrift: [] [A] [A, B] [] [A] [B, A]

        String[] s1 = {}, s2 = {"A"}, s3 = {null,"A",null,"B",null};
        DobbeltLenketListe<String> l1 = new DobbeltLenketListe<>(s1);
        DobbeltLenketListe<String> l2 = new DobbeltLenketListe<>(s2);
        DobbeltLenketListe<String> l3 = new DobbeltLenketListe<>(s3);
        System.out.println(l1.toString() + " " + l2.toString()
                + " " + l3.toString() + " " + l1.omvendtString() + " "
                + l2.omvendtString() + " " + l3.omvendtString());

        //
        String[] navn = {"Lars", "Anders", "Bodil", "Kari", "Per", "Berit"};
        Liste<String> liste = new DobbeltLenketListe<>(navn);

        liste.forEach(s -> System.out.print(s + " "));
        System.out.println();
        for (String s : liste) System.out.print(s + " ");
    }

*/


    private static final class Node<T> {
        private T verdi;                   // nodens verdi
        private Node<T> forrige, neste;    // pekere

        private Node(T verdi, Node<T> forrige, Node<T> neste) {
            this.verdi = verdi;
            this.forrige = forrige;
            this.neste = neste;
        }

        private Node(T verdi) {
            this(verdi, null, null);
        }
    }

    // instansvariabler
    private Node<T> hode;          // peker til den første i listen
    private Node<T> hale;          // peker til den siste i listen
    private int antall;            // antall noder i listen
    private int endringer;         // antall endringer i listen

    public DobbeltLenketListe() {
        this.hode = null;
        this.hale = null;
        this.antall = 0;
        this.endringer = 0;
    }

    public DobbeltLenketListe(T[] a) {
        if (a == null) {
            throw new NullPointerException("Tabellen har null-objekt");
        } else if (a.length == 0) {
            return;
        }

        // T element = null;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                hode = new Node<>(a[i]);
                j = i;
                antall++;
                break;
            }
        }
        hale = hode;
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != null) {
                hale.neste = new Node<>(a[i], hale, null);
                hale = hale.neste;
                antall++;
            }
        }

    }

    public Liste<T> subliste(int fra, int til) {

        fratilKontroll(antall, fra, til);
        Liste<T> liste = new DobbeltLenketListe<>();
        int len = til - fra;
        if (len < 1) {
            return liste;
        }

        Node<T> current = finnNode(fra);

        while (len > 0) {
            liste.leggInn(current.verdi);
            current = current.neste;
            len--;
        }

        return liste;
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean tom() {
        return hode == null;
    }

    @Override
    public boolean leggInn(T verdi) {
        Objects.requireNonNull(verdi, "Verdien kan ikke være null!");
        Node myNode = new Node(verdi);
        if (this.tom()) {  // sjekk at listen er tom
            hode = myNode;  // hvis den er tom lag ny node med hode først
            hale = myNode;

        } else {
            hale.neste = myNode;  // halen peker til myNode (ny Node)
            myNode.forrige = hale;  // myNode peker til halen
            hale = hale.neste;  // halen er nå oppdatert
        }
        antall++;  // øker antallet
        endringer++;  // øker endringer
        return true;

    }

    @Override
    public void leggInn(int indeks, T verdi) {
        Objects.requireNonNull(verdi, "Verdien kan ikke være null");

        if (indeks > antall) {
            throw new IndexOutOfBoundsException("Indeks kan ikke være større enn antall noder!");
        } else if (indeks < 0) {
            throw new IndexOutOfBoundsException("Indeks kan ikke være negativ!");
        }
        Node<T> nyNode = new Node<>(verdi, null, null);
        if (indeks == 0 && antall == 0) {
            hode = hale = nyNode;
        } else if (indeks == antall) {
            hale.neste = nyNode;
            nyNode.forrige = hale;
            hale = hale.neste;
        } else if (indeks == 0) {
            nyNode.neste = hode;
            hode.forrige = nyNode;
            hode = hode.forrige;
        } else {
            nyNode = hode;

            for (int i = 0; i < indeks; i++) {
                nyNode = nyNode.neste;
            }
            nyNode = new Node<>(verdi, nyNode.forrige, nyNode);
            nyNode.neste.forrige = nyNode.forrige.neste = nyNode;
        }
        antall++;
        endringer++;

    }

    @Override
    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;
    }

    // hjelpefunksjon
    private Node<T> finnNode(int indeks) {
        indeksKontroll(indeks, false);
        Node<T> current;
        int i = 0;
        int j = antall - 1;
        if (indeks < (antall / 2)) {
            current = hode;
            while (i < indeks) {
                current = current.neste;
                i++;
            }
        } else {
            current = hale;
            while (j > indeks) {
                current = current.forrige;
                j--;
            }
        }
        return current;
    }

    // hjelpefunksjon
    private void fratilKontroll(int antall, int fra, int til) {  // sjekker om indeksene fra og til er lovlige
        if (fra < 0 || til > antall) {
            throw new IndexOutOfBoundsException();
        }
        if (fra > til) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public T hent(int indeks) {
        Node<T> current = finnNode(indeks);
        return current.verdi;
    }

    @Override
    public int indeksTil(T verdi) {
        if (verdi == null) {
            return -1;
        }
        Node<T> p = hode;
        for (int i = 0; i < antall; i++, p = p.neste) {
            if (p.verdi.equals(verdi)) return i;
        }
        return -1;
    }

    @Override
    public T oppdater(int indeks, T nyverdi) {
        Objects.requireNonNull(nyverdi);

        Node<T> current = finnNode(indeks);
        T oldVerdi = current.verdi;
        current.verdi = nyverdi;
        endringer++;

        return oldVerdi;
    }

    @Override
    public boolean fjern(T verdi) {
        if (verdi == null) {
            return false;
        }

        Node<T> current = hode;

        if (verdi.equals(current.verdi)) {
            if (current.neste != null) {
                hode = current.neste;
                hode.forrige = null;
            } else {
                hode = null;
                hale = null;
            }
            antall--;
            endringer++;
            return true;
        }

        current = hale;
        if (verdi.equals(current.verdi)) {
            hale = current.forrige;
            hale.neste = null;
            antall--;
            endringer++;
            return true;
        }
        current = hode.neste;
        for (; current != null; current = current.neste) {
            if (verdi.equals(current.verdi)) {
                current.forrige.neste = current.neste;
                current.neste.forrige = current.forrige;
                antall--;
                endringer++;
                return true;
            }
        }
        return false;
    }

    @Override
    public T fjern(int indeks) {

        indeksKontroll(indeks, false);

        Node<T> current = hode;
        T verdi;

        if (indeks == 0) {
            verdi = current.verdi;

            if (current.neste != null) {
                hode = current.neste;
                hode.forrige = null;
            } else {
                hode = null;
                hale = null;
            }
        } else if (indeks == antall - 1) {
            current = hale;
            verdi = hale.verdi;
            hale = current.forrige;
            hale.neste = null;
        } else {
            for (int i = 0; i < indeks; i++) {
                current = current.neste;
            }
            verdi = current.verdi;

            current.forrige.neste = current.neste;
            current.neste.forrige = current.forrige;
        }

        antall--;
        endringer++;
        return verdi;
    }

    @Override
    public void nullstill() {
        for (Node<T> current = hode; current != null; current = current.neste) {
            current.verdi = null;
            current.forrige = current.neste = null;
        }
        hode = hale = null;
        antall = 0;
        endringer++;
    }

    @Override
    public String toString() {
        if (hode == null) {
            return "[]";
        }
        StringBuilder ut = new StringBuilder();
        ut.append("[");
        Node current = hode;
        while (current.neste != null) {
            ut.append(current.verdi);
            ut.append(", ");
            current = current.neste;
        }
        ut.append(current.verdi);
        ut.append("]");
        return ut.toString();
    }

    public String omvendtString() {
        if (hale == null) {
            return "[]";
        }
        StringBuilder ut = new StringBuilder();
        ut.append("[");
        Node current = hale;
        while (current.forrige != null) {
            ut.append(current.verdi);
            ut.append(", ");
            current = current.forrige;
        }
        ut.append(current.verdi);
        ut.append("]");
        return ut.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new DobbeltLenketListeIterator();
    }

    public Iterator<T> iterator(int indeks) {
        indeksKontroll(indeks, false);
        return new DobbeltLenketListeIterator(indeks);
    }

    private class DobbeltLenketListeIterator implements Iterator<T> {
        private Node<T> denne;
        private final int iteratorendringer;

        private DobbeltLenketListeIterator() {
            denne = hode;     //  starter fra den første i listen
            iteratorendringer = endringer;  // teller endringer
        }

        private DobbeltLenketListeIterator(int indeks) {
            denne = finnNode(indeks);
            iteratorendringer = endringer;
        }

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Ingen verdier!");
            }
            if (iteratorendringer != endringer) {
                throw new ConcurrentModificationException("Noe gikk galt, prøv igjen!");
            }
            T temp = denne.verdi;
            denne = denne.neste;
            return temp;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    } // class DobbeltLenketListeIterator

/*
    public static <T> void sorter(Liste<T> liste, Comparator<? super T> c) {
        throw new UnsupportedOperationException();
    }
*/

} // class DobbeltLenketListe