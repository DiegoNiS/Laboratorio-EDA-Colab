package javaapplication1;
/*Implementa una cola usando POO con tipos genéricos siguiendo los estándares
de Java (los métodos para una cola) verifique:
o https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
*/

public class Node <T> {
    private T node;
    private Node <T> nextN;

    public Node(T node) {
        this.node = node;
        this.nextN = null;
    }
    
    public Node(T node, Node nextN){
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
