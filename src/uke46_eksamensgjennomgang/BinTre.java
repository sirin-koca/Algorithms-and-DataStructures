package uke46_eksamensgjennomgang;

public class BinTre<T> {    // et generisk binærtre
    private static final class Node<T> {    // en indre nodeklasse
        private T verdi;            // nodens verdi
        private Node<T> venstre;    // referanse til venstre barn/subtre
        private Node<T> høyre;      // referanse til høyre barn/subtre

        private Node(T verdi, Node<T> v, Node<T> h) {   // konstruktør
            this.verdi = verdi; venstre = v; høyre = h;
        }

        private Node(T verdi) { this.verdi = verdi; }   // konstruktør

    } // end of class Node<T>

    private Node<T> rot;      // referanse til rotnoden
    private int antall;       // antall noder i treet

    public BinTre() { rot = null; antall = 0; }          // konstruktør

    public final void leggInn(int posisjon, T verdi) {

    }  // kode utelatt

    public int antall() { return antall; }               // returnerer antallet

    public boolean tom() { return antall == 0; }         // tomt tre?

} // end of class BinTre<T>