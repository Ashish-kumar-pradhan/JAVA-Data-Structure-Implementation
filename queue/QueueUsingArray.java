package queue;

public class QueueUsingArray {
	
	private int data[];
	private int size;
	
	public QueueUsingArray() {
		data = new int[10];
		size = 0;
	}
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		size = 0;
	}
	
	private void doubleCapacity(){
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0 ; i < size ; i++) {
			data[i] = temp[i];
		}
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	
	public void push(int elem) {
		if(size == data.length) {
			doubleCapacity();
		}
		data[size] = elem;
		size++;
	}
	
	public int pop() throws Exception {
		if(size == 0) {
			throw new Exception("Queue is Empty");
		}
		int temp = data[0];
		for(int i = 0 ; i < size - 1 ; i++) {
			data[i] = data[i + 1];
		}
		size--;
		return temp;
	}
	
	public int front() throws Exception {
		if(size == 0) {
			throw new Exception("Queue is Empty");
		}
		return data[0];
	}
	

}
