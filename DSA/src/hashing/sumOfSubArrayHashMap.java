package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sumOfSubArrayHashMap {
	
	public void subArraySum(ArrayList<Integer> a, int sum) {
		int currSum = 0;
		int start = 0 ;
		int end = -1;
		HashMap<Integer, Integer> hp = new HashMap<Integer,Integer>();
		for( int i = 0 ; i < a.size() ; i++ ) {
			currSum+=a.get(i);
			if (currSum - sum == 0 ) {
				start = 0 ;
				end = i;
				break;
			}
			if (hp.containsKey(currSum - sum)) {
				start = hp.get(currSum - sum) + 1;
				end = i;
				break;
			}
			hp.put(currSum,i);
		}
		if ( end == -1) {
			System.out.println("Sub Array not found");
		} else {
			System.out.println("Start " + start + " End" + end);
		}
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int array_size = scObj.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for ( int i = 0 ; i < array_size ; i++ ) {
			arr.add(scObj.nextInt());
		}
		int sum = scObj.nextInt();
		sumOfSubArrayHashMap newObj = new sumOfSubArrayHashMap();
		newObj.subArraySum(arr,sum);
	}
}
