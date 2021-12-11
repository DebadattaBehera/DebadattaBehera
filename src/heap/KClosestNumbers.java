package heap;
import java.util.*;
class Pair{
	int key;
	int value;
	public Pair(int key,int value) {
		this.key=key;
		this.value=value;
	}
}

public class KClosestNumbers {

	static void solve(int[] arr,int k,int x) {
		PriorityQueue<Pair> heap=new PriorityQueue<>((a,b)->{
			return b.key-a.key;
		});
		for(int i=0;i<arr.length;i++) {
			heap.add(new Pair(Math.abs(arr[i]-x), arr[i]));
			if(heap.size()>k) {
				heap.remove();
			}
		}
	  while(!heap.isEmpty()) {
		  System.out.println(heap.remove().value);
	  }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,8,9};
		int k=3;
		int x=7;
		solve(arr,k,x);
	}
}
