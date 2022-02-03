package Math;

import java.util.Scanner;

public class DivideNumber {
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int a = scObj.nextInt();
		int b = scObj.nextInt();
		DivideNumber newObj = new DivideNumber();
		System.out.println(newObj.divideNum(a,b));
	}

	//Brute-force
	public int divideNum(int a, int b) {
		int sign = ((a>0) ^ (b>0)) ? -1 : 1;
		int quotient = 0;
		while (a >= b) {
			a-=b;
			quotient++;
		}
		return quotient*sign;
	}
}
