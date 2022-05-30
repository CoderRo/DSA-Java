package string;

import java.util.Scanner;
public class reverseString2 {
	
	public static char[] swap(char[] str, int s , int e) {
		char temp = str[s];
		str[s] = str[e];
		str[e] = temp;
		return str;
	}

	public static char[] reverseString(char[] str) {
		int strLen = str.length;
		int s = 0;
		int e = strLen - 1;
		while(s < e) {
			str = swap(str,s,e);
			s++;
			e--;
		}
		return str;
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		char string[] = scObj.nextLine().toCharArray();
		System.out.println(reverseString(string));
		
	}
}
 