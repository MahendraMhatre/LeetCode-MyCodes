import java.util.HashMap;

public class FirstUniqueCharacter {

	 public int firstUniqChar(String s) {
		
		 int count = 0, i = 0;
		 HashMap hm = new HashMap(); 
	     for(char c: s.toCharArray()) {
	       if(hm.containsKey(c)) {
	    	   count = (int) hm.get(c);
	    	   hm.put(c, ++count);
	       }
	       else
	    	   hm.put(c, 1);
	     }
	     
	     for(char c: s.toCharArray()) {
	    	 if(hm.containsKey(c)) {
		    	   count = (int) hm.get(c);
		    	   if(count == 1) {
		    		   return i;
		    	   }
		        
	    	 }
	         i+=1;
	     }
	   
		 return -1;    
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUniqueCharacter f1 = new FirstUniqueCharacter();
		System.out.println(f1.firstUniqChar("leetcode"));
	}

}
