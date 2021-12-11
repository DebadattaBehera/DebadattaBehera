package binarysearch;

public class FindFirstOccuranceOfElement {

	static int solve(int[] arr,int k) {
	    int start=0;
	    int end=arr.length-1;
	    int res=-1;
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	    	if(arr[mid]==k) {
	    		res=mid;
	    		end=mid-1;
	    	}
	    	else if(arr[mid]>k) {
	    		end=mid-1;
	    	}
	    	else {
	    		start=mid+1;
	    	}
	    }
	    return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,10,10,10,18,20};
		int k=10;
		System.out.println(solve(arr,k));
	}

}
