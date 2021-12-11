package binarysearch;

public class CountOfAnElementInSortedArray {

	static int solve(int[] arr,int k) {
	    int start1=0;
	    int end1=arr.length-1;
	    int startIndex=-1;
	    while(start1<=end1) {
	    	int mid=start1+(end1-start1)/2;
	    	if(arr[mid]==k) {
	    		startIndex=mid;
	    		end1=mid-1;
	    	}
	    	else if(arr[mid]>k) {
	    		end1=mid-1;
	    	}
	    	else {
	    		start1=mid+1;
	    	}
	    }
	    int start2=0;
	    int end2=arr.length-1;
	    int endIndex=-1;
	    while(start2<=end2) {
	    	int mid=start2+(end2-start2)/2;
	    	if(arr[mid]==k) {
	    		endIndex=mid;
	    		start2=mid+1;
	    	}
	    	else if(arr[mid]>k) {
	    		end2=mid-1;
	    	}
	    	else {
	    		start2=mid+1;
	    	}
	    }
	    return endIndex-startIndex+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,10,10,10,18,20};
		int k=10;
		System.out.println(solve(arr,k));
	}

}
