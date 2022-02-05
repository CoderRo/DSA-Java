package bitManipulation;

import java.util.Scanner;

public class cntBitss {
	
    public int cntBits(int[] A) {
        int n = A.length;
        int int_size = 31;
        long count = 0;
        long totalCount = 0;
        for( int j = 0 ; j < int_size ; j++) {
        	count = 0;
            for ( int i = 0 ; i < n ; i++ ) {
                if((A[i] & (1<<j)) != 0) {
                	count++;
                }
                totalCount += 2*(n - count)*count;  
                totalCount %=(Math.pow(10,9)+7);
            }
        }
        return (int) (totalCount%(Math.pow(10,9)+7));
    }
    
	public static void main(String args[]) {
		Scanner ScObj = new Scanner(System.in);
		int n = ScObj.nextInt();
		int num[] = new int[n]; 
		for( int i = 0 ; i < n ; i++) {
			num[i] = ScObj.nextInt();
		}
		cntBitss newObj = new cntBitss();
		newObj.cntBits(num);
	}
}
