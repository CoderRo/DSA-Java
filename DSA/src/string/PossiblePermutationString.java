package string;

import java.util.ArrayList;
import java.util.Scanner;

public class PossiblePermutationString {
	public static char[] swap(char[] ch, int index1 , int index2) {
		char temp = ch[index1];
		ch[index1] = ch[index2];
		ch[index2] = temp;
		return ch;
	}
	public static ArrayList<String> possiblePermutationStrings(String s) {
		if(s.length() == 1) {
			ArrayList<String> arList = new ArrayList<String>();
			arList.add(s);
			return arList;
		}
		ArrayList<String> st = new ArrayList<String>();
		for ( int i = 0 ; i < s.length(); i++ ) {
			ArrayList<String> dummyList = new ArrayList<String>();
			String firstChar = s.substring(i,i+1);
			s = String.copyValueOf(swap(s.toCharArray(),0,i));
			dummyList = possiblePermutationStrings(s.substring(1));
			for (int i1 = 0 ; i1 < dummyList.size() ; i1++) {
				dummyList.set(i1, firstChar.concat(dummyList.get(i1)));
			}
			st.addAll(dummyList);
		}
		return st;
	}
	public static void main(String args[]) {
		Scanner scObj = new Scanner(System.in);
		String s = scObj.nextLine();
		ArrayList<String> st = new ArrayList<String>();
		st = possiblePermutationStrings(s);
		for( int i = 0 ; i < st.size(); i++) {
			System.out.println(st.get(i));
		}			
	}
} 