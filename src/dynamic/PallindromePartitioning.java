package dynamic;

public class PallindromePartitioning {
	public static boolean isPallindrome(String s ,int i ,int j) {
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static int solve(String s,int i,int j) {
		if(i>=j) {
			return 0;
		}
		if(isPallindrome(s, i, j)==true) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			int temp = solve(s,i,k)+solve(s,k+1,j)+1;
			if(temp<min) {
				min = temp;
			}
			
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "ababbbabbababa";
		System.out.println(solve(s,0,s.length()-1));

	}

}
