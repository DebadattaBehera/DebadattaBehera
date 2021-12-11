package tree;

public class LeftView {
	
	public void leftView(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		leftView(node.left);
	}

}
