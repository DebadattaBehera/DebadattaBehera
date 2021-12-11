package tree;

public class SyemmetricalTrees {
	   public int isSymmetric(Node A) {
	        return solve(A.left,A.right);
	    }
	    int solve(Node t1,Node t2){
	        if(t1==null && t2==null){
	            return 1;
	        }
	        if(t1!=null && t2!=null && t1.data==t2.data){
	            return solve(t1.left,t2.right) & solve(t1.right,t2.left);
	        }
	        return 0;
	    }
	   
}
