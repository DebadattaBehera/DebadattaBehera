package tree;

public class SumRootToLeaf {
	 public int sumNumbers(Node root)
	    {
	         if(root == null)//base case for null graph 
	            return 0;
	        
	         return sum(root, 0);//sum has a cyclic dependency on the previous element 
	    }
	    public  int sum(Node root, int sum)//calculating the sum recursively 
	    {
	        if(root == null)//if we reach to null node we return zero //base case 1
	            return 0;
	        
	        sum= (sum*10) + root.data;//left shift//multiplying by 10 help us to add the value of next node on the previous node value 
	        
	        if(root.left == null && root.right == null)//when we reach the leaf node we are returning the resultant integer(all integer in the path between the leaf and root node ) for calculating the sum 
	            return sum;
	        
	        return sum(root.left, sum) + sum(root.right, sum);//recursively calculating the sum of both the half
	    }
}
