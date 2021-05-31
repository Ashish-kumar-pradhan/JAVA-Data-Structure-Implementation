package queue;

import linkedList.LinkedList;

public class QueueUsingLL {
	
	private LinkedList list;
	private int size;
	
	public QueueUsingLL() {
		list = new LinkedList();
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	
	public void push(int elem) {
		list.addLast(elem);
		size++;
	}
	
	public int pop() throws Exception {
		if(size == 0) {
			throw new Exception("Stack is Empty");
		}
		size--;
		return list.removeFirst();
	}
	
	public int top() throws Exception {
		if(size == 0) {
			throw new Exception("Stack is Empty");
		}
		return list.getFirst();
	}


}
