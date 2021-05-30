package linkedList;

public class LinkedList {
	
	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void print() {
		
		System.out.println("-------------------");
		 
		Node temp = this.head;
		
		while(temp != null) {
			System.out.print(temp.data + " > ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("-------------------");
	}
	
	public void addLast(int item) {
		
		// create a node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		// summary object update
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}
	
	public void addFirst(int item) {
		
		// create a node
		
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		// summary object update
		
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			nn.next = head;
			this.head = nn;
			this.size++;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getFirst() throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		return head.data;
	}
	
	public int getLast() throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		return tail.data;
	}
	
	public int removeFirst() throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		int first = head.data;
		if(this.size == 1) {
			this.head = null;
			this.tail = null;
		}
		else {
			head = head.next;
		}
		size--;
		return first;
	}
	
	public int removeLast() throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		int last = tail.data;
		if(this.size == 1) {
			this.head = null;
			this.tail = null;
		}
		else {
			Node temp = getNodeAt(size - 2);
			this.tail = temp;
			this.tail.next = null;
		}
		size--;
		
		return last;
	}
	
	private Node getNodeAt(int n) throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		if(n < 0 || n >= size) {
			throw new Exception("Index out of bound.");
		}
		Node temp = new Node();
		temp = head;
		int i = 0;
		while(i < n) {
			temp = temp.next;
			i++;
		}
		return temp;
	}
	
	public int getAt(int n) throws Exception {
		Node temp = getNodeAt(n);
		return temp.data;
	}
	
	public void addAt(int item , int n) throws Exception {
		
		if(n < 0 || n > size) {
			throw new Exception("Invalid index");
		}
		
		if(n == 0) {
			addFirst(item);
		}
		else if(n == size) {
			addLast(item);
		}
		else {
			Node pre = getNodeAt(n-1);
			Node nN = new Node();
			nN.data = item;
			nN.next = pre.next;
			pre.next = nN;
			size++;
		}
		
	}
	
	public int removeAt(int n) throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		if(n < 0 || n >= size) {
			throw new Exception("Invalid index");
		}
		
		if(n == 0) {
			return removeFirst();
		}
		else if(n == size - 1) {
			return removeLast();
		}
		else {
			Node pre = getNodeAt(n-1);
			Node reNode = pre.next;
			int rv = reNode.data;
			pre.next = reNode.next;
			reNode.next = null;
			size--;
			return rv;
		}
		
	}
	
	public void reverse() {
		Node pre = head;
		Node cur = head.next;
		while(cur != null) {
			Node nxt = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nxt;
		}
		Node temp = head;
		this.head = tail;
		this.tail = temp;
		this.tail.next = null;
	}
	
	
	public int mid() throws Exception {
		Node mN = getNodeAt((size-1)/2);
		return mN.data;
	}
	
	public boolean isPresent(int item) throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		
		Node temp = head;
		while(temp != null) {
			if(temp.data == item) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
		

}
