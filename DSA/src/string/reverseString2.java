package string;

import java.util.Scanner;
public class reverseString2 {
	
	public static char[] swap(char[] str, int s , int e) {
		char temp = str[s];
		str[s] = str[e];
		str[e] = temp;
		return str;
	}

	public static char[] reverseString(char[] str, int s ,int e) {
		while(s < e) {
			str = swap(str,s,e);
			s++;
			e--;
		}
		return str;
	}
	public static char[] reverseWordsInRow(char[] a) {
		a = reverseString(a,0,a.length-1);
		int rowLen = a.length - 1 ;
		int start = 0;
		int end = 0; 
		while (end <= rowLen) {
			 if ( end == rowLen) {
				 a = reverseString(a,start,end);
				 break;
			 }
			 if (a[end] == ' ') {
				 a = reverseString(a,start,end -1);
				 start = end + 1 ;
				 end = start;
			 }
			 end++;
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		char string[] = scObj.nextLine().toCharArray();
		System.out.println(reverseWordsInRow(string));
	}
}
 