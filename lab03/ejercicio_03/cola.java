package javaapplication1;

public class cola{
    private int size;
    private Node firstE;
    private Node lastE;

    public cola() {
        this.size = 0;
        this.firstE = null;
        this.lastE = null;
    }


    public void push(Node node) {
        this.lastE = node; 
    }
    
    public Node pop() {
        return lastE;
    }

    public cola top() {
        // IDK
        return this;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.firstE == null;
    }

    
}
