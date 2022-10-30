package recurssion;

import java.util.Scanner;
//"Enter "3104" -> will get all the possible character case 
public class printEncoding {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str);
    }

    public static void printEncodings(String str) {
        int CIIndex = -1;
        for ( int i = 0 ; i < str.length() ; i++ ) {
            char ch = str.charAt(i);
            if ( ch - '0' >= 0 &&  ch - '0' <= 9) {
                CIIndex = i;
                break;
            }
        }
        if ( CIIndex == -1 ) {
            System.out.println(str);
            return;
        }
        char firstCI = str.charAt(CIIndex);
        
       

        if (firstCI != '0') {
            char rsCh = (char)(firstCI - '0' + 'a' - 1);
            printEncodings(str.substring(0,CIIndex) + rsCh + str.substring(CIIndex+1));
        } else {
            return;
        }

        if ( CIIndex + 1 < str.length()) {
            String first2CI = str.substring(CIIndex, CIIndex + 2);
            int intch =  Integer.parseInt(first2CI);
            if ( intch <= 26 ) {
                char rs2ch = (char)(intch + 'a' - 1);
                printEncodings(str.substring(0,CIIndex) + rs2ch + str.substring(CIIndex+2));
            }
        }
    }
}

