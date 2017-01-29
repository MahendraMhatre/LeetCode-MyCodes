
public class PalindromeNumber {

	public boolean isPalindrome_NotEfficient(int x) {
      
		String s = Integer.toString(x);
		char c[] = s.toCharArray();
		int i = 0,j, flag = 0;
        for(i =0, j = s.length() - 1 ; i < s.length()/2 ; i++, j--) {
        	if(c[i] != c[j]) {
        		flag = 1;
        		break;
        	}
        }
        if(flag == 1)
        	return false;
		
        return true;
    }
	
	public boolean isPalindrome(int x) {
		
		int res = 0, n = x;
		int i = 0,len = String.valueOf(x).length();
		while(i< len/2) {
			res = res * 10 + n % 10;
			n = n/10;
			i++;
		}
		if(res == n || res == n/10)	
			return true;
			
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber pn = new PalindromeNumber();
		//System.out.println();
	   System.out.println(pn.isPalindrome(1234321));
	}

}
