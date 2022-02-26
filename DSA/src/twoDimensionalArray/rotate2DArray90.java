package twoDimensionalArray;
import java.util.ArrayList;
import java.util.Scanner;

public class rotate2DArray90 {
		
		public static int [][] get2dArray( int n) {
			Scanner scObj = new Scanner(System.in);
			int a[][] = new int [n][n];
			for ( int i = 0 ; i < n ; i++ ) {
				for( int j = 0 ; j < n ; j++ ) {
					a[i][j] = scObj.nextInt();
				}
			}
			return a;
		}
		
		public static int [][] transposeOfMatrix( int a[][]){
			int n = a.length;
			for( int row_i = 0 ; row_i < n ;row_i++ ) {
				for ( int col_i = row_i ; col_i < n ; col_i++ ) {
					int temp = a[row_i][col_i];
					a[row_i][col_i] = a[col_i][row_i];
					a[col_i][row_i] = temp;
				}
			}
			return  a;
		}
		
		public static void print2dArray( int a[][]) {
			int n = a.length;
			for(int i = 0; i < n ; i++) {
				for ( int  j = 0 ; j < n ; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
				
			}
		}
		
		public static int[][] rotate90Degree(int a[][]) {
			a = transposeOfMatrix(a);
			int n = a.length;
			int start_Column = 0;
			int end_Column = n-1;
			while( start_Column < end_Column ) {
				for( int row_index = 0 ; row_index < n ; row_index++ ) {
					int temp = a[row_index][start_Column];
					a[row_index][start_Column]=a[row_index][end_Column];
					a[row_index][end_Column] = temp;
				}
				start_Column++;
				end_Column--;
			} 
			return a;
		}
		public static void main (String args[]) {
			Scanner ScObj = new Scanner(System.in);
			int n = ScObj.nextInt();
			int a[][] = get2dArray(n);
			print2dArray(a);
			a = rotate90Degree(a);
			print2dArray(a); 
		}
	}
