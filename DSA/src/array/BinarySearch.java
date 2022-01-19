package array;

import java.util.Scanner;

public class BinarySearch {

	public int findElement (int nums[] , int elementToSearch ) {
		int high = nums.length;
		int low = 0;
		while (low <= high) {
			int mid = (low+high)/2;
			if (nums[mid] == elementToSearch ) {
				return mid;
			}
			
			if ( nums[mid] > elementToSearch ) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String arg[]) {
		Scanner ScObj = new Scanner(System.in);
		int n = ScObj.nextInt();
		int [] a = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = ScObj.nextInt();
		}
		
		int  elementToSearch = ScObj.nextInt();
		BinarySearch bsObj = new BinarySearch();
		System.out.println(bsObj.findElement(a ,elementToSearch));
	}
}
