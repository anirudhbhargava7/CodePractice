package com.puzzles.puzzle1;

public class AddDigits {
	
	public static void main(String args [])
	{
		
		int num = 38;
		
		System.out.println(addDigits(num));
		System.out.println(addDigitsRecursive(num));
	}
	
	 public static int addDigits(int num) {
	        
	        int sum = 0;
	        
	        while(num != 0){
	            
	            sum = sum + num%10;
	            
	            num = num/10;
	            
	            if(num == 0 && sum/10 != 0){
	                
	                num = sum;
	                sum = 0;
	                
	            }
	            
	            
	        }
	        
	        return sum;
	    }
	 
	 public static int addDigitsRecursive(int num){
		 
		 if(num == 0)
			 return num;
		 
		  
		
		  while(num /10 != 0){
			  
			  num = num % 10 + addDigitsRecursive(num/10);
		    
		  }
		
		  return num;
		  
	 }
	 
}
