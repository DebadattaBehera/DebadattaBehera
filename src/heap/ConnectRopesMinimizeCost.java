package heap;

import java.util.PriorityQueue;

public class ConnectRopesMinimizeCost {
	static void solve(int[] arr) {
		PriorityQueue<Integer> heap=new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			heap.add(arr[i]);
		}
	  int cost=0;
	  while(heap.size()>=2) {
		  int first=heap.peek();
		  heap.remove();
		  int sec=heap.peek();
		  heap.remove();
		  cost=cost+first+sec;
		  heap.add(first+sec);
		  
	  }
	  System.out.print(cost);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		solve(arr);
	}

}
