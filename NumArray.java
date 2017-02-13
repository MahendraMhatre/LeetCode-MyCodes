import java.util.Arrays;

public class NumArray {

	int nums[];
    public NumArray(int[] nums) {
        this.nums = Arrays.copyOf(nums, nums.length);;
        
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
    	for(int k = i ; k < j; k+=1) {
    		sum +=nums[k];
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
