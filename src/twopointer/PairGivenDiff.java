package twopointer;

import java.util.ArrayList;
import java.util.Collections;

public class PairGivenDiff {
	 public static int solve(ArrayList<Integer> A, int n) {
	        Collections.sort(A);
	        int i = 0, j = 1;
	 
	        // Search for a pair
	        while (i < A.size() && j < A.size())
	        {
	            if (i != j && (A.get(j) - A.get(i) == n || A.get(i) - A.get(j) == n))
	            {
	                
	                return 1;
	            }
	            else if (A.get(j) - A.get(i) < n)
	                j++;
	            else
	                i++;
	        }
	 
	        return 0;
	    }
	 public static void main (String[] args)
	    {
	        int arr[] = {1, 8, 30, 40, 100};
	        ArrayList<Integer> list=new ArrayList<>();
	        for(Integer i:arr) {
	        	list.add(i);
	        }
	        int n = -60;
	        System.out.println(solve(list,n));
	    }
}
