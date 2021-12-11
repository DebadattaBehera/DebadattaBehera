package tree;

public class FlattenTree {
	public Node flatten(Node A) {
	       flattens(A);
	       return A;
		}
	    void flattens(Node root){
	        if(root==null || (root.left==null && root.right==null)){
	            return;
	        }
	        if(root.left!=null){
	            flattens(root.left);
	            Node temp=root.right;
	            root.right=root.left;
	            root.left=null;
	            Node t=root.right;
	            while(t.right!=null){
	                t=t.right;
	            }
	            t.right=temp;
	        }
	        flattens(root.right);
	        return;
	    }
}
