package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	static int solve(String s) {
		int i=0;
		int j=0;
		int sum=0;
		int max=0;
		Map<Character,Integer> map=new HashMap<>();
		
		while(j<s.length()) {
			if(map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j))+1);
			}
			else {
				map.put(s.charAt(j), 1);
			}
			
			if(map.get(s.charAt(j))==1) {
				max=Math.max(j-i+1, max);
				j++;
			}
			else if(map.get(s.charAt(j))>1) {
				while(map.get(s.charAt(j))>1) {
					int value = map.get(s.charAt(i))-1;
					map.put(s.charAt(i), value);
					if(value==0) {
						map.remove(s.charAt(i));
					}
					i++;
				}
				j++;
			}
			
		} 
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "GEEKSFORGEEKS";
        System.out.print(solve(s));
	}

}
