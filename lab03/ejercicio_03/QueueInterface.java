public interface QueueInterface<T> {
    boolean add(Node<T> e) throws Exception;
    Node<T> element()  throws Exception;
    boolean offer(Node<T> e);
    Node<T> peek();
    Node<T> poll();
    Node<T> remove() throws Exception;
    
    //Helpful methods
    boolean isEmpty();
    int size();
}