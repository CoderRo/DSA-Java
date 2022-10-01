package recurssion;

import java.util.Scanner;

public class checkPalindrome {

	public static boolean checkpalindrome(String str, int r , int l) {
		if (l < r ) {
			return true;
		}
		if(str.charAt(r)==str.charAt(l)) {
			return checkpalindrome(str,r+1,l-1);
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		String str = scObj.nextLine();
		System.out.println(checkpalindrome(str,0,str.length()-1));
	}
}
