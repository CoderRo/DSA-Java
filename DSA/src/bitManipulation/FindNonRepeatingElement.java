package bitManipulation;

import java.util.Scanner;

public class FindNonRepeatingElement {
 
	public int findingNonRepeatingElement(int nums[]) {
		int  c = 0;
		for (int i = 0 ; i < nums.length ; i++) {
			c = c ^ nums[i]; 
		}
		return c;		
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int n = scObj.nextInt();
		int[] nums = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			nums[i] = scObj.nextInt();
		}
		FindNonRepeatingElement newObj = new FindNonRepeatingElement();
		System.out.print(newObj.findingNonRepeatingElement(nums));
	}
}
