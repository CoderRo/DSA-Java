package recurssion;

import java.util.Scanner;

public class PermutationOfString {
	
	public static char[] Swap(String str , int i , int j) {
		char arr[] = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	public static void printPermuntationOfString (String str , int l, int r) {
		if (r == l) {
			System.out.println(str.toString());
			return;
		}
		for ( int i  = l ; i <= r ; i++ ) {
			str = new String(Swap(str,i,l));
			printPermuntationOfString(str,l+1,r);
			str = new String(Swap(str,i,l));
		}
	}

	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		String str = scObj.nextLine();
		printPermuntationOfString(str,0,str.length() - 1);
	}
}
