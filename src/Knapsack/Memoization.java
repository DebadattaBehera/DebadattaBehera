package Knapsack;

public class Memoization {
	
	public static int solve(int wt[],int val[],int n,int w,int[][] dp) {
		if(n==0 || w==0) {
			return 0;
		}
		if(dp[n][w]!=-1) {
			return dp[n][w];
		}
		if(wt[n-1]<=w) {
			int a = val[n-1]+solve(wt,val,n-1,w-wt[n-1],dp);
			int b = solve(wt,val,n-1,w,dp);
			return dp[n][w]=Math.max(a,b);
		}
		else
		  return dp[n][w] = solve(wt,val,n-1,w,dp);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[]= {1,3,4,5};
		int value[]= {2,4,5,6};
		int w=7;
		   // Declare the table dynamically
	    int dp[][] = new int[wt.length + 1][w + 1];
	     
	    // Loop to initially filled the
	    // table with -1
	    for(int i = 0; i < wt.length + 1; i++)  
	        for(int j = 0; j < w + 1; j++)  
	            dp[i][j] = -1; 
		int result = solve(wt,value,wt.length,w,dp);
		System.out.println(result);

	}
}
