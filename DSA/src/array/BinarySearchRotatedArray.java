package array;
import java.util.Scanner;

public class BinarySearchRotatedArray {

	public int BinarySearchingRotatedArray(int[] nums,int elementToSearch) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;
			if ( nums[mid] == elementToSearch ) {
				return mid;
			}
			if(nums[low] < nums[mid]) {
				if( nums[low] <= elementToSearch && elementToSearch < nums[mid] ) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}else {
				if(nums[mid] < elementToSearch && elementToSearch <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		} 
		return -1;
	}
	public static void main (String args[]) {
		Scanner sbObj = new Scanner(System.in);
		int n = sbObj.nextInt();
		int nums[] = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			nums[i] = sbObj.nextInt();
		}
		int numberToSearched = sbObj.nextInt();
		BinarySearchRotatedArray BSObj = new BinarySearchRotatedArray();
		System.out.print(BSObj.BinarySearchingRotatedArray(nums,numberToSearched)); 
	}
}
