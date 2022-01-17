package array;

import java.util.Scanner;

public class QuickSort {

	private int[] a;
	public QuickSort(int[] nums) {
		a = new int[nums.length];
		for( int i = 0 ; i < nums.length ; i++ ) {
			a[i] = nums[i];
		}
	}

	public void QuickSorting(int l, int h) {
		if(l < h) {
			int p = getPartition(l,h);
			QuickSorting(l,p-1);
			QuickSorting(p+1,h);	
		}
	}
	
	private int getPartition(int l, int h) {
		int pivot = a[l];
		int i = l;
		int j = h;
		while (i < j) {
			while(a[i] <= pivot)i++;
			while(a[j] > pivot)j--;
			if(i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[j];
		a[j] = a[l];
		a[l] = temp;
		return j;
	}

	public static void main(String args[]) {
		Scanner sObj = new Scanner(System.in);
		int n = sObj.nextInt();
		int nums[] = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			nums[i] = sObj.nextInt();
		}
		QuickSort newObj = new QuickSort(nums);
		newObj.QuickSorting(0,nums.length-1);
		newObj.showArray();
	}

	private void showArray() {
		for ( int i = 0 ; i < a.length ; i++ ) {
			System.out.println(a[i]);
		}
	}
}
