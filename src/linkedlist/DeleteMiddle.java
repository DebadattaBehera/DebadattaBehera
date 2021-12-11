package linkedlist;

public class DeleteMiddle {
	
	public Node deleteMiddle(Node node) {
		Node prev =null;
		Node slow = node;
		Node fast = node;
		while(slow!=null && fast!=null && fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		return node;
		
	  
		
	}

}
