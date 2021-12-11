package binarysearch;

public class FindElementInInfiniteArray {
	static int solve(int[] arr,int k) {
		int start =0;
		int end = 1;
		while (k>arr[end]) {
			start=end;
			end=2*end;
		}
		int index=binarySearch(arr,start,end,k);
		return index;
		
	}
	static int binarySearch(int[] arr,int start,int end,int k) {
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
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
		int k=7;
		System.out.println(solve(arr,k));

	}

}
