package bitManipulation;

import java.util.Scanner;

public class NumBitToChangeAtoB {
	
	public int bitCountToChangeAtoB(int a ,int b) {
		int c = a^b, count = 0;
		System.out.println(Integer.toBinaryString(c));
		while ( c !=0 ) {
			if((c & 1) == 1 ) {
				count++;
			}
			c = c >> 1;
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner SbObj = new Scanner(System.in);
		int a = SbObj.nextInt();
		int b = SbObj.nextInt();
		
		NumBitToChangeAtoB newObj = new NumBitToChangeAtoB();
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(newObj.bitCountToChangeAtoB(a,b));
	}
}
