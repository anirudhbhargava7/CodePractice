package com.puzzles.puzzle1;

public class ListNode {
	
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
	}
	
	public ListNode insertNode (int data, ListNode root) {
		
		if (root == null)
			root = new ListNode(data);
		
		ListNode newNode = new ListNode(data);
		
		ListNode tmp = root;
		
		while(tmp.next!=null)
		{
			
			tmp = tmp.next;
		}
		
		tmp.next = newNode;
		
		
		return root;
	}
	
	
	public void traverseList (ListNode root) {
		
		
		while(root!=null)
		{
			System.out.print(root.val+"->");
			root = root.next;
		}
		
	}
	
	public void deleteNode (ListNode node) {
		
		if(node == null)
		{
			return;
		}
		
		
		node.val = node.next.val;
		node.next = node.next.next;
		
	}
	
}
