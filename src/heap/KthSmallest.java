package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
	static void solve(int[] arr,int k) {
		PriorityQueue<Integer> heap=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			heap.add(arr[i]);
			if(heap.size()>k) {
				heap.remove();
			}
		}
		System.out.print(heap.peek());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10,4,3,20,15};
		int k=3;
		solve(arr,k);

	}

}
