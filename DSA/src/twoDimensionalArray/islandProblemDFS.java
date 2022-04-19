package twoDimensionalArray;

import java.util.Scanner;

public class islandProblemDFS {
	static Scanner scObj = new Scanner(System.in);
	static int[][] get2dArray(int row , int col) {
		int a[][] = new int[row][col];
		for ( int row_i = 0 ; row_i < row ; row_i++ ) {
			for ( int col_i = 0 ; col_i < col ; col_i++ ) {
				a[row_i][col_i] = scObj.nextInt();
			}
		}
		return a;
	}
	public static void main (String args[]) {
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		int a[][] = get2dArray(row,col);
		
		
	}
}
