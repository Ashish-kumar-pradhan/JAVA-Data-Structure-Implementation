package minHeap;

public class HeapSort {
	
	public static void insertInVertualHeap(int[] arr , int i) {
		int childIndex = i;
		
		while(childIndex > 0) {
			int parentIndex = (childIndex - 1)/2;
			if(arr[childIndex] < arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
			}else {
				return;
			}
		}
	}
	
	public static void heapSort(int arr[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			insertInVertualHeap(arr , i);
		}
		int heapSize = arr.length ;
		
		while(heapSize > 0) {
			int minValue = arr[0];
			arr[0] = arr[heapSize - 1] ;
			heapSize--;
			int parentIndex = 0;
			while(2*parentIndex + 1 < heapSize ) {
				int leftChildIndex = 2*parentIndex + 1;
				int rightChildIndex = 2*parentIndex + 2;
				
				int min;
				if(rightChildIndex < heapSize) {
					min = Math.min(arr[parentIndex], Math.min(arr[rightChildIndex], arr[leftChildIndex]));	
				}else {
					min = Math.min(arr[parentIndex], arr[leftChildIndex]);
				}
				
				if(min == arr[parentIndex]){
					break;
				}
				else if(min == arr[leftChildIndex]){
					int temp = arr[leftChildIndex];
					arr[leftChildIndex] = arr[parentIndex];
					arr[parentIndex] = temp;
					parentIndex = leftChildIndex;
				}
				else {
					int temp = arr[rightChildIndex];
					arr[rightChildIndex] = arr[parentIndex];
					arr[parentIndex] = temp;
					parentIndex = rightChildIndex;
				}
				
			}
			
			arr[heapSize] = minValue;
			
		}
		
		for(int i = 0 ; i < arr.length/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8 , 7 , 6 ,5 , 4 , 3 , 2 , 1 , 9};
		
		heapSort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

	}

}
