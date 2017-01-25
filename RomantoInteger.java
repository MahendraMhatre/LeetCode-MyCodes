
public class RomantoInteger {

	 public int romanToInt(String s) {
	     char prev = 'a';
	     int count = 0,min = 0,max = 0, i = 0;
		 for(char c: s.toCharArray()) {
			min = getValue(prev);
			max = getValue(c);
			if(i == 0)
			{
				i++;
				count = count + max;
				System.out.println("count"+count);
			}
			else if(c == 'I' || c == 'V'|| c == 'X' ) {
				if(min >= max)
					count = count + max;
				else 
					count = count + max - min - 1;
				}
			else {
				if(min >= max)
					count = count + max;
				else 
					count = count + max - min - min;
				
			}
			prev = c;
		}
		 
		return count;
	  }
	 
	 public int getValue(char c) {
		 switch(c) {
		 case 'I':return 1; 
		 case 'V':return 5; 
		 case 'X':return 10;
	     case 'L':return 50;
	     case 'C':return 100;
	     case 'D':return 500;
	     case 'M':return 1000;	 
		 }
		 return 0;
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomantoInteger r1 = new RomantoInteger();
		System.out.println(r1.romanToInt("MMXIV"));
	}

}
