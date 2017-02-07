import java.util.Arrays;

public class MaxProductWordLen {


	
	public int maxProduct(String[] words) {
		
		int i, j, len = 0, flag =0,max =0;
		Arrays.sort(words);
		for(i = 0; i < words.length  ; i++) {
			System.out.println(words[i]);
		}
		
		for(i = 0; i < words.length -1 ; i++) {
			for(j = i+1; j < words.length; j++ ) {
				flag = 0;
				if(words[i].equals(words[j])) {
					continue;
				}
				else {
					for(char c: words[i].toCharArray()) {
						 if(words[j].contains(c+"")) {
							 flag = 1;
							 break;
						 }	 
					} // for
					if(flag!=1) {
						len = words[i].length() * words[j].length(); 
						if(max < len)
							max = len;
					}
				} // main else
			} // for j
		} // for i
		
		return max;
        
    }
	public int newMax(String[] words)  {
		 int i, j, len = 0, flag =0,max =0;
		    int arr[][] = new int[words.length][26]; 
		    for(i =0 ; i < words.length ;i+=1) {
		    	for(char c:words[i].toCharArray()) {
		    		 arr[i][c - 'a'] =1;
		    	}
		    }
		    
		    for(i = 0; i < words.length -1; i+=1) {
		    	for(j = i+1; j < words.length; j+=1) {
		    		flag = 0;
		    		for(int k = 0; k < 26; k+=1) {
		    			if((arr[i][k] & arr[j][k]) >= 1) {
		    				flag = 1;
		    				break;
		    			}
		    		}
		    		if(flag!=1) {
						len = words[i].length() * words[j].length(); 
						if(max < len)
							max = len;
					}
		    	}// for j
		    }
		    
		    return max;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]  = {"a", "aa", "aaa","aaaa"};
		MaxProductWordLen m1 = new MaxProductWordLen();
		System.out.println("Max ::"+m1.maxProduct(words));
		System.out.println("Max ::"+m1.newMax(words));
	
	}

}
