package recurssion;

import java.util.Scanner;

public class powerSet {

	public static void printPowerSet(String str , String currStr , int s ) {
		if (str.length() == s) {
			System.out.println(currStr);
			return;
		}
		printPowerSet(str,currStr,s+1);
		printPowerSet(str,currStr+str.charAt(s),s+1);
		
	}
	
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		String str = scObj.nextLine();
		printPowerSet(str,"",0);
	}
}
