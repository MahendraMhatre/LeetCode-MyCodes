import java.util.HashMap;

public class FindTheDifference {

	
	 public char findTheDifference(String s, String t) {
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	        char str[]  = s.toCharArray();
	        char str1[]  = t.toCharArray();
	        int i,j,count =0;
	        for(i = 0; i < str.length ;i++) {
	            if(hm.containsKey(str[i])) {
	            	count = (int) hm.get(str[i]);
	            	hm.put(str[i], ++count);
	            }
	            else{
	            	hm.put(str[i], 1);
	            }
	            	
	        }
	        
	        for(i = 0; i < str1.length ;i++) {
	            if(hm.containsKey(str1[i])) {
	            	count = (int) hm.get(str1[i]);
	                if(count == 1)
	                	hm.remove(str1[i]);
	                else {
	                	hm.put(str1[i], --count);
	                }
	            }
	            else{
	            	return str1[i];
	            }
	            	
	        }
	        
			return 0;
     
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheDifference fd = new FindTheDifference();
		System.out.println(fd.findTheDifference("abcd","abcde"));
		
	}

}
