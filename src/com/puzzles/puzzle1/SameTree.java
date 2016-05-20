package com.puzzles.puzzle1;

public class SameTree {
	
	public static void main (String args[]){
		
		
		TreeNode p = new TreeNode (5);
		p.insert(10);
		p.insert(3);
		p.insert(4);
		p.insert(2);
		p.insert(30);
		p.insert(60);
		
		
		TreeNode q = new TreeNode (5);
		q.insert(10);
		q.insert(3);
		q.insert(4);
		q.insert(2);
		q.insert(30);
		q.insert(60);
		
		
		Solution3 sln = new Solution3();
		
		System.out.println(sln.isSameTree(p, q));
		
		
	}
	
	
}


class Solution3 {
	
	
	public boolean isSameTree(TreeNode p , TreeNode q){
		
		if(p == null || q == null){
			
			if(p == null && q == null)
				return true;
			else 
				return false;
			
		}
			
		
		
		
		if(p.val == q.val) {
			
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
			
		}
		
		
		return false;
	}
	
}