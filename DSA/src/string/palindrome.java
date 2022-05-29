package string;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		String s = scObj.nextLine();
		System.out.println("Start");
		System.out.println(checkPalindrome(s));
	}

	public static boolean isAlphaNumeric(char c) {
		if ( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= 0 && c <= 9) ) {
			return true;
		}
		return false;
	}
	
	public static char toLower(char c) {
		if (c >='A' && c <= 'Z') {
			return Character.toLowerCase(c);
		}
		return c;
	}
	
	public static boolean checkPalindrome(String str) {
		int strLength = str.length();
		int s = 0;
		int e = strLength - 1;
		while(s<=e) {
			char c1 = str.charAt(s);
			char c2 = str.charAt(e);
			if (!isAlphaNumeric(c1)) {
				s++;	
			}else if(!isAlphaNumeric(c2)) {
				e--;	
			} else if (toLower(c1) == toLower(c2)) {
				s++;
				e--;
			} else {
				return false;
			}
		}
		return true;
	}
}