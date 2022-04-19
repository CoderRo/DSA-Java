package twoDimensionalArray;

import java.util.Scanner;

public class islandProblemDFS {
	static Scanner scObj = new Scanner(System.in);
	private static final int[] row = {-1,-1,-1,0,0,1,1,1};
	private static final int[] col = {-1,0,1,-1,1,-1,0,1};
	
	static int[][] get2dArray(int row , int col) {
		int a[][] = new int[row][col];
		for ( int row_i = 0 ; row_i < row ; row_i++ ) {
			for ( int col_i = 0 ; col_i < col ; col_i++ ) {
				a[row_i][col_i] = scObj.nextInt();
			}
		}
		return a;
	}
	
	static boolean isValid(int row , int col , int row_index, int col_index) {	
		return (row_index >= 0 && row_index < row && col_index >= 0 && col_index < col);
	}
	
	static void DFS(int [][] a,int row_index, int col_index) {
		int row_len = a.length;
		int col_len = a[0].length;
		
		a[row_index][col_index] = 1;
		for ( int i = 0 ; i < 8 ;i++) {
			int row_i = row_index + row[i];
			int col_i = col_index + col[i];
			
			if( isValid(row_len,col_len,row_i,col_i) && a[row_i][col_i] == 0) {
				DFS(a,row_i,col_i);
			}
		}
	}
	static int [][] ReplaceZeroes( int a[][]) {
		int row = a.length;
		int col = a[0].length;
		for ( int i = 0 ; i < col ; i++) {
			if ( a[0][i] == 0) {
				DFS(a,0,i);
			}
			if ( a[row-1][i] == 0 ) {
				DFS(a,row-1,i);
			}
		}
		for( int j = 0 ; j < row ; j++ ) {
			if ( a[j][0] == 0 ) {
				DFS(a,j,0);
			}
			if( a[j][col-1] == 0) {
				DFS(a,j,col-1);
			}
		}
		return a;
	}
	static void print2DArray(int[][] a) {
		int row = a.length;
		int col = a[0].length;
		for ( int i = 0 ; i < row ; i++) {
			for ( int j = 0 ; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main (String args[]) {
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		int a[][] = get2dArray(row,col);
		print2DArray(a);
		a = ReplaceZeroes(a);
		print2DArray(a);	
	}
}
