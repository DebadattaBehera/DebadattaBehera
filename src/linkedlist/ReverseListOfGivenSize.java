package linkedlist;

public class ReverseListOfGivenSize {
	
	public Node reverseListOfGivenSize(Node node,int value) {
		Node prev =null;
		Node curr = node;
		Node next = null;
		int count =0 ;
		while(curr!=null && count<value) {
	
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		
		}
		 if (next != null)
	            node.next = reverseListOfGivenSize(next, value);
		
		return prev;
		  
		
	}

}
