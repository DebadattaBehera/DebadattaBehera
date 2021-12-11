package array;

public class RecordBraker {
	 public static void main(String args[]) {
		 int[] arr= {1,2,0,7,2,0,2,2};
		 int ans=0;
		 int max=-1;
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]>max && arr[i]>arr[i+1]) {
				 ans++;
			 }
			 max=Math.max(max, arr[i]);
		 }
		 System.out.println(ans);
		  
	 }
}
