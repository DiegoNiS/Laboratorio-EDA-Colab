public class Node<T> {
    private T node;
    private Node<T> nextN;

    public Node(T node) {
        this.node = node;
        this.nextN = null;
    }
    
    public Node(T node, Node<T> nextN){
        this.node = node;
        this.nextN = nextN;
    }

    public T getNode() {
        return node;
    }

    public void setNode(T node) {
        this.node = node;
    }

    public Node<T> getNextN() {
        return nextN;
    }

    public void setNextN(Node<T> nextN) {
        this.nextN = nextN;
    }
    
}
