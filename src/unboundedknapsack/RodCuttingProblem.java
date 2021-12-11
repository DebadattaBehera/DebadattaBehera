package unboundedknapsack;

public class RodCuttingProblem {
	public static int solve(int length[],int price[],int n,int N) {
		
		int[][] t = new int[n+1][N+1];
		for(int i =0;i<n+1;i++) {
			for(int j=0;j<N+1;j++) {
				if(i==0 || j==0) {
					t[i][j]=0;
				}
				else if(length[i-1]<=j) {
					t[i][j]=Math.max(price[i-1]+t[i][j-length[i-1]],t[i-1][j]);
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
        return t[n][N];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int length[]={1,2,3,4,5,6,7,8};
        int prices[]={1,5,8,9,10,17,17,20};
        int N=8;
        System.out.println(solve(length,prices,N,N));
        
	}

}
