package stacks;

public class StackUsingArray {

	private int data[];
	private int top;
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}
	
	private void doubleCapacity(){
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0 ; i <= top ; i++) {
			data[i] = temp[i];
		}
		
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}

	public int size() {
		return top + 1;
	}
	
	public int top() throws Exception {
		if(size() == 0) {
			throw new Exception("Stack is Empty");
		}
		return data[top];
	}
	
	public void push(int elem) throws Exception {
		if(size() == data.length) {
			doubleCapacity();
		}
		
		top++;
		data[top] = elem;
	}
	
	public int pop() throws Exception {
		if(size() == 0) {
			throw new Exception("Stack is Empty");
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
}
