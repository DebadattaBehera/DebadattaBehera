package tree;

import java.util.ArrayList;

public class RootToLeafPathsWithSum {
	 public static ArrayList<ArrayList<Integer>> result;
		public ArrayList<ArrayList<Integer>> pathSum(Node root, int sum) {
		    result = new ArrayList<ArrayList<Integer>>();
		    solve(root, sum, new ArrayList<Integer>());
		    return result;
		}
		
		public void solve(Node curr, int sum, ArrayList<Integer> path) {
	        if(curr == null){
	            return;
	        }
	         path.add(curr.data);
		    if(curr.left == null && curr.right == null && curr.data == sum) {
		        
		        result.add(new ArrayList<Integer>(path));
		        path.remove(path.size() - 1);
		        return;
		    }
		   
		    if(curr.left != null) {
		        solve(curr.left, sum - curr.data, path);
		    }
		    if(curr.right != null) {
		        solve(curr.right, sum - curr.data, path);
		    }
		    path.remove(path.size() - 1);
		}
}
