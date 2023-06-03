// Clase Node (Nodo)
public class Node <T>{
    private T dato;
    private Node<T> next;
    //Constructores
    public Node(T dato, Node<T> next){
        this.dato = dato;
        this.next = next;
    }
    public Node(T dato){
        this(dato,null);
    }
    //getters y setters
    public T getDato(){
        return this.dato;
    }
    public void setDato(T dato){
        this.dato = dato;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    //Metodo toString: devuelve en String, el dato del nodo
    @Override
    public String toString(){
        return this.dato.toString();
    }
}
