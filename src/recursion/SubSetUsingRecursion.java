package recursion;

public class SubSetUsingRecursion {
	
	public static void solve(String ip,String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		
		solve(ip.substring(1),op+ip.charAt(0));
		solve(ip.substring(1),op);
		
	}
	
	public static void main(String[] args) {
		solve("ABC","");
		
	}

}
