package Knapsack;

public class SubsetSum {

	public static boolean solve(int arr[],int n,int sum) {
		
		boolean[][] t = new boolean[n+1][sum+1];
		for(int i =0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0) {
					t[i][j]=false;
				}
				else if(j==0) {
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
        return t[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,8};
		int sum=11;
		boolean result = solve(arr,arr.length,sum);
		System.out.println(result);

	}

}
