package especiliazacaoJava.node;


public class LinkedNode<T> {
	
	private int size = 0;
	private Node<T> head = null;	
	private Node<T> tail = null;
	
	//É conssiderado O(1) por que não precisa correr a lista.
	public void push(Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		}else {
			tail.setTail(node);
			node.setHead(tail);
			tail = node;
		}	
		size++;
	}
	
	//É conssiderado O(1) por que não precisa correr a lista.
	public Node<T> pop(){
		
		Node<T> pop;
		
		if(size <= 0) {
			return null;
		}

		if(tail == head) {
			pop = head;
			head = tail = null;
		}else {
			pop = tail;
			tail = tail.getHead();
			tail.setTail(null);
		}
		size--;
		return pop;
	} 
	
	//É considerado O(n) pois precisa percorrer a lista.
	public void insert(int index, Node<T> node) {
		
		if(index > size) {
			this.push(node);
			return;
		}

		Node<T> movingElement = this.elementAt(index);
		
		if(movingElement != head) {
			movingElement.getHead().setTail(node);
		}else {
			head = node;
		}		
		
		node.setTail(movingElement);
		movingElement.setHead(node);
		
		size++;
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public void remove(int index) {
		
		Node<T> removingNode = elementAt(index);
		
		if(removingNode.getTail() != null) {
			removingNode.getTail().setHead(removingNode.getHead());
		}else {
			tail = removingNode.getHead();
		}
		
		if(removingNode.getHead() != null) {
			removingNode.getHead().setTail(removingNode.getTail());
		}else {
			head = removingNode.getTail();
		}
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public Node<T> elementAt(int index) {
		if(index > size || index <= 0) {
			throw new IndexOutOfBoundsException(" For elementAt the value should be min 1 and max " + this.size);
		}
		
		Node<T> currentNode = head;
		for(int i = 1; i < index  ; i++) {
			currentNode = currentNode.getTail();			
		}

		return currentNode;
	}
	
	public int size() {
		return this.size;
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public void printList() {
		Node<T> current = head;
		
		while(current != null) {
			System.out.println(current.getValue());
			current = current.getTail();
		}		
	}
}
