package especiliazacaoJava.customhash;

import especiliazacaoJava.node.LinkedNode;
import especiliazacaoJava.node.Node;

public class CustomHashMap {
	
	@SuppressWarnings("unchecked")
	private LinkedNode<Integer> mapNodes[] = new LinkedNode[10];
	
	//É conssiderado O(1) por que não precisa correr a lista.
	public void put(int key, int value) {
		Node<Integer> newNode = new Node<>(value);
		mapNodes[hashItUp(key)].push(newNode);		
	}
	
	//É conssiderado O(1) por que não precisa correr a lista.	
	public void delete(int key) {
		mapNodes[hashItUp(key)] = null;
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public int[] get(int key) {
		LinkedNode<Integer> findedNode = mapNodes[hashItUp(key)];
		int size = findedNode.size();
		int[] numbers = new int[size]; 
		
		for(int i = 1; i <= size; i++) {
			numbers[i-1] = findedNode.elementAt(i).getValue();
		}
		
		return numbers;
		
	}
	
	//É considerado O(n) pois precisa percorrer a lista.
	public void clear() {
		for(LinkedNode<Integer> n : mapNodes) {
			n = null;
		}
	}
	
	//É uma versão simplificada de um dos algoritimos mais utilizados.
	private int hashItUp(Integer value) {
		
		return (31 * value.hashCode())%10;
	}

	
}
