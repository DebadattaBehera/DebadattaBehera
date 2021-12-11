package slidingwindow;

import java.util.ArrayList;
import java.util.*;

public class FindFirstNegativeNumberInEveryWindow {
	static void solve(int[] arr,int k) {
	
		int i=0;
		int j=0;
		List<Integer> list=new ArrayList<>();
		
		while(j<arr.length) {
			if(arr[j]<0) {
				list.add(arr[j]);
			}
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				if(list.isEmpty()) {
					System.out.println(0);
				}
			    if(list.size()>0 && list.get(0)<0) {
			    	System.out.println(list.get(0));
			    }
			    if(list.contains(arr[i])) {
			    	list.remove(0);
			    }
				i++;
				j++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-8,2,3,-6,10};
        int k=3;
        solve(arr,k);

	}

}
