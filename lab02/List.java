public class List<T> {
    private Node<T> root;
    int size;
    
    public List(){
        root=null;
        size=0;
    }
    public T obtener(int index)
    {
        int contador=0;
        Node temporal=root;
        while(contador<index)
        {
            temporal=temporal.getNextNode();
            contador++;
        }
        return (T) temporal.getData();
        
    }
    
    public void agregarPrimero(T data ){
        if (root==null)
        {
            root=new Node(data);   
        }
        else
        {
            Node temp=root;
            Node nuevo=new Node(data);
            nuevo.setNextNode(temp);
            root=nuevo;
        }
        size++;
    }
    public int size()
    {
        return size;
    }
    public boolean estaVacio(){
        return (root==null)?true:false;
    }  
}
