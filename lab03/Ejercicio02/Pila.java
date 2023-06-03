import Exceptions.ExceptionIsEmpty;
// Clase generica Pila
public class Pila <T>{
    private Node<T> tope;
    //Constructor
    public Pila(){
        this.tope = null;
    }
    //Metodo isEmpty: indica si la pila esta vacia
    public boolean isEmpty() {
        return tope==null;
    }
    //Metodo push: inserta un elemento al final de la pila
    public void push(T x) {
        this.tope= new Node<T>(x, this.tope);
    }
    //Metodo peek: (top), devuelve el dato del ultimo elemento
    public T peek() throws ExceptionIsEmpty{
        if(isEmpty())
            throw new ExceptionIsEmpty("La pila esta Vacia");
        return this.tope.getDato();
    }
    /*Metodo pop: excepcion IsEmpty, o desconecta al ultimo de lista y devuelve 
    su dato*/
    public T pop() throws ExceptionIsEmpty{
        if(isEmpty())
            throw new ExceptionIsEmpty("La pila no tiene elementos");
        Node<T> aux = this.tope;
        this.tope = this.tope.getNext();
        return aux.getDato();
    }
    /*Metodo search: devuelde -1 si no encuentra el elemento, o  la cantidad de 
    elementos que faltan desde el tope, es utiliza un for para recorrer*/
    public int search(T x){
        int cont = 1;
        for(Node<T> a = this.tope; a!= null; a = a.getNext()){
            if(a.getDato() == x)
                return cont;
            cont++;
        }
        return -1;
    }
    //Metodo toString: recorrera con un for los nodos y los devuelve en un String
    @Override
    public String toString(){
        String cad = "";
        for(Node<T> ax = this.tope; ax != null; ax = ax.getNext()){
            cad += ax+", ";
        }
        return cad;
    }
}
