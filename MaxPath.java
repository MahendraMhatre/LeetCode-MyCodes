import java.util.Stack;

public class MaxPath {
	int sum, depth;
	static int max = 0;
	String name;
	 public MaxPath() {
		 this.sum = 0;
		 this.depth = 0;
		 name =null; 
	 }
	 
	 
	 public MaxPath(int sum, int depth, String name) {
			super();
			this.sum = sum;
			this.depth = depth;
			this.name = name;
	 }	

 	public int maxLength(String path) {
 		int count = 0,sum = 0, prev =0;
 		MaxPath mp;
		String[] parts = path.split("\n");
		System.out.println(parts[0]);
		Stack<MaxPath> st = new Stack<>();
		mp = new MaxPath(3, 0,parts[0]); 
		st.push(mp);
		for(int i = 1; i < parts.length; i++) {
			 
			if(parts[i].length() - parts[i].replace("\t", "").length() > count) {
				count+=1;
				sum = sum + parts[i].length() ;
				mp = new MaxPath(sum, count,parts[i]);
				st.push(mp);
				if(parts[i].contains(".") && max  < sum) { 
					 max = sum;	 
				 }
			}
			else {
				prev = parts[i].length() - parts[i].replace("\t", "").length();
				while(!st.isEmpty() && prev <= count) {
					mp = st.pop();
					count-=1;
					sum = sum  - mp.name.length();
				}
				count+=1;
				sum = sum + parts[i].length() ;
				mp = new MaxPath(sum, count,parts[i]);
				st.push(mp);
			}
		 }
		
		/*if(st.size() <= 1)
			return 0;
		while(!st.isEmpty()) {
			mp = st.pop();
			if( (mp.name.length() - mp.name.replace("\t", "").length()) <= 0)
				sum = sum + mp.name.length();
			else 
			 sum = sum + mp.name.length() -(mp.name.length() - mp.name.replace("\t", "").length()) + 1 ;
				
				
		}*/
	
		
    return max ;
 	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		MaxPath pm = new MaxPath();
		System.out.println(pm.maxLength(path));

	}

}
