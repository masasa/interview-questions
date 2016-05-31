public Node mirrorBinaryTree(Node t){
	
	// check if we have an empty tree
	if(t == null) return null;

	// other wise mirror every subtree and then swap them
	t.left = mirrorBinaryTree(t.left);
	t.right = mirrorBinaryTree(t.right);

	// swapping the left and right subtrees
	Node holder = t.left;
	t.left = t.right;
	t.right = holder;

	return t;
}