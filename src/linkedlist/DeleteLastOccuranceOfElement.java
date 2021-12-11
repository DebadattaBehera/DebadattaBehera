package linkedlist;

public class DeleteLastOccuranceOfElement {
	
	public Node deleteLastOccuranceOfElement(Node node,int value) {
		Node prev =null;
		Node slow = node;
		Node fast = null;
		while(slow!=null && slow.next!=null) {
		  if(slow.data==value) {
			prev = slow;
			slow = slow.next;
			fast = slow.next;
			}
		  slow = slow.next;
		}
		prev.next = slow.next;
		return node;
		  
		
	}

}
