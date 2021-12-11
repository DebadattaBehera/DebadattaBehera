package Knapsack;

public class TopDownApproach {

	public static int solve(int wt[],int val[],int n,int w) {
		
		int[][] t = new int[n+1][w+1];
		for(int i =0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0 || j==0) {
					t[i][j]=0;
				}
				else if(wt[i-1]<=j) {
					t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
        return t[n][w];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[]= {1,3,4,5};
		int value[]= {2,4,5,6};
		int w=7;
		int result = solve(wt,value,wt.length,w);
		System.out.println(result);

	}

}
