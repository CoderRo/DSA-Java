package bitManipulation;
import java.util.Scanner;

public class TrailingZerosCount {
    public int solve(int A) {
        int count = 0;
        while(A!=0){
            if( (A & 1) == 0) {
                count++;
            }else{
                break;
            }
            A = A>>1;
        }
        return count;
    }
    public static void main(String args[]) {
    	Scanner scObj = new Scanner(System.in);
    	int n = scObj.nextInt();
    	TrailingZerosCount newObj = new TrailingZerosCount();
    	System.out.println(Integer.toBinaryString(n));
    	System.out.println(newObj.solve(n));	
    }
}
