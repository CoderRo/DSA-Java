package hashing;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class distinctElementInWindowHashMap {
	
	public void distinctElements(ArrayList<Integer> a , int brackSize) {
		int a_size = a.size();
		HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		if ( a_size > brackSize ) {
			for ( int i = 0 ; i < brackSize ; i++ ) {
				hp.put(a.get(i), hp.getOrDefault(a.get(i), 0) + 1);
			}
			System.out.println(hp.size());
			for ( int i = brackSize ; i < a_size ; i++ ) { 
				if (hp.get(a.get(i - brackSize)) == 1) {
					hp.remove(a.get(i - brackSize));
				} else {
					hp.put(a.get(i - brackSize), hp.get(a.get(i)) -1);
				}
				hp.put(a.get(i), hp.getOrDefault(a.get(i), 0) +1);
				System.out.println(hp.size());
			}
		}
	}
	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		int a_size = scObj.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for ( int i = 0 ; i < a_size ; i++ ) {
			arr.add(scObj.nextInt());
		}
		int brack_size = scObj.nextInt();
		
	}
}
