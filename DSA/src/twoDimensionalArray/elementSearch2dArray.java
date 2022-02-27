package twoDimensionalArray;
import java.util.Scanner;         


public class elementSearch2dArray {
	
	public static int[][] get2dArray(int row, int col) {
		Scanner scObj = new Scanner(System.in);
		int a[][] = new int[row][col];
		for( int row_index = 0 ; row_index < row ; row_index++ ) {
			for( int col_index = 0 ; col_index < col ; col_index++ ) {
				a[row_index][col_index] = scObj.nextInt();
			}
		}
		return a;
	}
	
	public static boolean findTargetElementIn2DArray(int a[][] ,int target) {
		int row = a.length;
		int col = a[0].length;
		int row_index = 0;
		int col_index = col-1;
		while(row_index < row && col_index >= 0 ) {
			int element = a[row_index][col_index];
			
			if ( element == target) {
				return true;
			} else if (element < target ) {
				row_index++;
			} else {
				col_index--;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		int a[][] = get2dArray(row,col);
		System.out.println("Enter the target element");
		int target = scObj.nextInt();
		System.out.print(findTargetElementIn2DArray(a,target));
		
	}
}
