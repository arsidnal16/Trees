package Trees;

import java.util.Stack;

public class KthSmallestElement {
	
	static Node root;
	int lcount;
	
	public void insert(int element){
		root = insert(root, element);
		}
	
	public Node insert(Node root, int element){ // A function to insert a new key in Binary search tree(BST)
		
		if(root == null ){
			root = new Node(element); // If the tree is empty return a new node
			//System.out.println("The root inserted is " + root.data );
			return root;
			
		}
		else{
			if (element < root.data){  
				lcount++;
				root.left = insert(root.left, element); //recurse the left subtree
			}
			else{
				root.right =insert(root.right, element); // recurse the right subrtree
			}
		}
		return root;
		
	}
	
	public static int kthSmall(Node node, int element){
		Stack<Node>  s = new Stack<Node>();
		Node current = node;
		int result = 0;
		
		while(!s.isEmpty()|| current!=null){
			if(current!= null){
				s.push(current);
				current= current.left;
			}
			else{
				Node top = s.pop();
				element--;
				if(element ==0){
					result = top.data;
				}
				current = top.right;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
       KthSmallestElement tree = new KthSmallestElement();
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        
        int k = kthSmall(tree.root, 6);
        System.out.println("The kth smallest element is "+k);
        
	}

}
