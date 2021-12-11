package Knapsack;

public class MinimumSubsetSumDiff {

	public static int solve(int arr[],int n,int sum) {
		int range =sum;
		sum=sum/2;
		boolean[][] t=new boolean[n+1][sum+1];
		for(int i =0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0 && j==0) {
					t[i][j]=true;
				}
				else if(i==0 && j>0) {
					t[i][j]=false;
				}
				else if(j==0 && i>0) {
					t[i][j]=true;
				}
				else if(arr[i-1]<=j) {
					t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		// Initialize difference of two sums.
        int diff = Integer.MIN_VALUE;
         
        // Find the largest j such that dp[n][j]
        // is true where j loops from sum/2 t0 0
        for (int j = sum; j >= 0; j--)
        {
            // Find the
            if (t[n][j] == true)
            {
                diff = range - 2 * j;
                break;
            }
        }
        return diff;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int result = solve(arr,arr.length,sum);
		System.out.println(result);

	}

}

