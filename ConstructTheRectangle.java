


public class ConstructTheRectangle {

	public int[] constructRectangle(int area) {
        int i = 0;
		int ans[] = new int [2];
		int y = (int) Math.sqrt(area);
		while(area%y!=0) {
			y--;
		}
		ans[0] = area/y;
		ans[1] = y;
		return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructTheRectangle c1 = new ConstructTheRectangle();
	    int ans[] = c1.constructRectangle(50);
		for(int i = 0; i <  ans.length; i++) {
			System.out.println(ans[i]);
		}
		
  }

}
