package com.puzzles.puzzle1;

public class MoveZeroes {
	
	public static void main(String args[]) {
		
		
		int [] input = {1,0};
		
		Solution2 sln = new Solution2();
		
		sln.moveZeroes2(input);
		
		for (int i = 0; i < input.length; i++) {
			
			System.out.print(input[i]+" ");
			
		}

	}
	

}


class Solution2 {
    public void moveZeroes(int[] nums) {
    	
    	
    	int j = 0;
    	for(int i = 0; i< nums.length; i++)
    	{
    		if(nums[i]!=0){
    			
    			nums[j]=nums[i];
    			j++;
    			
    		}
    		
    	}
    
    	for(int m = j; m< nums.length; m++){
    		
    		nums[m]=0;
    		
    	}
    
    }
 /*
  * 
  *    moveZeroes2 not working for all test cases. Need to revisit this function.
  *    
  */
public void moveZeroes2(int[] nums) {
    	
    	int size = nums.length-1;
    	int count = 0;
    	for(int i = 0; i<nums.length; i++){
    		
    		if(nums[i] == 0){
    			
    			if(count + i == nums.length)
    				break;
    			
    			count++;
    			
    			
    			
    			moveArrayForward(nums,i, size-i);
    			
    			
    		} 
    			
    	}
        
    }
    
    public void moveArrayForward(int [] num, int index, int arraySize) {
    	
    	int start_index = index+1;
    	int end_index = num.length - (index + 1);
    	
    	while(start_index <= end_index){
    		
    		num[index] = num [start_index];
    		index++;
    		start_index++;
    	}
    	
    	if(arraySize!=0)
    		num[arraySize] = 0;
    	
    	for (int i = 0; i < num.length; i++) {
			
    		System.out.print(num[i]+" ");
    		
		}
    	
    	System.out.println();
    }

}