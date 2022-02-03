package Math;

import java.util.Scanner;

public class DivideNumber {
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int a = scObj.nextInt();
		int b = scObj.nextInt();
		DivideNumber newObj = new DivideNumber();
		System.out.println(newObj.divideNum1(a,b));
	}

	//Log(n)
	public int divideNum1(int a, int b) {
		int sign = ((a>0)^(b>0)) ? -1 : 1;
		int quotient = 0;
		while(a >= b) {
			int divisor = b; int itr = 0;
			while(a >= divisor) {
				itr++;
				divisor=b*(1<<itr);
			}
			quotient+=1<<(itr-1);
			a-=b*(1<<(itr-1));
		}
		return quotient*sign ;
	}
	
    //Brute-force timeComplexity ->O(n) 
	public int divideNum(int a, int b) {
		int sign = ((a>0) ^ (b>0)) ? -1 : 1;
		int quotient = 0;
		a =  Math. abs(a);
		b =  Math. abs(b);
		while (a >= b) {
			a-=b;
			quotient++;
		}
		return quotient*sign;
	}
}
