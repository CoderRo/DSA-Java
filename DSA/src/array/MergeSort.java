package array;

import java.util.Scanner;

public class MergeSort {
	private int[] a;
	public MergeSort(int nums[]) {
		a = new int[nums.length];
		for ( int i = 0 ; i < nums.length ; i++ ) {
			a[i] = nums[i];
		}
	}
	public void mergeSorting(int l,int r) {
		if( l < r ) {
			int mid = (l + r)/2;
			mergeSorting(l,mid);
			mergeSorting(mid+1,r);
			merge(l,mid,r);
		}
	}
	public void merge(int l, int mid, int r) {
		int b [] = new int[r-l+1];
		int i = l;
		int j = mid+1;
		int count = 0;
		while( i <= mid && j <= r) {
			if(a[i] < a[j]) {
				b[count++] = a[i];
				i++;
			}else {
				b[count++] = a[j];
				j++;
			}
		}
		if( i <= mid ) {
			while(i <= mid) {
				b[count++] = a[i];
				i++;
			}
		}else if(j <= r) {
			while(j <= r) {
				b[count++] = a[j];
				j++;
			}
		}
		count = 0;
		for ( int k = l ; k <= r ; k++) {
			a[k] = b[count++];
		}
	}
	
	public static void main (String args[]) {
		Scanner newSb = new Scanner(System.in);
		int n = newSb.nextInt();
		int[] nums = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			nums[i] = newSb.nextInt();
		}
		MergeSort mgObj = new MergeSort(nums);
		mgObj.mergeSorting(0,nums.length - 1);
		mgObj.showArray();
	}
	public void showArray() {
		for( int i = 0 ; i < a.length ; i++ ) {
			System.out.println(a[i]);
		}
	}
}
