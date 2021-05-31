package stacks;

import linkedList.LinkedList;

public class StackUsingLL {
		
		private LinkedList list;
		private int top;
		
		public StackUsingLL() {
			list = new LinkedList();
			top = -1;
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}

		public int size() {
			return top + 1;
		}

		
		public void push(int elem) {
			list.addFirst(elem);
			top++;
		}
		
		public int pop() throws Exception {
			if(size() == 0) {
				throw new Exception("Stack is Empty");
			}
			top--;
			return list.removeFirst();
		}
		
		public int top() throws Exception {
			if(size() == 0) {
				throw new Exception("Stack is Empty");
			}
			return list.getFirst();
		}

}
