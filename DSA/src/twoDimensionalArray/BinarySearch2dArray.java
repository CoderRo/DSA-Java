package twoDimensionalArray;
import java.util.Scanner;

public class BinarySearch2dArray {
	
	public int[][] get2dArray(int row, int col) {
		Scanner scObj = new Scanner(System.in);
		int a[][] = new int[row][col];
		for ( int row_i = 0 ; row_i < row ; row_i++ ) {
			for ( int col_i = 0 ; col_i < col ; col_i++ ) {
				a[row_i][col_i] = scObj.nextInt();
			}
		}
		return a;
	}
	public static void print2dArray( int a[][]) {
		int row = a.length;
		int col = a[0].length;
		for( int i = 0 ; i < row ; i++ ) {
			for ( int j = 0 ; j < col ; j++ ) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static boolean binarySearch2dArray(int a[][], int target) {
		int row = a.length;
		int col = a[0].length;
		int start = 0;
		int end =  row * col - 1;
		while (start <= end) {
			int mid = start + (end - start)/2;
			int element = a[mid/col][mid%col];
			if (a[mid/col][mid%col] == target) {
				return true;
			} else if(element > target ) {
				end = mid -1;
			} else {
				start = mid + 1;
			}
		}
		return false;	
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		BinarySearch2dArray newObj = new BinarySearch2dArray();
		int a[][] = newObj.get2dArray(row,col);
		print2dArray(a);
		System.out.println("Print the target value");
		int target = scObj.nextInt();
		System.out.println(binarySearch2dArray(a,target));
		
	}
}
