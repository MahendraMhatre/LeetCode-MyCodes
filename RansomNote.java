import java.util.HashMap;

public class RansomNote {

	
	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap hm = new HashMap();
        char [] c1 = ransomNote.toCharArray();
        char [] c2 = magazine.toCharArray();
        
        int i,count =0;
        for(i = 0; i < magazine.length(); i++) {
            if(hm.containsKey(c2[i])) {
                count = (int) hm.get(c2[i]);
                hm.put(c2[i], ++count);
            }
            else {
                hm.put(c2[i], 1);
            }
        }
        for(i = 0; i < ransomNote.length(); i++) {
            if(hm.containsKey(c1[i])) {
                count = (int) hm.get(c1[i]);
                if(count == 1)
                    hm.remove(c1[i]);
                else
                    hm.put(c1[i],--count);
            }
            else {
                return false;
            }
        }
        
     return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNote r = new RansomNote();
		System.out.println(r.canConstruct("abc", "aaaabc"));
		

	}

}
