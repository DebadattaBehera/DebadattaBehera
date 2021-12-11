package unboundedknapsack;

public class CoinChangeProblem1 {
	  
	public static int solve(int arr[],int n,int sum) {
		if(sum==0) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		if(arr[n-1]<=sum) {
			return solve(arr,n,sum-arr[n-1])+solve(arr,n-1,sum);
		}
		else {
			return solve(arr,n-1,sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,3,6};
		int sum = 10;
		System.out.println(solve(arr,arr.length,sum));
		
		

	}

}
