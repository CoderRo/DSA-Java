package bitManipulation;

import java.util.Scanner;

public class FindUniqueElementWIthKRepeating {

	public void findUniqueWithKRepeating( int nums[] ) {
		int INT_SIZE = 32;
		int count[] = new int[INT_SIZE];
		
		for ( int j = 0 ; j < INT_SIZE ;j++) {
			for ( int i = 0 ; i < nums.length ; i++ ) {
				if ((nums[i] & 1<<j) != 0) {
					count[j]++;
				}
			}
		}
		int sum  = 0;
		for ( int i = 0 ; i < nums.length ; i++ ) {
			sum += ((count[i]%3)*(1<<i));
		}
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int n = scObj.nextInt();
		int[] nums = new int[n];
		for( int i = 0 ; i < n ; i++) {
			nums[i] = scObj.nextInt();
		}
		FindUniqueElementWIthKRepeating newObj = new FindUniqueElementWIthKRepeating();
		newObj.findUniqueWithKRepeating(nums);
	}
}
