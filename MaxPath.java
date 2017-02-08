import java.util.Stack;

public class MaxPath {
	
	static int max = 0;
	String name;
	 public MaxPath() {
		 name =null; 
	 }
	 public MaxPath( String name) {
			super();
			this.name = name;
	 }	

 	public int maxLength(String input) {
 		int count = 0,sum = 0, prev =0;
 		MaxPath mp;
		String[] parts = input.split("\n");
		if(parts.length == 1 && (parts[0].length() - parts[0].replace(".", "").length()) > 0)
			return parts[0].length();
			
		sum = parts[0].length();
		Stack<MaxPath> st = new Stack<>();
		mp = new MaxPath(parts[0]); 
		st.push(mp);
		for(int i = 1; i < parts.length; i++) {
			 
			if(parts[i].length() - parts[i].replace("\t", "").length() > count  ) {
				count+=1;
				sum = sum + parts[i].length() - (parts[i].length() - parts[i].replace("\t", "").length() ) + 1;
				mp = new MaxPath(parts[i]);
				st.push(mp);
				if(parts[i].contains(".") && max  < sum) { 
					 max = sum;	
				 }
			}
			else if((parts[i].length() - parts[i].replace(" ", "").length()) > count) {
			    count+=1;
				sum = sum + parts[i].length() - 4 + 1;
				mp = new MaxPath(parts[i]);
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
					sum = sum  - mp.name.length() + (mp.name.length() - mp.name.replace("\t", "").length() ) -1;
				}//while
				count+=1;
				sum = sum + parts[i].length() - (parts[i].length() - parts[i].replace("\t", "").length() ) + 1 ;
				mp = new MaxPath(parts[i]);
				st.push(mp);
				if(parts[i].contains(".") && max  < sum) { 
					 max = sum;	
				 }
			}
		 }
	
    return max;
 	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "dir\n\ta\n\tfile.ext";
		MaxPath pm = new MaxPath();
		System.out.println(pm.maxLength(path));

	}

}
