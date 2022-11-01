package recurssion;

import java.util.Scanner;

public class KnightTour {

	   public static void main(String[] args) throws Exception {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[][] chess = new int[n][n];
	        int row = scn.nextInt();
	        int col = scn.nextInt();
	        printKnightsTour(chess,row,col,1);  
	    }

	    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {

	        int row = chess.length , col = chess[0].length;
	        if ( r >= 0 && r < row && c >= 0 && c < col && chess[r][c] ==0 ) {
	            chess[r][c] = upcomingMove;
	            if ( upcomingMove == row*col ) {
	                displayBoard(chess);
	                chess[r][c] = 0;
	                return;
	            }
	        } else {
	            return;
	        }
	        upcomingMove++;
	        printKnightsTour(chess,r-2,c+1,upcomingMove);
	        printKnightsTour(chess,r-1,c+2,upcomingMove);
	        printKnightsTour(chess,r+1,c+2,upcomingMove);
	        printKnightsTour(chess,r+2,c+1,upcomingMove);
	        printKnightsTour(chess,r+2,c-1,upcomingMove);
	        printKnightsTour(chess,r+1,c-2,upcomingMove);
	        printKnightsTour(chess,r-1,c-2,upcomingMove);
	        printKnightsTour(chess,r-2,c-1,upcomingMove);   
	        chess[r][c] = 0;
	    }

	    public static void displayBoard(int[][] chess){
	        for(int i = 0; i < chess.length; i++){
	            for(int j = 0; j < chess[0].length; j++){
	                System.out.print(chess[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();
	    }
}
