package binarysearch;

public class NextAlphabeticalElement {

	static char solve(char[] arr,char k) {
	    int start=0;
	    int end=arr.length-1;
	    char result=' ';
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	    	if(arr[mid]==k) {
	    		start=mid+1;
	    	}
	    	else if(arr[mid]>k) {
	    		result=arr[mid];
	    		end=mid-1;
	    	}
	    	else {
	    		start=mid+1;
	    	}
	    }
	    return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a','c','e','f','h','i'};
		char k='f';
		System.out.println(solve(arr,k));
	}

}
