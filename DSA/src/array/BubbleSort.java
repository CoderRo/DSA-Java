package array;

import java.util.Scanner;

public class BubbleSort {

	public void BubbleSort( int[] arr) {
		int arrlen = arr.length;
		for ( int i = 0 ; i < arrlen-1 ; i++ ) {
			for ( int j = 0 ; j < arrlen-i-1 ; j++ ) {
				if( arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		Scanner sb = new Scanner(System.in);
		int [] numbers = new int[sb.nextInt()];
		for ( int i = 0; i < numbers.length ; i++ ) {
			numbers[i] = sb.nextInt();
		}
		BubbleSort newobj = new BubbleSort();
		newobj.BubbleSort(numbers);
	}
}
