package twopointer;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionPoints {
    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    static void printIntersection(int arr1[], int arr2[], int m,
                           int n)
    {
    	HashSet<Integer> set=new HashSet<>();
    	 for (int i = 0; i < m; i++) {
            set.add(arr1[i]);
         }
        for (int j = 0; j < n;j++) {
            if(set.add(arr2[j])==false) {
                System.out.print(arr2[j] + " ");}
        }
    }
	 public static void main(String[] args)
	    {
	       
	        int arr1[] = { 7, 1, 5, 2, 3, 6 };
	        int arr2[] = { 3, 8, 6, 20, 7 };
	        int m = arr1.length;
	        int n = arr2.length;
	       
	     
	        System.out.println(
	            "Intersection of two arrays is ");
	        printIntersection(arr1, arr2, m, n);
	    }

}
