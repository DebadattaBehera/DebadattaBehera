package Knapsack;

public class Knapsack {
	public static int solve(int wt[],int val[],int n,int w) {
		if(n==0 || w==0) {
			return 0;
		}
		if(wt[n-1]<=w) {
			int a = val[n-1]+solve(wt,val,n-1,w-wt[n-1]);
			int b = solve(wt,val,n-1,w);
			return Math.max(a,b);
		}
		else
		  return solve(wt,val,n-1,w);	
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
