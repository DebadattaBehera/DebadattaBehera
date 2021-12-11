package heap;

import java.util.*;

public class SortKSortedArray {

	static void solve(int[] arr,int k) {
		PriorityQueue<Integer> heap=new PriorityQueue<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			heap.add(arr[i]);
			if(heap.size()>k) {
				list.add(heap.remove());
			}
		}
	      while(!heap.isEmpty()) {
		      list.add(heap.remove());
	     }
	      for(Integer j:list) {
	    	  System.out.println(j);
	      }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,5,3,2,8,10,9};
		int k=3;
		solve(arr,k);
	}

}
