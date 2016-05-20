package com.puzzles.puzzle1;

public class InvertTree {
	
	public static void main (String args[]) {
		
	
		TreeNode root = new TreeNode (5);
		root.insert(10);
		root.insert(3);
		root.insert(4);
		root.insert(2);
		root.insert(30);
		root.insert(60);
		
		root.traversal();
		
		Solution1 sln = new Solution1();
		sln.invertTree(root);
		
		System.out.println();
		
		root.traversal();
		
	}

}


class Solution1 {
    public TreeNode invertTree(TreeNode root) {
    		
    	if(root == null)
    		return null;
    	
    	
    	
    	TreeNode tmp = root.left;
    	root.left = root.right;
    	root.right = tmp;
    	
    	
    	if(root.left!=null)
    		invertTree(root.left);
    	
    	if(root.right!=null)
    		invertTree(root.right);
    	
    	return root;
    	
    }
}