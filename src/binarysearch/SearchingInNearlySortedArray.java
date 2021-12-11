package binarysearch;


public class SearchingInNearlySortedArray {

	static int solve(int[] arr,int k) {
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	    	if(arr[mid]==k) {
	    		return mid;
	    	}
	    	if(mid>=start && arr[mid-1]==k) {
	    		return mid-1;
	    	}
	    	if(end>=mid+1 && arr[mid+1]==k) {
	    		return mid-1;
	    	}
	    	else if(arr[mid]>k) {
	    		end=mid-2;
	    	}
	    	else {
	    		start=mid+2;
	    	}
	    }
	    return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,10,30,20,40};
		int k=10;
		System.out.println(solve(arr,k));
	}

}
