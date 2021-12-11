package recursion;

public class PermutationCaseChange {
	public static void solve(String ip,String op) {
		 if(ip.length()==0) {
			 System.out.println(op);
			 return;
		 }
		 solve(ip.substring(1),op+Character.toUpperCase(ip.charAt(0)));
		 solve(ip.substring(1),op+ip.charAt(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve("ab","");

	}

}
