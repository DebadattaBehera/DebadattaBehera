package recursion;

import java.util.HashSet;
import java.util.Set;

public class NbitBinaryNumbers {

	public Set<String> method(int input){
		Set<String> s = new HashSet<>();
		int one = 0;
		int zero = 0;
		String op = "";
		solve(input,one,zero,op,s);
		return s;
		
	}
	public void solve(int n,int one,int zero,String op,Set<String> s){
		if(n==0) {
			s.add(op);
			return;
		}
		
		solve(n-1,one+1,zero,op+"1",s);
		if(one>zero) {
			solve(n-1,one,zero+1,op+"0",s);
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NbitBinaryNumbers g = new NbitBinaryNumbers();
        Set<String> s = g.method(3);
        for(String v :s) {
        	System.out.println(v);
        }
	}

}
