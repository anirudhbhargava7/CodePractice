package com.puzzles.puzzle1;


public class ValidAnagram {
	
	public static void main (String args[]) {
		
		
		String input1 = "racer";
		String input2 = "acer";
		
		ValidAnagram va = new ValidAnagram();
		
		System.out.println(va.isAnagram(input1, input2));
		
	}
	
	public boolean isAnagram(String s, String t) {
    
		if(s.length() != t.length())
			return false;
	
		int [] array_c = new int [256];
		
		
		
		for(int i = 0; i < s.length(); i++) {
			
			array_c[s.charAt(i) - 'a' ] += 1;
			array_c[t.charAt(i) - 'a'] -= 1;
		}
		
		for(int i = 0; i < array_c.length; i++) {
			
			
			if(array_c[i] != 0){
				
				return false;
			}
			
		}
	
		
		return true;
	}

}
