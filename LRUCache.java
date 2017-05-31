
public class LRUCache {
	
	int key, age,value;
	static int count = 0;
	LRUCache lr[];

	public LRUCache() {
	
	}
    public LRUCache(int capacity) {
         lr = new LRUCache[capacity];
    }
    
    public int get(int key) {
        
    	for(int i = 0 ; i < lr.length; i++) {
    		if(lr[i].key == key )
    			{   
    			    lr[i].age +=1;
    				return lr[i].key;
    			}
    	}
    	
    	return -1;
    }
    
    public void put(int key, int value) {
    	int min = Integer.MAX_VALUE, index = 0;  
        if(count >= lr.length) {
        	
        	  for(int i = 0; i < lr.length ; i++) {
        		  if(lr[i].age < min) {
        			  min = lr[i].age;
        		      index = i;
        		  }
        	  }
        	  lr[index].key = key; 
        	  lr[index].value = value; 
        	  lr[index].age = 1;
          }
          else {
        	  lr[count] = new LRUCache();
        	  lr[count].key = key;
        	  lr[count].value = value;
        	  lr[count].age = 1;
        	  count+=1; 
        	  
          }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1)); 

		
		cache.put(3, 3);    // evicts key 2
		System.out.println(cache.get(2));       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		System.out.println(cache.get(1));       // returns -1 (not found)
		System.out.println(cache.get(3));       // returns 3
		System.out.println(cache.get(4));       // returns 4 
	
	}

}
