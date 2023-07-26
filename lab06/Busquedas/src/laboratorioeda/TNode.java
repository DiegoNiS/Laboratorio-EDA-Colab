package laboratorioeda;

public class TNode <T extends Comparable<T>>{
    private T d;
    private TNode<T> children;
    private TNode<T> left;
    private TNode<T> right;
    private LinkedList<Integer> positions;

    public TNode(T d) {
        this(d, new LinkedList<>());
    }
    
    public TNode(T d, int pos){
        this(d);
        positions.add(pos);
    }
    
    public TNode(T d, LinkedList<Integer> positions){
        this.d = d;
        this.positions = positions;
        this.children = null;
        this.left = null;
        this.right = null;
    }
    
    // Getters
    
    public T getD() {
        return d;
    }

    public TNode<T> getChildren() {
        return children;
    }

    private TNode<T> getLeft() {
        return left;
    }

    private TNode<T> getRight() {
        return right;
    }

    public LinkedList<Integer> getPositions() {
        return positions;
    }
    
    // Setters

    public void setChildren(TNode<T> children) {
        this.children = children;
    }

    public void setLeft(TNode<T> left) {
        this.left = left;
    }

    public void setRight(TNode<T> right) {
        this.right = right;
    }
    
    
    // Methods
    
    public TNode<T> search(T value) {
        return searchRecursive(this, value);
    }

    private TNode<T> searchRecursive(TNode<T> node, T value) {
        if (node == null || node.getD().compareTo(value) == 0) {
            return node;
        }

        if (value.compareTo(node.getD()) < 0) {
            return searchRecursive(node.getLeft(), value);
        } else {
            return searchRecursive(node.getRight(), value);
        }
    }
    
    public void insert(TNode<T> node) {
        insertRecursive(this, node);
    }

    private void insertRecursive(TNode<T> node, TNode<T> newNode) {
        if (newNode.getD().compareTo(node.getD()) < 0) {
            if(node.getLeft() == null){
                node.setLeft(newNode);
            } else {
                insertRecursive(node.getLeft(), newNode);
            }
        } else if (newNode.getD().compareTo(node.getD()) > 0) {
            if(node.getRight() == null){
                node.setRight(newNode);
            } else {
                insertRecursive(node.getRight(), newNode);
            }
        } 
    }

    
    public void delete(){
        //codigo para eliminar el nodo
    }
    
    public boolean isWordEnd(){
        return this.positions.isEmpty();
    }
}
