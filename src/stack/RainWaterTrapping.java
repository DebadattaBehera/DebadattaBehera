package stack;


public class RainWaterTrapping {
	static void solve(int[] arr) {
      int[] maxLeft=new int[arr.length];
      maxLeft[0]=arr[0];
      int max1=arr[0];
      for(int i=1;i<=arr.length-1;i++) {
    	  max1=Math.max(max1, arr[i]);
    	  maxLeft[i]=Math.max(max1, arr[i]);
      }
      int[] maxRight=new int[arr.length];
      maxRight[arr.length-1]=arr[arr.length-1];
      int max2=arr[arr.length-1];
      for(int i=arr.length-2;i>=0;i--) {
    	  max2=Math.max(max2, arr[i]);
    	  maxRight[i]=Math.max(max2, arr[i]);
      }
      int[] result=new int[arr.length];
      for(int i=0;i<=arr.length-1;i++) {
    	  result[i]=Math.min(maxRight[i], maxLeft[i])-arr[i];
      }
      int sum=0;
      for(int i=0;i<=arr.length-1;i++) {
    	  sum=sum+result[i];
      }
      System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 0, 0, 2,0,4};
		solve(arr);
	}

}
