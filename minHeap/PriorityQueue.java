package minHeap;

import java.util.ArrayList;

public class PriorityQueue {
	
	private ArrayList<Integer> heap;
	
	public PriorityQueue() {
		heap = new ArrayList<>();
	}
	
	boolean isEmpty() {
		return heap.size() == 0;
	}
	
	int size() {
		return heap.size();
	}
	
	int getmin() throws Exception {
		if(isEmpty()) {
			throw new Exception("Priority Queue is Empty.");
		}
		return heap.get(0);
	}
	
	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		
		while(childIndex > 0) {
			int parentIndex = (childIndex - 1)/2;
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
			}else {
				return;
			}
		}
		
	}
	
	int removeMin() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Priority Queue is Empty.");
		}
		
		int minValue = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		
		int parentIndex = 0;
		while(2*parentIndex + 1 < heap.size() ) {
			int leftChildIndex = 2*parentIndex + 1;
			int rightChildIndex = 2*parentIndex + 2;
			
			int min;
			if(rightChildIndex < heap.size()) {
				min = Math.min(heap.get(parentIndex), Math.min(heap.get(rightChildIndex), heap.get(leftChildIndex)));	
			}else {
				min = Math.min(heap.get(parentIndex), heap.get(leftChildIndex));
			}
			
			if(min == heap.get(parentIndex)){
				break;
			}
			else if(min == heap.get(leftChildIndex)){
				int temp = heap.get(leftChildIndex);
				heap.set(leftChildIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				parentIndex = leftChildIndex;
			}
			else {
				int temp = heap.get(rightChildIndex);
				heap.set(rightChildIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				parentIndex = rightChildIndex;
			}
			
		}
		return minValue;
	}

}
