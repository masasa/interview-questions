public class NetworkTransferBinaryTree{
	
	// global counting index of the array
	public static int index;

	public ArrayList<Integer> foldTree(Node root){
		index = 0;

		// creating array to hold the tree data
		ArrayList<Integer> nodes = new ArrayList<>();

		// writing the data to the array
		writeNodesToArray(root, nodes);

		return nodes;
	}


	public Node unfoldTree(ArrayList<Integer> nodes){
		index = 0;
		// creating the tree and returning pointer to it's root
		return readNodesFromArray(nodes);
	}

	public void writeNodesToArray(Node root, ArrayList<Integer> nodes){
		
		// if root is null so we put a special symbol stating it's null (I choose -1)
		if(root == null){
			nodes.add(index, -1);
			index++;
		}else{
			nodes.add(index,root.value);
			index++;
			// iterating in pre-order to my children
			writeNodesToArray(root.left, nodes);
			writeNodesToArray(root.right, nodes);
		}
	} 

	public Node readNodesFromArray(ArrayList<Integer> nodes){
		if(nodes.get(index) == -1){ // null
			index++;
			return null;
		}

		Node n = new Node(nodes.get(index));
		index++;
		n.left = readNodesFromArray(nodes);
		n.right = readNodesFromArray(nodes);

		// return the nodes we builed
		return n;
	}
}