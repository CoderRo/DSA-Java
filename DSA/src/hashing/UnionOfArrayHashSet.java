package hashing;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArrayHashSet {
	
	public static int UnionArray( ArrayList<Integer> A1, ArrayList<Integer> A2) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for ( Integer element : A1) {
			hs.add(element);
		}
		for ( Integer element : A2) {
			hs.add(element);
		}
		return  hs.size(); 
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		int size1 = scObj.nextInt();
		int size2 = scObj.nextInt();
		ArrayList l1 = new ArrayList<Integer>(size1);
		ArrayList l2 = new ArrayList<Integer>(size2);
		for ( int i = 0 ; i < size1 ; i++) {
			l1.add(scObj.nextInt());
		}
		for ( int j = 0 ; j < size2 ;j++) {
			l2.add(scObj.nextInt());
		}
		System.out.println(UnionArray(l1,l2));
	}
}
