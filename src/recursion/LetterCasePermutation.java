package recursion;

import java.util.*;


public class LetterCasePermutation {

	public void solve(String ip,String op,List<String> s) {
		 if(ip.length()==0) {
			 s.add(op);
			 return;
		 }
		 if(!Character.isDigit(ip.charAt(0))) {
		   solve(ip.substring(1),op+Character.toUpperCase(ip.charAt(0)),s);
		   solve(ip.substring(1),op+Character.toLowerCase(ip.charAt(0)),s);
		 }
		 else {
			 solve(ip.substring(1),op+ip.charAt(0),s); 
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCasePermutation l= new LetterCasePermutation();
		List<String> s= new ArrayList<>();
		l.solve("a1B2","",s);
		for(String v:s) {
			System.out.println(v);
			
		}

	}

}
