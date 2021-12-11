package tree;

class Node {
	int data;
	Node left;
	Node right;
	public Node() {}
	public Node(int data) {
		this.data=data;
		left=null;
		right=null;
	}

}

class BinaryTree {
	public Node createNode(int val) {
		Node node = new Node();
		node.data = val;
		node.left=null;
		node.right=null;
		
		return node;
	}

}

public class BinaryTreeApp{
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		Node root=b.createNode(10);
		root.left=b.createNode(2);
		root.right=b.createNode(3);
		root.left.left=b.createNode(7);
		root.left.right=b.createNode(8);
		root.right.right = b.createNode(15);
	    root.right.left = b.createNode(12);
	    root.right.right.left = b.createNode(14);

		
		FlattenTree depth = new FlattenTree();
		depth.flatten(root);
		
	}
	
}
