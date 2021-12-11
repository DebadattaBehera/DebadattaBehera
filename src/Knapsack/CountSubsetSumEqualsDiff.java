package Knapsack;

public class CountSubsetSumEqualsDiff {

	public static int solve(int arr[],int n,int sum) {
		
		int[][] t = new int[n+1][sum+1];
		for(int i =0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0 && j==0) {
					t[i][j]=1;
				}
				else if(i==0 && j>0) {
					t[i][j]=0;
				}
				else if(j==0 && i>0) {
					t[i][j]=1;
				}
				else if(arr[i-1]<=j) {
					t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j];
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
		int arr[]= {1,1,2,3};
		int diff =1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int s1 =diff+sum/2;
		int result = solve(arr,arr.length,s1);
		System.out.println(result);

	}

}
