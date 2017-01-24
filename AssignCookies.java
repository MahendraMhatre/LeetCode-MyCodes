import java.util.Arrays;

public class AssignCookies {
	
	public int cookie(int g[], int s[]) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0, count = 0, j = 0;
		while(i < g.length  && j < s.length ) {
			if(g[i] <= s[j]) {
			    count+=1;
			    i+=1;
			    j+=1;
			    
			}
			else {
			    j+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		AssignCookies a1 = new AssignCookies();
		int n1[] = {1,2};
		int n2[] = {1,2,3};
		System.out.println(a1.cookie(n1,n2));
		
	}
}
