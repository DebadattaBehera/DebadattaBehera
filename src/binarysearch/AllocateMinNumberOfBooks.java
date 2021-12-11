package binarysearch;

import java.util.Arrays;

public class AllocateMinNumberOfBooks {
	static int solve(int[] arr,int k) {
		int max=Arrays.stream(arr).max().getAsInt();
		int sum=Arrays.stream(arr).sum();
		
	    int start=max;
	    int end=sum;
	    int result=-1;
	    int n=arr.length-1;
	    if(k>n) {
	    	return -1;
	    }
	    while(start<=end) {
	    	int mid=start+(end-start)/2;
	    	if(isValid(arr,k,n,mid)) {
	    		result=mid;
	    		end=mid-1;
	    	}
	    	else {
	    		start=mid+1;
	    	}
	    	
	    }
	    return result;
	}
	static boolean isValid(int[] arr,int k,int n,int mid) {
		int student =1;
		int total=0;
		for(int i=0;i<=n;i++) {
			total=total+arr[i];
			if(total>mid) {
				student++;
				total=arr[i];
			}
			if(student>k) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		int k=2;
		System.out.println(solve(arr,k));
	}

}
