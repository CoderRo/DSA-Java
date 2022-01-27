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
	
	public int settingIthBit( int num , int i) {
		int mask = 1<<i;
		return num | mask;
	}
	
	public static void main(String args[]) {
		Scanner sbObj = new Scanner(System.in);
		int n = sbObj.nextInt();
		System.out.println(Integer.toBinaryString(n));
		int i = sbObj.nextInt();
		BasicBitOperation newObj = new BasicBitOperation();
//		System.out.println(newObj.findingIthBit(n,i));
		System.out.println(newObj.settingIthBit(n,i));
		System.out.println(Integer.toBinaryString(newObj.settingIthBit(n,i)));
	}
}
