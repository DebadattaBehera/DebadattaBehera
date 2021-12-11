package heap;

import java.util.*;
class Pairs{
	int key;
	int value;
	public Pairs(int key,int value) {
		this.key=key;
		this.value=value;
	}
}
public class TopKElements {

	static void solve(int[] arr,int k) {
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
				map.put(arr[i],1);
		}
		PriorityQueue<Pairs> heap=new PriorityQueue<>((a,b)->{
			return a.key-b.key;
		});
		for(Map.Entry<Integer, Integer> var:map.entrySet()) {
			heap.add(new Pairs(var.getValue(), var.getKey()));
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
		int[] arr = {1,1,1,3,2,2,4};
		int k=2;
		solve(arr,k);
	}

}
