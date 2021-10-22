package doubleLinkedList;

public class Node<T> {

	T data;
	Node<T> pre;
	Node<T> next;
	
	public Node(T x) {
		data = x;
		pre = null;
		next = null;
	}
}
