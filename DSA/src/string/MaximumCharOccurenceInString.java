package string;

import java.util.Scanner;

public class MaximumCharOccurenceInString {
	
	public static char maxCharOccurenceString(char arr[]) {
		int alpha[] = new int[26]; 
		int max = 0;
		char maxChar = 'a';
		for ( int i = 0 ; i < arr.length ; i++  ) {
			alpha[(int)(toLowerCase(arr[i]) - 'a')]++;
		}
		for ( int i = 0 ; i < 26 ; i++ ) {
			System.out.println(alpha[i]);
			if (max < alpha[i]) {
				max = alpha[i];
				maxChar = (char) ('a' +  i);
			}
		}
		return maxChar;
	}
	
	public static char toLowerCase(char c) {
		if(c >= 'A' && c <= 'Z' ) {
			return Character.toLowerCase(c);
		}
		return c;
	}
	
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		char arr[] = scObj.nextLine().toCharArray();	
		System.out.println(maxCharOccurenceString(arr));
	}
}
