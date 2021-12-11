package tree;

import java.util.*;

public class PathToGivenNode {
	 public ArrayList<Integer> solve(Node root, int B) {
	        // ArrayList to store the path
	        ArrayList<Integer> arr=new ArrayList<>();
	     
	        // if required node 'x' is present
	        // then print the path
	        if (hasPath(root, arr, B))
	        {
	            return arr; 
	        }
	        else
	          return null;
	    }
	    public static boolean hasPath(Node root, ArrayList<Integer> arr, int x)
	    {
	        // if root is NULL
	        // there is no path
	        if (root==null)
	            return false;
	       
	        // push the node's value in 'arr'
	        arr.add(root.data);    
	       
	        // if it is the required node
	        // return true
	        if (root.data == x)    
	            return true;
	       
	        // else check whether the required node lies
	        // in the left subtree or right subtree of 
	        // the current node
	        if (hasPath(root.left, arr, x) ||
	            hasPath(root.right, arr, x))
	            return true;
	       
	        // required node does not lie either in the 
	        // left or right subtree of the current node
	        // Thus, remove current node's value from 
	        // 'arr'and then return false    
	        arr.remove(arr.size()-1);
	        return false;            
	    }
}
