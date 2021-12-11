package slidingwindow;

import java.util.*;

public class OccurrenceOfAnagramOtherSol {

	static int solve(String s1,String s2,Map<Character,Integer> map) {
		
		
		int i=0;
		int j=0;
		int k=s2.length();
		int count=0;
		int mapSize=map.size();
		while(j<s1.length()) {
			if(map.containsKey(s1.charAt(j))) {
        		map.put(s1.charAt(j), map.get(s1.charAt(j))-1);
        		if(map.get(s1.charAt(j))==0) {
        			mapSize--;
        		}
        	}
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				if(mapSize==0) {
					count++;
				}
				if(map.containsKey(s1.charAt(i))) {
					map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
				}
				i++;
				j++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String s1 ="forxxrofxxofr";
	        String s2="for";
	        Map<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<s2.length();i++) {
	        	if(map.containsKey(s2.charAt(i))) {
	        		map.put(s2.charAt(i), map.get(s2.charAt(i))+1);
	        	}
	        	else {
	        		map.put(s2.charAt(i),1);
	        	}
	        }
	        System.out.print(solve(s1,s2,map));

	}

}
