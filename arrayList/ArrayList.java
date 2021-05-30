package arrayList;

public class ArrayList {
	
	private int data[];
	private int size;
	
	public ArrayList() {
		data = new int[10];
		size = 0;
	}
	
	public void increaseCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i = 0 ; i < temp.length ; i++) {
			data[i] = temp[i];
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void put(int elem) {
		if(size == data.length) {
			increaseCapacity();
		}
		data[size] = elem;
		size++;
	}
	
	public int get(int index) {
		return data[index];
	}

}
