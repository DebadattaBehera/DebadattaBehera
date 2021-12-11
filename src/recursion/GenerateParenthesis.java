package recursion;
import java.util.*;

public class GenerateParenthesis {
	
	public Set<String> method(int input){
		Set<String> set = new HashSet<>();
		int open = input;
		int close = input;
		String op = "";
		solve(open,close,op,set);
		return set;
		
	}
	public void solve(int open,int close,String op,Set<String> set){
		if(open==0 && close==0) {
			set.add(op);
			return;
		}
		if(open!=0) {
			solve(open-1,close,op+"(",set);
		}
		if(close>open) {
			solve(open,close-1,op+")",set);
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GenerateParenthesis g = new GenerateParenthesis();
        Set<String> set = g.method(3);
        for(String v :set) {
        	System.out.println(v);
        }
	}

}
