package especiliazacaoJava.queue;

import especiliazacaoJava.node.LinkedNode;
import especiliazacaoJava.node.Node;

public class Queue {
	
	private LinkedNode<Integer> queue = new LinkedNode<>();
	
	//É considerado O(1) por que não precisa correr a lista. Como sempre adicona na posição 1 não precisa verificar toda lista encadeada.
	public void enqueue(int value) {
		Node<Integer> node = new Node<>(value);
		if(queue.size() <= 0) {
			queue.push(null);
		}
		
		queue.insert(1, node);
	}
	
	//É considerado O(1) por que não precisa correr a lista.
	public int dequeue() {
		return queue.pop().getValue();
	}
	
	//É considerado O(1) por que não precisa correr a lista. Como sempre adicona na posição 1 não precisa verificar toda lista encadeada.
	public int rear() {
		return queue.elementAt(1).getValue();
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public int front() {
		return queue.elementAt(queue.size()).getValue();
	}
	
	//É considerado O(1) por que não precisa correr a lista.
	public int size() {
		return queue.size();
	}
	
	//É considerado O(1) por que não precisa correr a lista.
	public boolean isEmpty() {
		return queue.size() <= 0;
	}

}
