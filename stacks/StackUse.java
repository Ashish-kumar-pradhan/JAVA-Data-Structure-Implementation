package stacks;

public class StackUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		StackUsingArray s = new StackUsingArray();
		
		for(int i = 0 ; i < 10 ; i++) {
			s.push(i + 1);
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
