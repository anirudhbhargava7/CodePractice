/*Four friends A, B, C, D 
Need to cross a bridge..
A maximum of 2 peoples can cross at a time..
It is night and they have just 1 lamp.

People that cross the bridge must carry the lamp to see the way..

A pair must walk together at the speed of slower person...


Speeds of

A: 1 minute to cross bridge

B: 2 minutes to cross bridge

C: 7 minutes to cross bridge

D: 10 minutes to cross bridge



Now question is... "what is d total minimum time required by all 4 friends to cross the bridge....?
*/

package com.puzzles.puzzle1;



public class Intialization {
	
	public static void main(String args[])
	{
			
		int number_of_people = 5;
		
		//int []timeArray = new int [number_of_people];
		
		int [] timeArray = {1,2,5,10,12};
		
		System.out.println(totalTime(timeArray, number_of_people));
		
	
		
	}
	
	
	static int totalTime (int timeArray[] , int n ){
		
		if(n < 3){
			
			return timeArray[n-1];
		}
		
		if(n == 3)
		{
			return timeArray[0]+ timeArray[1] + timeArray[2];
		}
		
		
		int temp1 = timeArray[0] + timeArray[n-1] + timeArray[n-2] + timeArray[0];
		
		int temp2 = timeArray[0] + timeArray[1] + timeArray[n-1] + timeArray[1];
		
		if(temp1 < temp2)
		{
			return temp1 + totalTime(timeArray, n-2);
		}
		else
		{
			return temp2 + totalTime(timeArray, n-2);
		}
		
	}
	

}
