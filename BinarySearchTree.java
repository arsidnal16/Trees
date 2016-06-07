package Trees;

/*
 * Searching in a binary search tree and inserting elements in it
 * 
 * 
 */

public class BinarySearchTree {
	
	Node root;
	
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insert(int element){
		root = insert(root, element);
		}
	
	public Node insert(Node root, int element){ // A function to insert a new key in Binary search tree(BST)
		
		if(root == null ){
			root = new Node(element); // If the tree is empty return a new node
			System.out.println("The root inserted is " + root.data );
			return root;
			
		}
		else{
			if (element < root.data){  
				root.left = insert(root.left, element); //recurse the left subtree
			}
			else{
				root.right =insert(root.right, element); // recurse the right subrtree
			}
		}
		return root;
		
	}
	public Node search(Node root, int element){  // A recursive function to search a given key in BST
		//System.out.println("Searching for element "+ element);
		//System.out.println(root.data);
		try{
			if(root == null || root.data == element){
				System.out.println("The searched element "+ root.data +" is present inside the tree" );
				return root;
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
			System.out.println("The element " + element+ " is not present inside the tree");
			return root;
			
		}
	}

	public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.search(tree.root, 60);
        tree.search(tree.root, 45);
       // System.out.println(tree.root.data);
	}
}
