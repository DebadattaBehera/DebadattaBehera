package tree;

public class IdenticalTreesRecursion {
	public boolean valid(Node n1,Node n2) {
		if(n1==null && n2==null) {
			return true;
		}
		if(n1==null || n2==null)
			return false;
		else {
			boolean b1=n1.data==n2.data;
			boolean b2=valid(n1.left,n2.left);
			boolean b3=valid(n1.right,n2.right);
			if(b1 && b2 && b3)
				return true;
		}
		return false;
	}

}
