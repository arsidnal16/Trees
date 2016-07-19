package Trees;

public class MirrorTree {
	
	private static Node root;

	public static void main(String[] args) {
		MirrorTree tree = new MirrorTree();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(2);
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(4);
	        tree.root.right.left = new Node(4);
	        tree.root.right.right = new Node(3);
	        
	        System.out.println(tree.isSymmetric(root));

	}

	private boolean isSymmetric(Node root) {
		return isMirror(root, root);
	}

	private boolean isMirror(Node root2, Node root3) {
		if(root2 == null && root3 == null){
			return true;
		}
		if(root2!= null && root3 != null && root2.data == root3.data){
			return (isMirror(root2.left, root3.right) && isMirror(root2.right, root3.left));
		}
		return false;
	}

}
