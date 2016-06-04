package Trees;

import java.util.Stack;

public class InorderTraversalUsingStack {
	
	Node root, current;
	
	public void inOrder(){
		
		if(root == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		current = root;
		
		while(current!=null){
			s.push(current);
			current = current.left;
		}
		while(s.size() > 0){
			current = s.pop(); 
			System.out.println(current.data+ " ");
			if(current.right != null){
				current = current.right;
				while(current != null){
					s.push(current);
					current = current.left;
				}
			}
		}
		
		
	}

	public static void main(String args[]) 
    {
    
    /* creating a binary tree and entering 
     the nodes */
    InorderTraversalUsingStack tree = new InorderTraversalUsingStack();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.inOrder();
}
}

