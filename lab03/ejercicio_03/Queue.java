public class Queue<T> implements QueueInterface<T> {

    private int size;
    private Node<T> firstN;
    private Node<T> lastN;

    public Queue() {
        this.size = 0;
        this.firstN = null;
        this.lastN = null;
    }

    public void enqueue(Node<T> node) {
        if (firstN == null && lastN == null) {
            firstN = node;
        } else {
            this.lastN.setNextN(node);
        }
        this.lastN = node;
        this.size++;
    }

    private Node<T> dequeue() {
        Node<T> temp = firstN;
        if (firstN.getNextN() == null) {
            firstN = null;
            lastN = null;
        } else {
            firstN = firstN.getNextN();
        }
        this.size--;
        return temp;
    }

    public void showQueue() {
        Node<T> temp = firstN;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNextN();
        }
    }

    public boolean add(Node<T> e) throws Exception {
        try {
            enqueue(e);
            return true;
        } catch (Exception exception) {
            throw new Exception("Problema para agragar el elemento");
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

    public Node<T> element() throws Exception {
        if (isEmpty()) {
            throw new Exception("La cola está vacía");
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

    public Node<T> remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("La cola está vacía");
        }
        return dequeue();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
