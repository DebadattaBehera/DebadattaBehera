package linkedlist;

import java.util.Stack;

public class RemoveElementFromLast {
	 int getNthFromLast(Node head, int n)
	    {
	    	// Your code here
	    	Stack<Node> s = new Stack<>();
	    	while(head!=null){
	    	    s.push(head);
	    	    head=head.next;
	    	}
	    	int count = 0;
	    	
	    	while(s.size()>0){
	    	    count++;
	    	    
	    	    if(count==n)
	    	     return s.pop().data;
	    	   
	    	     s.pop();
	    	}
	    	return 0;
	    }
}
