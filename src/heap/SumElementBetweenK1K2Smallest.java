package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SumElementBetweenK1K2Smallest {

	static void solve(int[] arr,int k1,int k2) {
		PriorityQueue<Integer> heap1=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			heap1.add(arr[i]);
			if(heap1.size()>k1) {
				heap1.remove();
			}
		}
		int first=heap1.peek();
		PriorityQueue<Integer> heap2=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			heap2.add(arr[i]);
			if(heap2.size()>k2) {
				heap2.remove();
			}
		}
		int sec=heap2.peek();
		int cost=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first && arr[i]<sec) {
				cost=cost+arr[i];
			}
		}
		
	 

	  System.out.print(cost);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,12,5,15,11};
		int k1=3;
		int k2=6;
		solve(arr,k1,k2);
	}

}
