package recurssion;

import java.util.Scanner;

public class TargetSumSubset {
	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int arrSize = scn.nextInt();
        int arr[] = new int[arrSize];
        for ( int i = 0 ; i < arrSize ; i++ ) {
            arr[i] = scn.nextInt();
        }
        int tsum = scn.nextInt();
        printTargetSumSubsets(arr,0,"",0,tsum);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if (idx >= arr.length) {
            return;
        }
        if (sos == tar) {
            System.out.println(set +".");
            return;
        }
        String currVal = String.valueOf(arr[idx]);
        int sof = sos+arr[idx];
        printTargetSumSubsets(arr,idx+1,set+currVal+", ",sof,tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }

}
