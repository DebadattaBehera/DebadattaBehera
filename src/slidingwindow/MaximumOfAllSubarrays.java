package slidingwindow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumOfAllSubarrays {
	static List<Integer> solve(int[] arr,int k) {
		
		            List<Integer> list = new ArrayList<>();
		            PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
		            PriorityQueue<Integer> toDrop = new PriorityQueue<>(Comparator.reverseOrder());
				    // Push First K elements in the heap
				    for(int i=0;i<k;i++)
				        heap.add(arr[i]);
				    // store the maximum in ans
				    list.add(heap.peek());
				    //iterate for rest elements
				    for(int i=k;i<arr.length;i++)
				    {
				        // pop the heap if leftmost element is previous element was maximum
				        if(arr[i-k] == heap.peek())
				            heap.poll();
				        else
				        {
				            // push the leftmost element to toDrop heap 
				            toDrop.add(arr[i-k]);
				        }   
				        // pop elements from both heap till their top matches
				        while(toDrop.size()>0 && toDrop.peek() == heap.peek())
				        {
				            heap.poll();
				            toDrop.poll();
				        }
				        // push the element to the heap
				        heap.add(arr[i]);
				        list.add(heap.peek());
				    }
		
		            return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		List<Integer> list = solve(arr, k);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
