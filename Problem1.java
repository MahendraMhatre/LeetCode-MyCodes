
public class Problem1 {

	public int solution(int n) {
		String s = String.valueOf(n);
		System.out.println(s);
		int temp = 0;
		for(int i = 0; i < s.length() - 1 ; i++) {
			temp = Character.getNumericValue(s.charAt(i)) +  Character.getNumericValue(s.charAt(i+1));
			System.out.println(s.substring(0, i)+Integer.toString(temp) + s.substring(i+2, s.length()));
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 p1 = new Problem1();
		p1.solution(12345876);
	}

}
