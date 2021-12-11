package linkedlist;
import java.util.*;

public class RemoveLoop {
	public static void removeLoop(Node head) {
	    
		  HashSet<Node> set = new HashSet<>();
	        Node cur = head;
	        Node prev = null;
	        while(cur!=null) {
	            if(set.contains(cur)) {
	                prev.next = null;
	                break;
	            }
	            prev = cur;
	            set.add(cur);
	            cur = cur.next;
	            
	        }

}
}
