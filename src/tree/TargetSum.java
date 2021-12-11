package tree;

public class TargetSum {
	 public boolean hasPathSum(Node root, int targetSum) {
		    //if don't have this node,just return false
		    if (root == null) {
		      return false;
		    }
		    //judge this node value whether equals to the target number
		    if (root.left == null && root.right == null) {
		      return targetSum == root.data;
		    }
		    //recursion this function,find target number minus this node value
		    return hasPathSum(root.left, targetSum - root.data) || hasPathSum(root.right,
		        targetSum - root.data);
		  }
}
