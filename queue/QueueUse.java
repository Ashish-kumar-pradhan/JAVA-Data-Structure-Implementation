package queue;

public class QueueUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//       QueueUsingLL s = new QueueUsingLL();
//		
//		for(int i = 0 ; i < 11 ; i++) {
//			s.push(i + 1);
//		}
//		
//		System.out.println(s.front());
//		
//		while(!s.isEmpty()) {
//			System.out.println(s.pop());
//		}
		
		 QueueUsingArray s = new QueueUsingArray();
			
			for(int i = 0 ; i < 11 ; i++) {
				s.push(i + 1);
			}
			
			System.out.println(s.front());
			
			while(!s.isEmpty()) {
				System.out.println(s.pop());
			}

	}

}
