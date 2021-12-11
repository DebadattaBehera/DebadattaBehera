package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubstringLength {
	static int solve(String s1,String s2) {
		int i=0;
		int j=0;
		int sum=0;
		
		Map<Character,Integer> map=new HashMap<>();
		for(int k=0;k<s2.length();k++) {
		 if(map.containsKey(s2.charAt(k))) {
			map.put(s2.charAt(k), map.get(s2.charAt(k))+1);
		}
		 else {
			map.put(s2.charAt(k), 1);
		}
		}
		int count=map.size();
		
		while(j<s1.length()) {
			if(map.containsKey(s1.charAt(j))) {
				int value=map.get(s1.charAt(j))-1;
				map.put(s1.charAt(j), value);
				if(count==0) {
					
				}
			}
			else {
				j++;
			}	
		} 
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "zaaskzaa";
        String s2="zsk";
        System.out.print(solve(s1,s2));
	}

}
