package linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedListApp {

   public Node addNode(int data) {
	Node node = new Node(data);
	
	return node;
	
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedListApp linkedListApp = new LinkedListApp();
       Node node = linkedListApp.addNode(1);
       node.next = linkedListApp.addNode(2);
       node.next.next = linkedListApp.addNode(3);
       node.next.next.next = linkedListApp.addNode(4);
       node.next.next.next.next = linkedListApp.addNode(5);
       node.next.next.next.next.next= node.next; 
      // node.next.next.next.next=node.next;
       
       RemoveLoop r = new RemoveLoop();
       r.removeLoop(node);
       while(node!=null) {
    	   System.out.println(node.data+" ");
    	   node=node.next;
       }

       
	}

}
