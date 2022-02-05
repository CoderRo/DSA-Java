package bitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class MinXORValue {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        for ( int i = 0 ; i < A.length-1 ; i++ ) {
            int xORValue = A[i]^A[i+1];
            if(xORValue < min){
                min = xORValue;
            }
        }
        return min;
    }
    
    public static void main(String args[]) {
    	Scanner scObj = new Scanner(System.in);
    	MinXORValue newObj = new MinXORValue();
    	int n = scObj.nextInt();
    	int A[] = new int[n];
    	for ( int i = 0 ; i < n ; i++ ) {
    		A[i] = scObj.nextInt();
    	}
    	System.out.println(newObj.findMinXor(A));
    }
}

