package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PickToysOfTypeK {
	static int solve(String s,int k) {
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
			
			if(map.size()<k) {
				j++;
				
			}
			else if(map.size()==k) {
				max=Math.max(j-i+1, max);
				j++;
			}
			else if(map.size()>k) {
				while(map.size()>k) {
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
		String s= "abaccab";
        int k=2;
        System.out.print(solve(s,k));
	}

}
