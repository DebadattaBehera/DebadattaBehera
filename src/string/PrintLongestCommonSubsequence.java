package string;

public class PrintLongestCommonSubsequence {

	public static String solve(String x,String y,int m,int n) {
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
	    int i = m;
	    int j =n;
	    String s="";
	    while(i>0 && j>0) {
				if(x.charAt(i-1)==y.charAt(j-1)) {
					s=s+x.charAt(i-1);
					i--;
					j--;
				}
				else {
					if(t[i][j-1]>t[i-1][j]) {
						j--;
					}
					else {
						i--;
					}
				}
	    }
	    String rev = "";
	    for(int k=s.length()-1;k>=0;k--) {
	    	rev=rev+s.charAt(k);
	    }
	    return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x="abcdghr";
        String y="abedfhr";
        System.out.println(solve(x,y,x.length(),y.length()));
	}

}
