//Clase linkedList
package Ejercicio01;

public class LinkedList<T> {
    // Atributos de la clase generica LinkedList
    private Nodo<T> raiz;
    private int size;
    //Constructor
    public LinkedList(){
        this.raiz = null;
        this.size = 0;
    }
    // Metodo size: devuelve la longitud del LinkedList
    public int size() {
	return this.size;
    }
    // Metodo isEmpty: indica si la lista enlazada esta vacia
    public boolean isEmpty() {
        return this.size == 0;
    }
    // Metodo get: devuelve el nodo del indice indicado
    public Nodo<T> get(int indice){
        Nodo<T> aux = this.raiz;
        for(int i = 0; i < indice ; i ++){
            aux = aux.getNext();
        }
        return aux;
    }
    // Metodo add: agrega un nuevo elemento al final de la lista enlazada
    public void add(T dato){
        if(this.size == 0){
            this.raiz = new Nodo<T>(dato);
            this.size ++;
        }else{
            this.get(this.size()-1).setNext(new Nodo<T>(dato));
            this.size++;
        }
    }
    // Metodo remove: desenlaza al nodo del indice indicado
    public void remove(int indice) {
        if (indice < this.size) {
            if(indice == 0){
                this.raiz = this.raiz.getNext();
            }else{
                this.get(indice-1).setNext(this.get(indice+1));
            }
            this.size--;
        }
    }
    // Metodo toString: devuelve un String con los elementos de la lista enlazada 
    //separada por ,
    @Override
    public String toString() {
        String str = "";
        for(Nodo<T> aux = this.raiz; aux != null; aux = aux.getNext())
            str += aux.toString() + ", ";
        return str;
    }
}
