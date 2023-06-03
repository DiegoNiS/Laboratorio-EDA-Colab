// Clase generica Pila
public class Pila <T> implements Stack<T>{
    private Node<T> tope;
    public Pila(){
        this.tope = null;
    }
    @Override //isEmpty: para verificar si la pila esta vacia
    public boolean isEmpty() {
        return tope==null;
    }
    @Override //push: para insertar un elemento en el final
    public void push(T x) {
        this.tope = new Node<T>(x, this.tope);
    }
    @Override
    public T top() {
        //sentencias
        return tope.getDato();//Provicional
    }
    @Override
    public T pop(T x) {
        //sentencias
        return tope.getDato();//Provisional
    }
    @Override
    public String toString(){
        String cad = "";
        for(Node<T> ax = this.tope; ax != null; ax = ax.getNext()){
            cad += ax+", ";
        }
        return cad;
    }
}
