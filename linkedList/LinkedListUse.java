package linkedList;

public class LinkedListUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList list1 = new LinkedList();
		for(int i = 0 ; i < 10 ; i++) {
			list1.addLast(i+1);
		}
		
		
		
		
//		System.out.println(list1.size());
//		System.out.println(list1.removeAt(9));
//		list1.print();
//		System.out.println(list1.size());
//		list1.addAt(60 , 1);
//		
//		list1.print();
//		System.out.println(list1.size());
		
		LinkedList list2 = new LinkedList();
//		list2.addFirst(10);
//		System.out.println(list2.size());
//		System.out.println(list2.removeLast());
//		System.out.println(list2.size());
		
		
//		list2.print();
//		list2.reverse();
//		list2.print();
		
		
		System.out.println(list1.mid());
		System.out.println(list1.isPresent(1));
		System.out.println(list1.isPresent(0));
	}

}
