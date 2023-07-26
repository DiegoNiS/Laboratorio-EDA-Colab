package laboratorioeda;

public class LinkedList<T> {
    private LNode<T> head;
    private int items;
    
    public LinkedList(){
        items = 0;
    }
    public LNode<T> getHead() {
        return this.head;
    }

    public int getItems() {
        return items;
    }
    public void add(T num){
        if (isEmpty()){
            this.head = new LNode<T>(num);
            this.items ++;
        }
	    else {
            LNode<T> aux = this.head;
            while ( aux.getNext() != null)
		        aux = aux.getNext();
            aux.setNext(new LNode<T>(num));
            this.items ++;
        }    
    }
    public boolean isEmpty(){
        return this.items == 0;
    }
    
    public String toString(){
        String str = "";
        for(LNode<T> aux = this.head; aux != null; aux = aux.getNext())
            str += aux.toString() + ", ";
        return str;
    }
}
