package tree;

import java.util.*;

public class ZigZagLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node root) {
		Node c = root;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		if (c == null)
			return ans;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			while (!s1.isEmpty()) {
				c = s1.pop();
				tmp.add(c.data);
				if (c.left != null)
					s2.push(c.left);
				if (c.right != null)
					s2.push(c.right);
			}
			ans.add(tmp);
			tmp = new ArrayList<Integer>();
			while (!s2.isEmpty()) {
				c = s2.pop();
				tmp.add(c.data);
				if (c.right != null)
					s1.push(c.right);
				if (c.left != null)
					s1.push(c.left);
			}
			if (!tmp.isEmpty())
				ans.add(tmp);
		}
		return ans;
	}
}
