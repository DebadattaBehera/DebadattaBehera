package recursion;

public class KthGrammer {
	
	public static int grammer(int n , int k) {
		if(k==1 && n==1) {
			return 0;
		}
		int mid = (int) (Math.pow(2, n-1)/2);
		if(k<=mid) {
			return grammer(n-1,k);
		}
		else {
			return grammer(n-1,k-mid)==0?1:0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = grammer(4,4);
		System.out.println(result);

	}

}
