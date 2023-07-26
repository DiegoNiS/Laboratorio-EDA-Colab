package laboratorioeda;

public class LNode<E> {
    private E data;
    private LNode<E> next;

    public LNode(E data, LNode<E> next) {
    this.data = data;
    this.next = next;
    }
    public LNode(E data) {
    	this(data, null);
    }
    public E getData() {
    	return this.data;
    }
    public void setData(E data) {
    	this.data = data;
    }
    public LNode<E> getNext() {
	return this.next;
    }
    public void setNext(LNode<E> next) {
	this.next = next;
    }
    public String toString() {
	return this.data.toString();
    }
}
