package array;
import java.util.Scanner;

public class MooreAlgoMajorityElement {

	public int majorityElement (int[] numbers) {
		int majEle = numbers[0];
		int max = 0;
	
		for ( int i = 0; i < numbers.length ; i++) {
			if ( majEle == numbers[i] ) {
				max++;
			}else {
				max--;
			}
			if ( max == 0 ) {
				majEle = numbers[i];
				max = 1;
			}
		}
		int majCount = 0;
		for ( int  i = 0 ; i < numbers.length ; i++ ) {
			if ( numbers[i] == majEle ) {
				majCount++;
			}
		}
		return majCount >  (numbers.length/2)  ? majEle : -1;
	}
	public static void main(String args[]) {
		try (Scanner scObj = new Scanner(System.in)) {
			int arrLen = scObj.nextInt();
			
			int numbers [] = new int[arrLen];
			
			for ( int i = 0 ; i < arrLen ; i++) {
				numbers[i] = scObj.nextInt();
			}
			System.out.print("Hello World");
			MooreAlgoMajorityElement newObj = new MooreAlgoMajorityElement();
			System.out.print(newObj.majorityElement(numbers));
		}		
	}
}
