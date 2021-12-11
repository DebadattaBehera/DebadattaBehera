package tree;

import java.util.ArrayList;

public class MakeTreeFromPreInorder {
	static int pIndex=0;
	public Node buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
	    
	    int len = inorder.size();
	    pIndex = 0;
	    return createTree(0, len-1, inorder, preorder);
	}
	
	public Node createTree(int start, int end, ArrayList<Integer> inorder, ArrayList<Integer> preorder){
	    
	    if(start > end)
	        return null;
	    BinaryTree b = new BinaryTree();
	    Node node = b.createNode(preorder.get(pIndex++));
	    if(start == end)
	        return node;
	        
	    int inIndex = search(node.data, inorder, start, end);
	    
	    node.left = createTree(start, inIndex-1, inorder, preorder);
	    node.right = createTree(inIndex+1, end, inorder, preorder);
	    
	    return node;
	}
	
	public int search(int num, ArrayList<Integer> inorder, int start, int end){
	    int i;
	    for(i = start; i< end; i++){
	        if(inorder.get(i) == num)
	            return i;
	    }
	    return i;
	}

}
