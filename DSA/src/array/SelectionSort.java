package array;

import java.util.Scanner;

public class SelectionSort {

	public void SelectionSorting (int[] nums) {
		for (int i = 0 ; i <  nums.length - 1 ; i++) {
			int minIndex = i;
			for( int j = i + 1 ; j < nums.length ; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
		}
		for ( int i = 0 ; i < nums.length ; i++ ) {
			System.out.println(nums[i]);
		}
	}
	
	public static void main (String args[]) {
		Scanner sbObj = new Scanner(System.in);
		int n = sbObj.nextInt();
		int nums[] = new int[n];
		for( int i = 0 ; i < n ; i++ ) {
			nums[i] = sbObj.nextInt();
		}
		SelectionSort sb = new SelectionSort();
		sb.SelectionSorting(nums);
	}
}
