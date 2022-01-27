package bitManipulation;

import java.util.Scanner;

public class BasicBitOperation {
	public int findingIthBit(int num, int i) {
		if (num == 0) {
			return 0;
		}
		int n = 1 << i;
		if((num & n) == 0) {
			return 0;
		}
		return 1;
	}
	
	public static void main(String args[]) {
		Scanner sbObj = new Scanner(System.in);
		int n = sbObj.nextInt();
		int i = sbObj.nextInt();
		BasicBitOperation newObj = new BasicBitOperation();
		System.out.println(Integer.toBinaryString(n));
		System.out.println(newObj.findingIthBit(n,i));
	}
}
