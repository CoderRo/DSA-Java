import java.io.*;

import java.util.*;

public class balanceParanthesis {

   public static boolean checkCorrBracket(Stack<Character> stk, char ch ) {
      if (ch == ']' && stk.peek() == '[') {
         return true;
      } else if ( ch == '}' && stk.peek() == '{' ) {
         return true;
      } else if ( ch == ')' && stk.peek() == '(') {
         return true;
      } else {
         return false;
      }
   }

   public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String ipstr = scn.nextLine();
     Stack<Character> stk = new Stack<>();
     
     // Iterating the String the to check the balance paranthesis
     for ( int i = 0 ; i < ipstr.length() ; i++ ) {
        char ch = ipstr.charAt(i);
        if ( ch == ')' || ch == '}' || ch == ']') {
           if ( stk.size() > 0 && checkCorrBracket(stk,ch) ) {
              stk.pop();
           } else {
              System.out.println(false);
              return;
           }
        } else if (ch == '(' || ch == '{' || ch == '[') {
           stk.push(ch);
        }
     }
     if(stk.size() > 0 ) {
        System.out.println(false);
     } else {
        System.out.println(true);
     }
   }
}