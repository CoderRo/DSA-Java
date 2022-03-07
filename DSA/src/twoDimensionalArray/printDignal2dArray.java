package twoDimensionalArray;
import java.util.Scanner;

public class printDignal2dArray {

	public static int[][] get2DArray( int row , int col) {
		Scanner scObj = new Scanner(System.in);
		int [][] a = new int[row][col];
		for ( int i = 0 ; i < row ; i++ ) {
			for ( int j = 0 ; j < col ; j++ ) {
				a[i][j] = scObj.nextInt();	
			}
		}
		return a;
	}
	
	public static void print2Darray(int a[][]) {
		int row = a.length;
		int col = a[0].length;
		for ( int row_i = 0 ; row_i < row ; row_i++ ) {
			for ( int col_i = 0 ; col_i < col ; col_i++ ) {
				System.out.print(a[row_i][col_i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printDignal2Darray(int[][] a) {
		int row = a.length;
		int col = a[0].length;
		for ( int row_i = 0 ; row_i < row ; row_i++) {
			int row_no = row_i;
			int col_no = 0;
			while( row_no >=0 && col_no < col ) {
				System.out.print(a[row_no--][col_no++] + " ");
			}
			System.out.println();
		}
		for ( int col_i = 1 ; col_i < col ; col_i++) {
			int row_no = row-1;
			int col_no = col_i;
			while( row_no >=0 && col_no < col ) {
				System.out.print(a[row_no--][col_no++] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		int[][] a = get2DArray(row,col);
		print2Darray(a);
		printDignal2Darray(a);
	}
}
