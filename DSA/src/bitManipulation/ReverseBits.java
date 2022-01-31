package bitManipulation;

public class ReverseBits {
	public long reverse(long a) {
        long rev = 0;
        int count = 0;
        while (count<32)
        {
            // bitwise left shift
            // 'rev' by 1
            rev = rev << 1;
 
            // if current bit is '1'
            if ((a & 1) != 0){
                rev = rev + 1;
            }
 
            // bitwise right shift
            //'n' by 1
            a = a >> 1;
            count++;
        }
        // required number
        return rev;
    }
}
