package twopointer;

import java.util.*;

public class IntersectionOfTwoSortedArrays {

    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    static void printIntersection(int arr1[], int arr2[], int m,
                           int n)
    {
       
 
        // Now arr1[] is smaller
        // Sort smaller array arr1[0..m-1]
        Arrays.sort(arr1);
 
        // Search every element of bigger array in smaller
        // array and print the element if found
        for (int i = 0; i < n; i++) {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1)
                System.out.print(arr2[i] + " ");
        }
    }
 
    // A recursive binary search function. It returns
    // location of x in given array arr[l..r] is present,
    // otherwise -1
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present in
        // array
        return -1;
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