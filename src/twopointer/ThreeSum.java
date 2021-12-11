package twopointer;

import java.util.*;

public class ThreeSum {
	 public static boolean threeSumClosest(int[] arr, int sum) {
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length;i++){
	            int low=i+1;int high=arr.length-1;
	            while(low<high){
	                int curr=arr[i]+arr[low]+arr[high];
	                if(curr==sum){
	                    return true;
	                }
	                if(curr<sum) {
	                	low++;
	                }
	                else {
	                	high--;
	                }
	            }
	        }
         return false;
	    }
	 public static void main(String args[]) {
		 int[] arr= {1,3,6,7,9,12};
		 int target=24;
		System.out.println(threeSumClosest(arr,target));
	 }

}
