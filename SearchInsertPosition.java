
public class SearchInsertPosition {

	 public static int searchInsert(int[] nums, int target) {
	        int low = 0,high = nums.length;
	        int mid;
			
			while (low < high) {
				mid = (low + high) / 2;
				if (nums[mid] == target) {
					return mid;
				} else if (nums[mid] > target) {
					high = mid;
					
				} else {
					low = mid+1;
				}
			}
			
			return low;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5, 9, 10, 34, 56, 67 };
		System.out.println(searchInsert(arr,6));

	}
}
