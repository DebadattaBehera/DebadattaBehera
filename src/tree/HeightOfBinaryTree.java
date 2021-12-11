package tree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {
	public int heightOfBinaryTree(Node node) {
	Queue<Node> q = new LinkedList<>();
	if(node!=null) {
		q.add(node);
	}
	int height = 0;
	while(!q.isEmpty()) {
		int size = q.size();
		while(size>0) {
			Node q1 = q.remove();
			if(q1.left!=null) {
				q.add(q1.left);
			}
			if(q1.right!=null) {
				q.add(q1.right);
			}
			size--;
		}
		height++;
		
	}
	return height;
	
	}

}
