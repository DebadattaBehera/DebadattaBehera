package string;

import java.util.Scanner;

public class Substring {
	   public static void main(String[] args)
	    {
	        String str = "AAB";
	        int n = str.length();
	        solve(str,"");
	    }
	 
	   public static void solve(String str,String ans) {
			  // If string is empty
	        if (str.length() == 0) {
	            System.out.println(ans);
	            return;
	        }
	  
	        for (int i = 0; i < str.length(); i++) {
	  
	            // ith character of str
	            char ch = str.charAt(i);
	  
	            // Rest of the string after excluding 
	            // the ith character
	            String ros = str.substring(0, i) + 
	                         str.substring(i + 1);
	  
	            // Recurvise call
	            solve(ros, ans + ch);
	        }
			
		}
}
