package twoDimensionalArray;
import java.util.ArrayList;
import java.util.Scanner; 

public class printSpiralOrder {
	
	public static int[][] createArray(int row, int col) {
		Scanner scObj = new Scanner(System.in);
		int a[][] = new int[row][col];
		for ( int ri = 0 ; ri < row ; ri++ ) {
			for ( int ci = 0 ; ci < col ; ci++ ) {
				a[ri][ci] = scObj.nextInt();
			}
		}
		return a;
	}
	
	public static ArrayList<Integer> spiralPrint(int a[][], int row, int col) {
		int ri = 0;
		int ci = 0;
		int re = row-1;
		int ce = col-1;
		ArrayList<Integer> v1 = new ArrayList<Integer>();
		while( ri <= re && ci <= ce) {
			for( int i = ci ; (ri <= re) && i <= ce ; i++ ) { // the Other Condition is added to check row or particular column is already printed or not.
				v1.add(a[ri][i]);
			}
			ri++;
			for( int i = ri ; (ci <= ce) && i <= re ; i++ ) {
				v1.add(a[i][ce]);
			}
			ce--;
			for( int i = ce ; (ri <= re ) && i >= ci ; i-- ) {
				v1.add(a[re][i]);
			}
			re--;
			for( int i = re ; (ci <= ce) && i >= ri ; i-- ) {
				v1.add(a[i][ci]);
			}
			ci++;
		}
		return v1;
		
	}

	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		int arr[][] = createArray(row,col);
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1 = spiralPrint(arr,row,col);
		for ( int i =0 ; i < arr1.size() ; i++ ) {
			System.out.println(arr1.get(i));
		}
	}
}
