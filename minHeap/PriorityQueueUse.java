package minHeap;

public class PriorityQueueUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		System.out.println(pq.size());
		pq.insert(8);
		System.out.println(pq.getmin());
		pq.insert(3);
		System.out.println(pq.getmin());
		pq.removeMin();
		pq.insert(4);
		System.out.println(pq.getmin());
		System.out.println(pq.size());
		
	}

}
