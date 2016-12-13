import java.util.HashMap;

public class TwoSum {

	
	public static int[] twoSum(int[] nums, int target) {
        HashMap seen = new HashMap<Integer,Integer>();
		int x;
		int count = 0;
		int y[] = {0,0};
		for(int i = 0; i<nums.length; i++) {
			if(target >= nums[i]){
				x= target - nums[i];
				seen.put(i,x);
				System.out.println(i);
			}
		}
	
	for(int j=0; j<nums.length; j++) {
			if(seen.containsKey(j)  ) {
				if((int)seen.get(j) ==  target || (int)seen.get(j)!=nums[j] && count <2) {
				y[count++] = j;
				System.out.println(j);
				
				}
			}
		} 
		
		
		return y;
        
    }
	        
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num = {5,25,75};
        int y[] = twoSum(num,100);
	    for(int i= 0; i <2;i++) {
			System.out.println(y[i] + ":"+i);
	    }
	}

}
