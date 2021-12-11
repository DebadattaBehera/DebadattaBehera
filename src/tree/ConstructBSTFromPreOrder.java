package tree;

class Index {

	int index = 0;
}

public class ConstructBSTFromPreOrder {
	Node constructTreeUtil(int pre[], Index preIndex, int key, int min, int max, int size) {

        // Base case
		if (preIndex.index >= size) {
			return null;
		}

		Node root = null;

        // If current element of pre[] is in range, then
       // only it is part of current subtree
		if (key > min && key < max) {

// Allocate memory for root of this
// subtree and increment *preIndex
			root = new Node(key);
			preIndex.index = preIndex.index + 1;

			if (preIndex.index < size) {

				// Construct the subtree under root
				// All nodes which are in range {min .. key}
				// will go in left subtree, and first such
				// node will be root of left subtree.
				root.left = constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size);
			}
			if (preIndex.index < size) {
				// All nodes which are in range {key..max}
				// will go in right subtree, and first such
				// node will be root of right subtree.
				root.right = constructTreeUtil(pre, preIndex, pre[preIndex.index], key, max, size);
			}
		}

		return root;
	}
}
