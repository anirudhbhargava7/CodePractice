package com.puzzles.puzzle1;

public class ExcelSheetColumnNumber {
		
	
	
	
	
	public static void main(String args []) {
		
		
		String input = "AB";
		
		ExcelSheetColumnNumber escn =  new ExcelSheetColumnNumber();
		
		System.out.println(escn.titleToNumber(input));
		
		
		
	}
	
	public int titleToNumber(String s) {
     
		int sum = 0;
		
		int i =  s.length()-1;
		int pow = 0;
		
		
		while(i >= 0) {
			
			sum = (int) (sum + (((s.charAt(i) - 'A') + 1 ) * Math.pow(26, pow))); 
			
			pow++;
			i--;
			
		} 
		
		
		return sum;
    }
	
}
