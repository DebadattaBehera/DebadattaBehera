package binarysearch;

public class FindElementInRotatedSortedArray {
	static int solve(int[] arr,int k) {
		int start = 0;
		int end = arr.length - 1;
		int n = arr.length - 1;
		int index=-1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int prev = (mid + n - 1) % n;
			int next = (mid + 1) % n;
			if (arr[mid] < arr[prev] && arr[mid] < arr[next])
				 index=mid;
			if (arr[mid] < arr[end])
				end = mid - 1;
			else {
				start = mid + 1;
			}
		}
		int result1=binarySearch(arr,0,index-1,k);
		int result2=binarySearch(arr,index+1,arr.length-1,k);
		if(result1>=0) {
			return result1;
		}
		else if(result2>=0) {
			return result2;
		}
		return -1;
		
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
		int[] arr = { 11, 12, 15, 18, 2, 5, 6, 8 };
		int k=15;
		System.out.println(solve(arr,k));
	}

}
