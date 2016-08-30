package Trees;

public class IsBST {
	
	// A program to find out if the given tree is a binary search tree.
	
	Node root;
	Node previous = null;
	public boolean isBST(Node root){ // A function to check if tree is BST, returns true if tree is BST
		// An empty tree is a BST
		
		// traaverse the tree in inorder and keep a track of previous node
		if(root!=null){
			if(!isBST(root.left)){
				return false;
			}
			// allows only distinct values node
			if(previous != null && root.data <= previous.data){
				return false;
			}
			previous = root;
			return isBST(root.right);
		}
		return true;
	}
	
	public static void main(String args[])
    {
        IsBST tree = new IsBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST(tree.root))
            System.out.println("It is a binary search tree");
        else
            System.out.println("It is not a binary search tree");
    }
}


