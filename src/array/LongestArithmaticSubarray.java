package array;

public class LongestArithmaticSubarray {
	 public static void main(String args[]) {
		 int[] arr= {10,7,4,6,8,10,11};
		 int ans=2;
		 int diff=arr[1]-arr[0];
		 int curr=2;
		 int i=2;
		 while(i<arr.length) {
			 if(diff==(arr[i]-arr[i-1])) {
				 curr=curr+1;
			 }
			 else {
				 diff=arr[i]-arr[i-1];
				 curr=2;
			 }
			 ans=Math.max(ans, curr);
			 i++;
		 }
		 
		 System.out.println(ans);
		  
	 }
}
