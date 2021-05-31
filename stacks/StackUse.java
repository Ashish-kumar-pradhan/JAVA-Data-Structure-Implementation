package stacks;

public class StackUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		StackUsingLL s = new StackUsingLL();
		
		for(int i = 0 ; i < 11 ; i++) {
			s.push(i + 1);
		}
		
		System.out.println(s.top());
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
