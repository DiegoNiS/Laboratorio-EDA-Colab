public class DoubleLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
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
    public Node<E> get(int indice) {
        if (indice >= 0 && indice < this.size) {
            Node<E> aux;
            if (this.size / 2 > indice) {
                aux = this.head;
                for (int i = 0; i < indice; i++) {
                    aux = aux.getNextNode();
                }
                return aux;
            }else{
                aux = this.tail;
                for(int i = this.size-1; i > indice; i--){
                    aux = aux.getPreviousNode();
                }
            }
        }else{
            System.out.println("No existe tal elemento dentro de los límites de la lista");
        }

    }

    // Metodo add: agrega un nuevo elemento al final de la lista enlazada
    public void add(E dato) {
        if (this.size == 0) {
            this.head = new Node<E>(dato);
            this.size++;
        } else {
            this.get(this.size() - 1).setNextNode(new Node<E>(dato));
            this.size++;
        }
    }

    // Metodo remove: desenlaza al nodo del indice indicado
    public void remove(int indice) {
        if (indice < this.size && indice >= 0) {
            if (indice == 0) {
                this.head = this.head.getNextNode();
            } else {
                Node<E> current = this.get(indice);
                current.getPreviousNode().setNextNode(current.getNextNode());
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
        String str = "";
        for (Node<E> aux = this.raiz; aux != null; aux = aux.getNext()) {
            str += aux.toString() + ", ";
        }
        return str;
    }
}

