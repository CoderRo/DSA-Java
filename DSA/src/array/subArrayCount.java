package array;

import java.util.ArrayList;
import java.util.Scanner;

public class subArrayCount {
	 int subArrayCount( ArrayList<Integer> a , int targetElement ) {
	        int currSum = 0;int count = 0;int n = a.size();
	        for( int start = 0 ; start  < n ; start++) {
	            for ( int end = start ; end < n ; end++) {
	                currSum = 0;
	                for ( int i = start ; i <= end ; i++) {
	                   currSum += a.get(i); 
	                }
	                if( currSum < targetElement) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	    
	    public static void main(String args[]) {
	        Scanner scObj = new Scanner(System.in);
	        int n = scObj.nextInt();
	        ArrayList<Integer> arr = new ArrayList<Integer>(n);
	        for ( int i = 0 ; i < n ; i++ ) {
	            arr.add(scObj.nextInt());
	        }
	        int targetElement = scObj.nextInt();
	        subArrayCount obj = new subArrayCount();
	        System.out.println(obj.subArrayCount(arr,targetElement));
	    }
}
