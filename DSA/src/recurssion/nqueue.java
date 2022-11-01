package recurssion;

import java.util.Scanner;

public class nqueue {

	  public static void main(String[] args) throws Exception {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int chess[][] = new int[n][n];
	        printNQueens(chess, "", 0);
	    }

	    public static boolean validateCell(int[][] chess, int cn ,int rn) {
	        int noOfRows = chess.length;
	        int noOfCols = chess[0].length;
	        //validate the column
	        for ( int row = 0 ; row < noOfRows ; row++ ) {
	            if ( chess[row][cn] == 1) {
	                return true;
	            }
	        }
	        //validating dignals
	        for ( int row = rn,  col = cn ; row < noOfRows && col < noOfCols ; row++ , col++ ) {
	            if ( chess[row][col] == 1) {
	                return true;
	            }
	        }
	        for ( int row = rn,  col = cn ; row >= 0 && col < noOfCols ; row-- , col++ ) {
	            if ( chess[row][col] == 1) {
	                return true;
	            }
	        }
	        for ( int row = rn,  col = cn ; row >= 0 && col >= 0 ; row-- , col-- ) {
	            if ( chess[row][col] == 1) {
	                return true;
	            }
	        }
	        for ( int row = rn,  col = cn ; row < noOfRows && col >= 0 ; row++ , col-- ) {
	            if ( chess[row][col] == 1) {
	                return true;
	            }
	        }
	        return false;
	    }
	    public static void printNQueens(int[][] chess, String qsf, int row) {  
	        if (row == chess.length) {
	            System.err.println(qsf+".");
	            return;
	        } 
	        int totalCol = chess[0].length;
	        for ( int col = 0 ; col < totalCol ; col++ ) {
	            if (validateCell(chess,col,row) == false ) {
	               chess[row][col] = 1; 
	               printNQueens(chess,qsf + row + "-" + col, row+1); 
	               chess[row][col] = 0; 
	            }
	        } 
	    }
}
