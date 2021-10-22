package doubleLinkedList;

public class DoubleLinkedListUsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node<Integer> a = new Node<Integer>(20);
		Node<Integer> b = new Node<Integer>(30);
		Node<Integer> c = new Node<Integer>(10);
		
		a.next = b;
		b.next = c;
		c.pre = b;
		b.pre = a;
		
		Node<Integer> temp1 = a; 
		Node<Integer> temp2 = c;
		
		while(temp1 != null) {
			System.out.print(temp1.data + "-->");
			temp1 = temp1.next;
		}
		System.out.println();
		while(temp2 != null) {
			System.out.print(temp2.data + "-->");
			temp2 = temp2.pre;
		}

	}

}
