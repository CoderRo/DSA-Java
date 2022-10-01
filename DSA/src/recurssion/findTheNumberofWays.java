package recurssion;

import java.util.Scanner;

public class findTheNumberofWays {

	public static int findTheNumberOfWays ( int n , int m ) {
		
		if ( m == 0 || n == 0) {
			return 1;
		}
		return findTheNumberOfWays(n-1,m) + findTheNumberOfWays(n,m-1);
		
	}
	
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int row = scObj.nextInt();
		int col = scObj.nextInt();
		System.out.println(findTheNumberOfWays(row,col));
	}
}
