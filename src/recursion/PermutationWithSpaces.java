package recursion;

public class PermutationWithSpaces {

	public static void solve(String ip,String op) {
		 if(ip.length()==0) {
			 System.out.println(op);
			 return;
		 }
		 solve(ip.substring(1),op+"_"+ip.charAt(0));
		 solve(ip.substring(1),op+ip.charAt(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		String ip=s.substring(1);
		String op=""+s.charAt(0);
		solve(ip,op);

	}

}
