package linkedlist;

public class DeleteMAfterN {
	public Node deleteNodes(Node head1,int m,int n) {
		int mCount = 0;
		int nCount = m+n;
		Node head = head1;
		Node curr=null;
		
		while(head!=null && mCount<m) {
			   mCount++;
			   curr = head;
			   head = head.next;
			  
			   
			
		}
		while(head!=null && mCount<nCount) {
			mCount++;
			curr.next = head.next;
			head = head.next;
		}
		head1.next=curr;
		return head1;
		
	}

}
