
public class ThirdMaximumNumber {
	
	 public int thirdMax(int[] num) {
	     int max1 = 0, max2 = 0, max3 = 0, temp =0; 
	     
	     for(int i=0 ; i <num.length; i++) {
	    	  if(num[i] >= max1 ) {
	    		  max3 = max2;
	    		  max2 = max1;
	    		  max1 = num[i];
	    	  } 
	    	  else if(num[i] >= max2) {
	    		  max3 = max2;
	    		  max2 = num[i];
	    	  }
	         else if(num[i] >= max3) {
	    		  max3 = num[i];
	    	  }
	    	  
	     }
	     System.out.println(max1 + " "+max2 + " " + max3);
		 return max3;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {3, 2, 1, 4, 5, 6, 7,7,7,8};
		ThirdMaximumNumber th = new ThirdMaximumNumber();
		th.thirdMax(num);

	}

}
