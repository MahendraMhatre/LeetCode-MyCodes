
public class ReversseBits {

	
	public static int reverseBits(int n) {
		int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   
            if (i < 31)
                result <<= 1; 
            }
       return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		reverseBits(2);
	}

}
