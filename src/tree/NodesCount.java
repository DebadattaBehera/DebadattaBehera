package tree;

import java.util.LinkedList;
import java.util.Queue;

public class NodesCount {
	
	public int nodesCount(Node node) {
		Queue<Node> queue = new LinkedList<>();
		int count=0;
		if(node!=null) {
			queue.add(node);
		}
		while(!queue.isEmpty()) {
			Node removeNode = queue.remove();
			count++;
			if(removeNode.left!=null) {
				queue.add(removeNode.left);
			}
			if(removeNode.right!=null) {
				queue.add(removeNode.right);
			}
		}
		
		return count;
		
	}

}
