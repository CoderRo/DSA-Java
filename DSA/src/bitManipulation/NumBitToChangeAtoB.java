package bitManipulation;

import java.util.Scanner;

public class NumBitToChangeAtoB {
	
	public int bitCountToChangeAtoB(int a ,int b) {
		int c = a^b, count = 0;
		while ( c !=0 ) {
			 c = c >> 1;
			if((c & 1) == 1 ) {
				count++;
			}
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
