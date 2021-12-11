package linkedlist;

import java.util.Stack;

public class Pallindrome {
	 void pallindrome(Node head)
	    {
	    	// Your code here
	    	Stack<Node> s = new Stack<>();
	    	Node head1=head;
	    	while(head1!=null){
	    	    s.push(head1);
	    	    head1=head1.next;
	    	}
	    	boolean flag = true;
	        while(head!=null) {
	        	Node n = s.pop();
	        	if(head.data!=n.data) {
	        		flag =false;
	        		break;
	        	}
	        	head=head.next;
	        }
	        if(flag) {
	        	System.out.println("pallindrome");
	        }
	        else {
	        	System.out.println("not pallindrome");
	        }
	    }
}
