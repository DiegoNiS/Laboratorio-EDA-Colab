
public class Node <T> {
    private T data;
    private  Node<T> nextNode;
    
    public Node(T data ){
        this.data=data;
        this.nextNode=null;
    }
    public Node(T d,Node<T> n){
        data=d;
        nextNode=n;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}
    
