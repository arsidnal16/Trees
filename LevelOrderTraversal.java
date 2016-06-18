package Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


//Java program to connect nodes at same level using extended
//pre-order traversal

//A binary tree node
class TreeNode {

 int data;
 TreeNode left, right;

 TreeNode(int item) {
     data = item;
     left = right = null;
    
 }
}

class LevelOrderTraversal {
	
	public static TreeNode root;
	int count;
	public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
       LevelOrderTraversal tree_level = new LevelOrderTraversal();
        tree_level.root = new TreeNode(1);
        tree_level.root.left = new TreeNode(2);
        tree_level.root.right = new TreeNode(3);
        tree_level.root.left.left = new TreeNode(4);
        tree_level.root.left.right = new TreeNode(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
       
    }

	public void printLevelOrder() {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			Iterator<TreeNode> iter = q.iterator();
			while(iter.hasNext()){
				TreeNode temp = q.poll();
				System.out.print(temp.data+ " ");
				if(temp.left != null){
					nextLevel.add(temp.left);
				}
				if(temp.right != null){
					nextLevel.add(temp.right);
				}
		}
		System.out.println();
		q = nextLevel;
		nextLevel = new LinkedList<TreeNode>();
	}
	
}
}
