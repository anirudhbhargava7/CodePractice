package com.puzzles.puzzle1;


public class MaxDepthBinaryTree {

	public static void main (String args[]) {
			
		TreeNode root = new TreeNode (5);
		root.insert(10);
		root.insert(3);
		root.insert(4);
		root.insert(2);
		root.insert(30);
		root.insert(60);
		
	
		root.traversal();
		
		Solution sln = new Solution();
		System.out.println(sln.maxDepth(root));
	}
}

 
class Solution {
    public int maxDepth(TreeNode root) {
    	
    	if(root.left == null && root.right == null)
    		return 1;
    	
    	int leftCount = 0;
    	int rightCount = 0;
    	
    	if(root.left != null)
    		leftCount = depthOfTree(root.left, leftCount + 1);
    	
    	if(root.right != null)
    		rightCount = depthOfTree(root.right, rightCount + 1);
    	
    	if(leftCount >= rightCount)
    		return leftCount;
    	else 
    		return rightCount;
    }
    
    public int depthOfTree(TreeNode node, int count){
    	
    	int leftC = count;
    	int rightC = count;
    	
    	if(node.left != null)
    		leftC = depthOfTree (node.left, leftC + 1);
    	
    	if(node.right != null)
    		rightC = depthOfTree (node.right, rightC + 1);
    	
    	if(leftC >= rightC)
    		return leftC;
    	else 
    		return rightC;
    }
    
}
