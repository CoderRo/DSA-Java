package twoDimensionalArray;

import java.util.Scanner;

public class ShiftElementSprially {
	
	public static int[][] get2DArray( int row , int col) {
		Scanner scObj = new Scanner(System.in);
		int a[][] = new int[row][col];
		for( int row_i = 0 ; row_i < row ; row_i++ ) {
			for ( int col_i = 0 ; col_i < col ; col_i++) {
				a[row_i][col_i] = scObj.nextInt();
			}
		}
		return a;
	}
	
	public static void print2DArray( int a[][]) {
		int row = a.length;
		int col = a[0].length;
		for ( int row_i = 0 ; row_i < row ; row_i++) {
			for ( int col_i = 0 ; col_i < col ; col_i++) {
				System.out.print(a[row_i][col_i]);
			}
			System.out.println();
		}
	}
	public static int[][] SpiralShift(int a[][]) {
		int row = a.length;
		int col = a[0].length;
		int start_row_index = 0 ;
		int start_col_index = 0;
		int end_row_index = row-1;
		int end_col_index = col-1;
		int currentValue = 0;
		int lastValue = 0;
		while( start_row_index <= end_row_index && start_col_index < end_col_index ) {
			for ( int i = start_col_index ; i <= end_col_index && start_row_index <= end_row_index; i++) {
				currentValue = a[start_row_index][i];
				a[start_row_index][i] = lastValue;
				lastValue = currentValue;
			}
			start_row_index++;
			for ( int i = start_row_index ; i <= end_row_index && start_col_index < end_col_index; i++) {
				currentValue = a[i][end_col_index];
				a[i][end_col_index] = lastValue;
				lastValue = currentValue;
			}
			end_col_index--;
			for ( int i = end_col_index ; i >= start_row_index && start_row_index <= end_row_index; i--) {
				currentValue = a[end_row_index][i];
				a[end_row_index][i] = lastValue;
				lastValue = currentValue;
			}
			end_row_index--;
			for ( int i = end_row_index ; i >= start_row_index && start_col_index < end_col_index; i--) {
				currentValue = a[i][start_col_index];
				a[i][start_col_index] = lastValue;
				lastValue = currentValue;
			}
		}
		a[0][0] = lastValue;
		return a;
	}
	
	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		int a[][] = get2DArray(row,col);
		print2DArray(a);
		a = SpiralShift(a);
		print2DArray(a);
	}
}
