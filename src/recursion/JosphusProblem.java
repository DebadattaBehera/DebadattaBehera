package recursion;
import java.util.*;

public class JosphusProblem {
	
    public static void solve(List<Integer> list,int index,int k) {
    	if(list.size()==1) {
    		System.out.println(list.get(0));
    		return;
    	}
    	index = (index+k)%list.size();
    	list.remove(index);
    	solve(list,index,k);
    }
	public static void main(String[] args) {
		// using IBH
		//I=Induction,B=Base,H=Hypothesis
		int n=40;
		int k=7;
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		int index = 0;
		solve(list,index,k-1);
		

	}

}
