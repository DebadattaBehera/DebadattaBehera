package slidingwindow;

import java.util.Arrays;

public class OccurranceOfAnagram {
	static int solve(String s1,String s2) {
		
		String temp="";
		int i=0;
		int j=0;
		int k=s2.length();
		char[] arr1=s2.toCharArray();
		Arrays.sort(arr1);
		int count=0;
		while(j<s1.length()) {
			temp=temp+s1.charAt(j);
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				char[] arr2=temp.toCharArray();
				Arrays.sort(arr2);
				if(Arrays.equals(arr1, arr2)) {
					count++;
				}
				temp=temp.substring(1);
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
	        System.out.print(solve(s1,s2));

	}

}
