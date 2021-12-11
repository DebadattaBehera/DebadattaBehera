package tree;

import java.util.*;

public class PrintCousins {
	int result;
	public void level(Node root,int node_to_find) {
		    Queue<Node> q = new LinkedList<Node>();
		    boolean found = false;
		    int size_ = 0;
		    Node p = null;
		    q.add(root);
		 
		    // the following loop runs
		    // until found is not true,
		    // or q is not empty. if
		    // found has become true => we
		    // have found the level in
		    // which the node is present
		    // and the present queue will
		    // contain all the cousins of
		    // that node
		    while (!q.isEmpty() &&
		                 found == false)
		    {
		 
		        size_ = q.size();
		        while (size_ -- > 0)
		        {
		            p = q.peek();
		            q.remove();
		 
		            // if current node's left
		            // or right child is the
		            // same as the node to find,
		            // then make found = true,
		            // and don't push any of them
		            // into the queue, as we don't
		            // have to print the siblings
		            if ((p.left.data == node_to_find ||
		                 p.right.data == node_to_find))
		            {
		                found = true;
		            }
		            else
		            {
		                if (p.left != null)
		                    q.add(p.left);
		                if (p.right!= null)
		                    q.add(p.right);
		            }
		 
		        }
		    }
		 
		    // if found == true then the
		    // queue will contain the
		    // cousins of the given node
		    if (found == true)
		    {
		        System.out.print("Cousin Nodes : ");
		        size_ = q.size();
		 
		        // size_ will be 0 when
		        // the node was at the
		        // level just below the
		        // root node.
		        if (size_ == 0)
		            System.out.print("None");
		         
		        for (int i = 0; i < size_; i++)
		        {
		            p = q.peek();
		            q.poll();
		             
		            System.out.print(p.data + " ");
		        }
		    }
		    else
		    {
		        System.out.print("Node not found");
		    }
		     
		    System.out.println("");
		    return;
	}

}
