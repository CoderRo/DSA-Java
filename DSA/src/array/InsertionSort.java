package array;

import java.util.Scanner;

public class InsertionSort {

	public void InsertionSorting (int nums[]) {
		int temp;
		for ( int i = 1 ; i < nums.length ; i++) {
			temp = nums[i];
			int j = i - 1;
			while (j >= 0 && temp < nums[j] ) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
		
		for ( int i = 0 ; i < nums.length ; i++ ) {
			System.out.println(nums[i]); 
		}
	}
	
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int n = scObj.nextInt();
		int nums[] = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			nums[i] = scObj.nextInt();
		}
		InsertionSort newObj = new InsertionSort();
		newObj.InsertionSorting(nums);
	}
}
