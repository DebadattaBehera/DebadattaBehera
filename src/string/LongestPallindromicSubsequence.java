package string;

public class LongestPallindromicSubsequence {

	public static int solve(String x,String y,int m,int n) {
		int t[][] = new int[m+1][n+1];
		
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				if(i==0 || j==0) {
					t[i][j]=0;
				}
			}
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(x.charAt(i-1)==y.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}
				else {
					t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
				}
			}
		}
		return t[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="agbcba";
        String y="";
        for(int i=x.length()-1;i>=0;i--) {
        	y=y+x.charAt(i);
        }
        System.out.println(solve(x,y,x.length(),y.length()));

	}

}
