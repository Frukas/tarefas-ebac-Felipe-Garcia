package especiliazacaoJava.stack;

import especiliazacaoJava.node.LinkedNode;
import especiliazacaoJava.node.Node;

public class Stack {
	
	private LinkedNode<Integer> stack;

	//É considerado O(1) por que não precisa correr a lista.
	public void push(int value) {
		Node<Integer> node = new Node<>(value);
		stack.push(node);
	}
	
	//É considerado O(1) por que não precisa correr a lista.
	public int pop() {
		Node<Integer> node = stack.pop();
		return node.getValue();
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public int top() {		
		return stack.elementAt(stack.size()).getValue();
	}
	
	//É considerado O(1) por que não precisa correr a lista.
	public boolean isEmpty() {
		int noElements = 0;
		return stack.size() <= noElements;
	}
	
	//É considerado O(1) por que não precisa correr a lista.
	public int size() {
		return stack.size();
	}
}
