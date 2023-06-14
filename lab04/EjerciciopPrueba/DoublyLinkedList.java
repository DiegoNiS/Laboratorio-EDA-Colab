package lab04eda.d;

public class DoublyLinkedList<E> {
    private Node<E> raiz;
    private Node<E> ultimo;
    private int tamano;

    public DoublyLinkedList() {
        raiz = null;
        ultimo = null;
        tamano = 0;
    }

    public void add(E dato) {
        Node<E> nuevoNodo = new Node<>(dato);
        if (raiz == null) {
            raiz = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setPreviousNode(ultimo);
            ultimo.setNextNode(nuevoNodo);
            ultimo = nuevoNodo;
        }
        tamano++;
    }

    public Node<E> get(int indice) {
        Node<E> aux = raiz;
        for (int i = 0; i < indice; i++) {
            aux = aux.getNextNode();
        }
        return aux;
    }

    public void remove(int indice) {
        if (indice < tamano) {
            if (indice == 0) {
                raiz = raiz.getNextNode();
                raiz.setPreviousNode(null);
            } else if (indice == tamano - 1) {
                ultimo = ultimo.getPreviousNode();
                ultimo.setNextNode(null);
            } else {
                Node<E> nodo = get(indice);
                nodo.getPreviousNode().setNextNode(nodo.getNextNode());
                nodo.getNextNode().setPreviousNode(nodo.getPreviousNode());
            }
            tamano--;
        }
    }

    public int size() {
        return tamano;
    }
}
