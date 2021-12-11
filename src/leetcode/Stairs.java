package leetcode;

public class Stairs {
	public static int solve(int n) {
		if(n<=1) {
			return 1;
		}
		
		int a = solve(n-1);
		int b = solve(n-2);
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(4));

	}

}
