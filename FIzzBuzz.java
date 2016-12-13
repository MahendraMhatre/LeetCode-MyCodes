import java.util.ArrayList;
import java.util.List;

public class FIzzBuzz {

	 public static List<String> fizzBuzz(int n) {
	     int i = 0; 
	     List<String> l1 = new ArrayList<>();
	     if(n == 0) {
	    	 return null;
	     }
	     else {
	    	 for(i = 1; i <= n ;i++) {
	    		 if(i%3 == 0 && i%5 == 0) 
	    			 l1.add("FizzBuzz");
	    		 else if(i%3 == 0)
	    			 l1.add("Fizz");
	    		 else if(i%3 == 0)
	    			 l1.add("Buzz");
	    		 else
	    			 l1.add(Integer.toString(i));
	    		 
	    	 }	    	 
	     }
	     
	     return l1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>l2 = fizzBuzz(15); 
		System.out.println(l2);
		
	}

}
