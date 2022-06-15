package string;
import java.util.Scanner;

public class ReplaceSubString {
	
	public static String ReplaceSubStrings(String s, String part) {
		while(s.length() > 0 && s.indexOf(part) != -1 ) {
			s =  s.substring(0 , s.indexOf(part)).concat(s.substring(s.indexOf(part)+ part.length()));
		}
		return s;
	}

	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		String s = scObj.next();
		String part =  scObj.next();
		System.out.println(ReplaceSubStrings(s,part));
	}
}
