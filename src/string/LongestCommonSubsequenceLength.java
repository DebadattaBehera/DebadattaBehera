package string;

public class LongestCommonSubsequenceLength {
	
	public static int solve(String x,String y,int m,int n) {
		if(m==0 || n==0) {
			return 0;
		}
		if(x.charAt(m-1)==y.charAt(n-1)) {
			return 1+solve(x,y,m-1,n-1);
		}
		else {
			return Math.max(solve(x,y,m,n-1),solve(x,y,m-1,n));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x="abcdgh";
        String y="abedfhr";
        System.out.println(solve(x,y,x.length(),y.length()));
	}

}
