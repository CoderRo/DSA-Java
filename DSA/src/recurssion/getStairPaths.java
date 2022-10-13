package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println(getStairPaths(a));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if ( n <= 0 ) {
            ArrayList<String> stairPaths = new ArrayList<String>();
            if (n == 0 ) {
                stairPaths.add("");
            } 
            return stairPaths;
        }
        ArrayList<String> possibleStairCase = new ArrayList<String>();
        ArrayList<String> posblStairCase1 = getStairPaths(n-1);
        ArrayList<String> posblStairCase2 = getStairPaths(n-2);
        ArrayList<String> posblStairCase3 = getStairPaths(n-3);

        for ( int i = 0 ; i < posblStairCase1.size() ; i++ ) {
            possibleStairCase.add("1" + posblStairCase1.get(i));
        }
        for ( int j = 0 ; j < posblStairCase2.size() ; j++ ) {
            possibleStairCase.add("2" + posblStairCase2.get(j));
        }
        for ( int j = 0 ; j < posblStairCase3.size() ; j++ ) {
            possibleStairCase.add("3" + posblStairCase3.get(j));
        }
        return possibleStairCase;
    }
}
