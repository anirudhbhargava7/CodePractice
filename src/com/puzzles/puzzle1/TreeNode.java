package com.puzzles.puzzle1;

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    
    
   
    public void insert (int val) {
    	
    	TreeNode newNode = new TreeNode(val);
    	
    	insert(this, newNode);
    }
    
    
    
    private TreeNode insert (TreeNode root, TreeNode node) {
   	 
   	 TreeNode tmp = root;
   	 
   	 
   	 while(tmp!=null)
   	 {
	    	 if (tmp.val > node.val) {
	    		 
	    		 if(tmp.left != null)
	    			 tmp = tmp.left;
	    		 else{
	    			 tmp.left = node;
	    			 break;
	    		 }
	    	 }
	    	 
	    	 else {
	    		 if(tmp.right != null){
	    			 tmp = tmp.right;
	    		 }
	    		 else{
	    			 tmp.right = node;
	    			 break;
	    		 }
	    	 }
   	 }
   	 
   	 
   	 return root;
    }
    
    
    
    public void traversal () {
   	 
    	traverseNodes (this);
    	
    	System.out.println("\n\n"+"------------------------");
   	
    }
    
    private void traverseNodes (TreeNode node) {
    
    	if(node.left!=null)	 
      		 traverseNodes (node.left);
      	
      	System.out.print(" "+node.val+" ");	 
      	
       
      	if(node.right != null)
      		traverseNodes (node.right);
    	
    	
    }
   	 
 }