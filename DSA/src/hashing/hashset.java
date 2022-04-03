package hashing;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

// Hashset will always contain unique elements
public class hashset {
	
	public static int findDistinctElements(ArrayList<Integer> a) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for( Integer elemet : a) {
			hs.add(elemet);
		}
		return hs.size();
	}
	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();	
		int num = scObj.nextInt();
		for( int i = 0; i < num ; i++) {
			a.add(scObj.nextInt());
		}
		System.out.println(findDistinctElements(a));
	}
}
