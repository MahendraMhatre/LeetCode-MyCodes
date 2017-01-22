

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {

	
	public int[] intersection(int[] nums1, int[] nums2) {
        int i,count = 0;
        List<Integer> res = new ArrayList();
        int res1[];
        HashMap hm = new HashMap();
        for(i = 0; i < nums1.length; i++) {
            hm.put(nums1[i],0);
        }
        for(i = 0; i < nums2.length; i++) {
            if(hm.containsKey(nums2[i])) {
                hm.put(nums2[i],1);
            }
        }
        Map mp = hm;
        Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        if((int)pair.getValue() == 1) {
				res.add((int)pair.getKey());
	        }
	        it.remove(); 
	    }
	   res1 = new int[res.size()]; 
	   for(i = 0; i < res.size();i++)
	   {
	       res1[count++] = (int)res.get(i);
	   }
      return res1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int nums1[] =  {1,2,2,1,3};
	  int nums2[] =  {2,3};
	  int res[];
      ArrayIntersection ai = new ArrayIntersection();
      res = ai.intersection(nums1, nums2);
      for(int i = 0; i < res.length;i++)
	   {
	       System.out.println(res[i]);
	   }
	}

}
