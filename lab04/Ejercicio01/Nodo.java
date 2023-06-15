// NODO DE LISTA ENLAZADA
package Ejercicio01;

public class Nodo<T> {
    // Atributos de Nodo
    private T dato;
    private Nodo<T> next;
    // Constructores
    public Nodo(T dato){
        this(dato,null);
    }
    public Nodo(T dato, Nodo<T> next){
        this.dato = dato;
        this.next = next;
    }
    // Getters y Setters de los atributos
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    // Metodo toString: devuelve el toString del dato
    @Override
    public String toString(){
        return this.dato.toString();
    }
}
