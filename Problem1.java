
public class Problem1 {

	int max = Integer.MIN_VALUE;
	public int solution(int n) {
		String s = String.valueOf(n);
		String str;
		System.out.println(s);
		int temp = 0;
		for(int i = 0; i < s.length() - 1 ; i++) {
			temp = Character.getNumericValue(s.charAt(i)) +  Character.getNumericValue(s.charAt(i+1));
			temp = (int) Math.ceil((float)temp/2);
			str = s.substring(0, i)+Integer.toString(temp) + s.substring(i+2, s.length());
			if(max < Integer.parseInt(str)) {
				max = Integer.parseInt(str);
			}
			System.out.println(s.substring(0, i)+Integer.toString(temp) + s.substring(i+2, s.length()));
		}
		System.out.println("Max ::" + max);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 p1 = new Problem1();
		p1.solution(623315);
	}

}
