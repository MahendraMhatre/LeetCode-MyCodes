import java.util.HashMap;

public class Anagram {

	public boolean isAnagram(String s, String t) {
	     int count = 0;
		 HashMap hm = new HashMap(); 
	     for(char c: s.toCharArray()) {
	       if(hm.containsKey(c)) {
	    	   count = (int) hm.get(c);
	    	   hm.put(c, ++count);
	       }
	       else
	    	   hm.put(c, 1);
	     }
	     for(char c: t.toCharArray()) {
		       if(hm.containsKey(c)) {
		    	   count = (int) hm.get(c);
		    	   if(count == 1)
		    		   hm.remove(c);
		    	   else
		    		   hm.put(c, --count);
		       }
		       else
		    	  return false;
		     }
	     
	     
		return true;   
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram a1 = new Anagram();
		System.out.println(a1.isAnagram("cat","act"));
	}

}
