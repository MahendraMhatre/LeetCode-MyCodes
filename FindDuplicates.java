import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	 public List<Integer> findDuplicates(int[] nums) {
		 int index =0;   
		 ArrayList<Integer> al = new ArrayList();
	        for(int i = 0; i < nums.length ;i+=1) {
	             index = Math.abs(nums[i]) - 1;
	               if(nums[index] < 0) {
	                    al.add(nums[i]);
	                    System.out.println(Math.abs(nums[i]));
	                   }
	              nums[Math.abs(nums[i]) -1] = -nums[Math.abs(nums[i]) -1];
	                     
	        }
	        
	        
	     return null;   
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,3,2,7,8,2,3,1};
		FindDuplicates fd = new FindDuplicates();
		fd.findDuplicates(nums);

	}

}
