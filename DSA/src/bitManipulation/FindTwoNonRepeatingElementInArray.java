package bitManipulation;

import java.util.Scanner;

public class FindTwoNonRepeatingElementInArray {
	public void FindingTwoIdenticalNumberInArray( int[] nums) {
		int c = 0 ;
		for ( int i = 0 ; i < nums.length ;i++) {
			c = c ^ nums[i];
		}
		int d = c & ~(c-1);
		int x = c;
		int y = c;
		for ( int i = 0; i < nums.length ; i++ ) {
			if( (nums[i] & d) != 0) {
				x = x ^ nums[i];
			} else {
				y = y ^ nums[i];
			}
		}
		System.out.println(x + " " + y);
	}
	public static void main(String args[]) {
		Scanner ScObj = new Scanner(System.in);
		int n = ScObj.nextInt();
		int[] nums = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			nums[i] = ScObj.nextInt();
		}
		FindTwoNonRepeatingElementInArray newObj = new FindTwoNonRepeatingElementInArray();
		newObj.FindingTwoIdenticalNumberInArray(nums);
	}
}
