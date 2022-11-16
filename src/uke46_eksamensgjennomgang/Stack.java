package uke46_eksamensgjennomgang;

public interface Stack<T> {          // eng: Stack
    public void leggInn(T verdi);    // eng: push
    public T kikk();                 // eng: peek
    public T taUt();                 // eng: pop
    public int antall();             // eng: size
    public boolean tom();            // eng: isEmpty
    public void nullstill();         // eng: clear

} // interface Stakk

