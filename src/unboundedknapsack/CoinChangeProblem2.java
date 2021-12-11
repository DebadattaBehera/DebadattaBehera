package unboundedknapsack;

public class CoinChangeProblem2 {

	public static int solve(int coins[],int n,int sum) {
		
		int[][] t = new int[n+1][sum+1];
		for(int j=0;j<sum+1;j++) {
			t[0][j]=Integer.MAX_VALUE-1;
		}
		for(int i=1;i<n+1;i++) {
			t[i][0]=0;
		}
		
		for(int j=1;j<sum+1;j++) {
			if(j%coins[0]==0) 
			{
				t[1][j]=j/coins[0];
			}
			else {
				t[1][j]=Integer.MAX_VALUE-1;
			}
		}
		for(int i =2;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
			    if(coins[i-1]<=j) {
					t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
        return t[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[]= {1,2,3};
		int sum=5;
		int result = solve(coins,coins.length,sum);
		System.out.println(result);

	}

}
