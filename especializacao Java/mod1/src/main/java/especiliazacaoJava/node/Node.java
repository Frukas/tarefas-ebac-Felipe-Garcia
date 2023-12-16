package especiliazacaoJava.node;

public class Node<T> {

	private int index;
	private Node<T> Tail = null;
	private Node<T> head = null;
	private T value;	
			
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node(T type){
		this.value = type;	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Node<T> getTail() {
		return Tail;
	}
	public void setTail(Node<T> tail) {
		Tail = tail;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}	
}
