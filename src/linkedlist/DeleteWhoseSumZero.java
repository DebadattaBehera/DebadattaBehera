package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DeleteWhoseSumZero {
	public Node deleteSumZero(Node node) {
		Map<Integer,Node> map = new HashMap<>();
		Node dummy  = new Node(0);
        dummy.next=node;
        map.put(0,dummy);
        int sum=0;
        
		while(node!=null) {
			sum = sum+node.data;
			if(map.containsKey(sum)) {
				Node old = map.get(sum).next;
				int innerSum=sum;
				
				while(old!=node) {
					innerSum=innerSum+old.data;
					map.remove(innerSum);
					old=old.next;
				}
				map.get(sum).next=node.next;
			}
			else {
				map.put(sum, node);
			}
			node=node.next;
			
		}
	
		return dummy.next;
		
	}

}
