package tree;

public class MaxDepthOfBinaryTree {
	
	public int solve(Node node) {
		if(node==null) {
			return 0;
		}
		return 1+Math.max(solve(node.left), solve(node.right));
	}

}
