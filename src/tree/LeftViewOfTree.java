package tree;

public class LeftViewOfTree {
	int maxLevel;

	public void leftView(Node node,int level) {
		if(node== null) {
			return;
		}
		if(level>=maxLevel) {
			System.out.print(node.data+" ");
			maxLevel++;
		}
		leftView(node.left,level+1);
		leftView(node.right,level+1);
		
	}

}
