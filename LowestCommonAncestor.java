package Trees;

public class LowestCommonAncestor {
	
	//lowest common ancestor (LCA) of two nodes 'i' and 'j' in a tree is the lowest node that has both 'i' and 'j' as descendants.
	//Each node is considered descendant of itself .
	
	
	Node root;
	
	
	private static Node ancestorNode(Node node, int i, int j) {
		
		if(node == null){
			return null;
			}
		if(search(node,i) && search(node,j)){  // check if the elements are present inside the BST
		
		if(node.data > i && node.data > j){
			return ancestorNode(node.left, i, j) ;  //if both i and j are smaller, then the common ancestor lies in the left
			}
		
		if(node.data < i && node.data < j){
			return ancestorNode(node.right, i, j) ;  //if both i and j are smaller, then the common ancestor lies in the right
			}
		}
	return node;
	}
	
	
	
	public static boolean search(Node root, int element){  // A recursive function to search a given key in BST
		try{
			if(root == null || root.data == element){
				//System.out.println("The searched element "+ root.data +" is present inside the tree" );
				return true;
				}
			else{
				if(root.data > element){ // If element is less than root, recurse the left subtree
					return search(root.left, element);
				}
				else{
					return search(root.right, element); // else the element is greater than right subtree, so recurse the right subtree
		  	}
			
		}}
	catch(Exception e){
			//System.out.println("The element " + element+ " is not present inside the tree");
			return false;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		 
        // Let us construct the BST shown in the above figure
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
	
        Node an1 = ancestorNode(tree.root, 22, 8);
        System.out.println("The lowest common ancestor of 22 and 8 is "+an1.data);
        Node an2 = ancestorNode(tree.root, 14, 8);
        System.out.println("The lowest common ancestor of 14 and 8 is "+an2.data);
	}

	
}
