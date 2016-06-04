package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeTraversal {
	
	
	 static Node root;
	Node current;
	 
	public void levelOrderTraversal(){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			current = q.poll();
			System.out.print(current.data + " ");
			if(current.left != null){
				q.add(current.left);
			}
			if(current.right != null){
				q.add(current.right);
			}
			
			
		}
		
	}
	public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        BFSTreeTraversal tree_level = new BFSTreeTraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.levelOrderTraversal();;
    }
	

	

}
