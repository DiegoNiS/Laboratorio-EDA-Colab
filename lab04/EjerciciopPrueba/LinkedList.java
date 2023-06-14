package lab04eda.d;

public class LinkedList<T> {
    private Node<T> raiz;
    private int tamano;
    
    public LinkedList() {
        raiz = null;
        tamano = 0;
    }
    
    public void add(T dato) {
        Node<T> nuevoNodo = new Node<>(dato);
        
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Node<T> ultimo = getUltimo();
            ultimo.setNextNode(nuevoNodo);
        }
        
        tamano++;
    }
    
    public Node<T> get(int indice) {
        Node<T> aux = raiz;
        for (int i = 0; i < indice; i++) {
            aux = aux.getNextNode();
        }
        return aux;
    }
    
    public void remove(int indice) {
        if (indice < tamano) {
            if (indice == 0) {
                raiz = raiz.getNextNode();
            } else {
                Node<T> anterior = get(indice - 1);
                anterior.setNextNode(get(indice + 1));
            }
            tamano--;
        }
    }
    
    public int size() {
        return tamano;
    }
    
    private Node<T> getUltimo() {
        Node<T> aux = raiz;
        while (aux.getNextNode() != null) {
            aux = aux.getNextNode();
        }
        return aux;
    }
}

