package array;

import java.util.Scanner;

public class BinarySearchInfiniteArray {
	
	public int binarySearchingForInfiniteArray (int nums[] , int searchElement) {
		int high = 1 ;
		int low = 0 ;
		while (nums[high] < searchElement ) {
			low = high;
			high = high * 2;
		}
		return binarySearching( nums , searchElement , low , high);
	}
	
	private int binarySearching(int[] nums, int searchElement, int low, int high) {
		if(low <= high) {
			int mid = (high+low)/2;
			if(nums[mid] == searchElement) {
				return mid;
			}
			if (nums[mid] < searchElement) {
				binarySearching(nums,searchElement,mid+1, high);
			}else {
				binarySearching(nums,searchElement,low,mid-1);
			}
		}  
		return -1;
	}

	public static void main(String args[]) {
		Scanner sbObj = new Scanner(System.in);
		int n = sbObj.nextInt();
		int a[] = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sbObj.nextInt();
		}
		int searchElement = sbObj.nextInt();
		BinarySearchInfiniteArray BSIAObj = new BinarySearchInfiniteArray();
		System.out.println(BSIAObj.binarySearchingForInfiniteArray(a,searchElement));
	}

}
