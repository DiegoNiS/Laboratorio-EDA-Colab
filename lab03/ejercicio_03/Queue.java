import java.util.*;

public class Queue<T> implements QueueInterface<T> {

    private int size;
    private Node<T> firstN;
    private Node<T> lastN;

    public Queue() {
        this.size = 0;
        this.firstN = null;
        this.lastN = null;
    }

    public boolean add(Node<T> e) throws Exception {
        try {
            enqueue(e);
            return true;
        } catch (Exception exception) {
            throw new IllegalStateException("La cola está llena");
        }
    }

    public boolean offer(Node<T> e) {
        try {
            enqueue(e);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public Node<T> element() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return firstN;
    }

    public Node<T> peek() {
        if (isEmpty()) {
            return null;
        }
        return firstN;
    }

    public Node<T> poll() {
        if (isEmpty()) {
            return null;
        }
        return dequeue();
    }

    public Node<T> remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return dequeue();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Node<T> node) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Node<T> dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
