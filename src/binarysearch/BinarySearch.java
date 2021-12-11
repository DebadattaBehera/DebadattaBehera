package binarysearch;


public class BinarySearch {
	
	static int solve(int[] arr,int k) {
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	    	if(arr[mid]==k) {
	    		return mid;
	    	}
	    	else if(arr[mid]>k) {
	    		end=mid-1;
	    	}
	    	else {
	    		start=mid+1;
	    	}
	    }
	    return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k=5;
		System.out.println(solve(arr,k));
	}

}
