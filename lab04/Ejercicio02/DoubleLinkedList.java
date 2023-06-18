public class DoubleLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
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
    public Node<E> get(int indice) {
        if (indice >= 0 && indice < this.size) {
            Node<E> aux;
            if (this.size / 2 > indice) {
                aux = this.head;
                for (int i = 0; i < indice; i++) {
                    aux = aux.getNextNode();
                }
            } else {
                aux = this.tail;
                for (int i = this.size - 1; i > indice; i--) {
                    aux = aux.getPreviousNode();
                }
            }
            return aux;
        } else {
            System.out.println("No existe tal elemento dentro de los límites de la lista");
            return null;
        }
    }

    // Metodo add: agrega un nuevo elemento al final de la lista enlazada
    public void add(E dato) {
        Node<E> newNode = new Node<E>(dato);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
        this.size++;
    }

    // Metodo remove: desenlaza al nodo del indice indicado
    public void remove(int indice) {
        if (indice < this.size && indice >= 0) {
            if (indice == 0) {
                this.head = this.head.getNextNode();
                this.head.getPreviousNode().setNextNode(null);
                this.head.setPreviousNode(null);
            } else {
                Node<E> current = this.get(indice);
                current.getNextNode().setPreviousNode(current.getPreviousNode());
                current.getPreviousNode().setNextNode(current.getNextNode());
                current.setPreviousNode(null);
                current.setNextNode(null);
            }
            this.size--;
        } else {
            System.out.println("Este elemento no está dentro de los límites de la lista");
        }
    }

    // Metodo toString: devuelve un String con los elementos de la lista enlazada 
    //separada por ,
    @Override
    public String toString() {
        String str = "{";
        for (Node<E> aux = this.head; aux != null; aux = aux.getNextNode()) {
            str += aux.toString() + ", ";
        }
        return str + "}";
    }
}