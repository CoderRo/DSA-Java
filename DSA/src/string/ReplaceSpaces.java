package string;

import java.util.Scanner;

public class ReplaceSpaces {
	
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(scObj.nextLine());
		String replacedStr = scObj.nextLine();
		System.out.println(replaceSpaces(str,replacedStr));
	}
	

	public static StringBuilder replaceSpaces(StringBuilder str, String replacedStr) {
		// Count the number of spaces in the string 
	
		int spaceCounter = 0;
		int oldStrLen = str.length();
		for( int i = 0 ; i < oldStrLen ; i++) {
			if (str.charAt(i) == ' ' ) {
				spaceCounter++;
			}
		}
		int newStrLen = oldStrLen + spaceCounter * (replacedStr.length() - 1);
		// Add extra space to the spring..
		for ( int i = 0 ; i <= newStrLen - oldStrLen ;i++) {
			str.append(' ');
		}
		
		// replacing the replaceString with str
		for ( int i = newStrLen - 1 ; oldStrLen!= -1 && i >= 0 ; i-- ) {
			if ( str.charAt(oldStrLen-1) != ' ') {
				str.setCharAt(i,str.charAt(oldStrLen-1));
			} else {
				for ( int j = replacedStr.length() - 1 ; j >= 0 ; j-- ) {
					str.setCharAt(i,replacedStr.charAt(j));
					i--;
				}
				i++;// Just to maintain one extra decrement for the main for loop on 
			}
			oldStrLen--;
		}
		return str;
	}
}
