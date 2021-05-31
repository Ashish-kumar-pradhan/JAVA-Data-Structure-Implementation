package arrayList;

public class ArrayListUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		for(int i = 0 ; i < 11 ; i++) {
			al.put(i + 1);
		}
		
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}

	}

}
