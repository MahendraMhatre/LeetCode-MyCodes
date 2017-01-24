import java.util.Arrays;

public class MinNumberofMoves {
	
	public int minMoves(int[] nums) {
        int i = 0, count = 0;
        Arrays.sort(nums);
        for(i = 1;i < nums.length ; i++) {
            count = count + nums[i] - nums[0]; 
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MinNumberofMoves m1 = new MinNumberofMoves();
      int n1[] = {4,7,8,9};
      System.out.println(m1.minMoves(n1));
	}

}
