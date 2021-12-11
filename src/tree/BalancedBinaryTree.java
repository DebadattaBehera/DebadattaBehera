package tree;

public class BalancedBinaryTree {
	 public int isBalanced(Node A) {
	        return traverse(A)==-1 ? 0 : 1;
	    }
	    
	    public int traverse(Node root) {
	        if(root==null) return 0;
	        int depthLeft = traverse(root.left);
	        int depthRight = traverse(root.right);
	        if(depthLeft==-1 || depthRight==-1) return -1;
	        
	        if(Math.abs(depthLeft-depthRight)>1) return -1;
	        
	        return Math.max(depthLeft,depthRight)+1;
	    }
}
