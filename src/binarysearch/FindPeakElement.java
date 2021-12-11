package binarysearch;

public class FindPeakElement {
	static int solve(int[] arr) {
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end) {
	    	if(start==end) {
	    		return start;
	    	}
	    	int mid=start+(end-start)/2;
	      if(mid>0 && mid<end) {
	    	if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
	    		return mid;
	    	}
	    	else if(arr[mid-1]>arr[mid]) {
	    		end=mid-1;
	    	}
	    	else {
	    		start=mid+1;
	    	}
	    }
	      else if(mid==0) {
	    	  if(arr[mid]>arr[1]) {
	    		  return mid;
	    	  }
	    	  else {
	    		  return 1;
	    	  }
	      }
	      else if(mid==arr.length-1) {
	    	  if(arr[mid]>arr[arr.length-2]) {
	    		  return mid;
	    	  }
	    	  else {
	    		  return arr.length-2;
	    	  }
	      }
	    }
	   
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,8,12,4,2};
		System.out.println(solve(arr));
	}

}
