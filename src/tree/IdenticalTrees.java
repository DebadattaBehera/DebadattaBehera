package tree;

import java.util.Stack;

public class IdenticalTrees {
	 public int isSameTree(Node A, Node B) {
	        Stack<Node> q1=new Stack<>();
	        Stack<Node> q2=new Stack<>();
	        q1.add(A);
	        q2.add(B);
	        int flag=1;
	        if((!q1.isEmpty() && q2.isEmpty()) || (q1.isEmpty() && !q2.isEmpty()))
	           flag=0;
	       
	        while(!q1.isEmpty() && !q2.isEmpty()){
	              if(q1.isEmpty() || q2.isEmpty()){
	                flag=0;
	                break;
	            }
	              Node n1=q1.pop();
	              Node n2 =q2.pop();

	            if(n1!=null && n2!=null){
	               if(n1.data!=n2.data){
	                flag=0;
	                break;
	            }
	             if(n1.left!=null)
	              q1.add(n1.left);
	            if(n1.right!=null)
	              q1.add(n1.right);
	            if(n2.left!=null)
	              q2.add(n2.left);
	            if(n2.right!=null)
	              q2.add(n2.right);
	            }
	           
	          
	        }
	        if(!q1.isEmpty() || !q2.isEmpty()){
	           return 0;
	        }
	        return flag;
	 }
}
