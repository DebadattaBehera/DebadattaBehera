package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubstring {

	static int solve(String s,Map<Character,Integer> map) {
		int i=0;
		int j=0;
		int min=0;
		int count=map.size();
		
		while(j<s.length()) {
			if(map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j))-1);
				if(map.get(s.charAt(j))==0) {
					count--;
				}
			}		
			if(count>0) {
				j++;
				
			}
			else if(count==0) {
				while(count==0) {
					if(map.get(s.charAt(j))<=0) {
						map.put(s.charAt(j), map.get(s.charAt(j))+1);
						min=Math.min(min, j-i+1);
						i++;
					}
					if(map.get(s.charAt(j))>0) {
						map.put(s.charAt(j), map.get(s.charAt(j))+1);
						count++;
						i++;
					}
				}
				j++;
			}
			
		} 
		return min;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "geeksforgeeks";
        String s2="ork";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s2.length();i++) {
        	if(map.containsKey(s2.charAt(i))) {
        		map.put(s2.charAt(i), map.get(s2.charAt(i))+1);
        	}
        	else {
        		map.put(s2.charAt(i),1);
        	}
        }
        System.out.print(solve(s1,map));
	}

}
