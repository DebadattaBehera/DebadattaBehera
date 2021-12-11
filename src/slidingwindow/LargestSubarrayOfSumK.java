package slidingwindow;

import java.util.*;

public class LargestSubarrayOfSumK {
	static int solve(int[] arr,int k) {
		int i=0;
		int j=0;
		int sum=0;
		int max=0;
		
		while(j<arr.length) {
			sum=sum+arr[j];
			if(sum<k) {
				j++;
				
			}
			else if(sum==k) {
				max=Math.max(j-i+1, max);
				j++;
			}
			else if(sum>k) {
				while(sum>k) {
					sum=sum-arr[i];
					i++;
				}
				j++;
			}
			
		} 
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= { 10, 5, 2, 7, 1, 9 };
        int k=15;
        System.out.print(solve(arr,k));
	}

}
