package binarysearch;

public class SearchAnElementInBitonicArray {
	static int solve(int[] arr,int k) {
	    int start=0;
	    int end=arr.length-1;
	    int index=-1;
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	      if(mid>0 && mid<=end) {
	    	if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
	    		index=mid;
	    		break;
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
	    		  index=mid;
	    		  break;
	    	  }
	    	  else {
	    		  index=1;
	    		  break;
	    	  }
	      }
	      else if(mid==arr.length-1) {
	    	  if(arr[mid]>arr[arr.length-2]) {
	    		  index= mid;
	    		  break;
	    	  }
	    	  else {
	    		  index=arr.length-2;
	    		  break;
	    	  }
	      }
	    }
	        
	    	
	    	int result1=binarySearchAsc(arr, 0, index-1, k);
	    	int result2 =binarySearchDsc(arr, index, arr.length-1, k);
	    	if(result1>0) {
	    		return result1;
	    	}
	    	if(result2>0) {
	    		return result2;
	    	}
	    
	   
		return -1;
	}
	static int binarySearchAsc(int[] arr,int start,int end,int k) {
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
	static int binarySearchDsc(int[] arr,int start,int end,int k) {
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	    	if(arr[mid]==k) {
	    		return mid;
	    	}
	    	else if(arr[mid]>k) {
	    		start=mid+1;
	    		
	    	}
	    	else {
	    		end=mid-1;
	    	}
	    }
	    return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,8,12,4,2};
		int k=4;
		System.out.println(solve(arr,k));
	}

}
