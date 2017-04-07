import java.util.HashMap;

public class LRU {
	 int cap;
	 int key, value;
	 DNode head;
	 DNode tail;
	 HashMap <Integer, DNode> cache;
	
	
	public LRU(int capacity) {

		cache = new HashMap<Integer, DNode>();
	 	cap  = capacity;
	 	head = new DNode();
	 	tail = new DNode();
	 	head.pre = null;
	 	tail.post = null;
	 	head.post = tail;
	 	tail.post = head; 	
	}
	
	public void removeNode(DNode node) {
		DNode pre = node.pre;
		DNode post = node.post;
		
		pre.post = post;
		post.pre = pre;
		
	}
	
	public void addNode(DNode node) {
		node.pre = head;
		node.post = head.post;
		head.post.pre = node;
		head.post = node;
		
	}
	
	public void moveToHead(DNode node) {
		this.removeNode(node);
		this.addNode(node);
		
	}
	
	public DNode removeTail() {
		DNode pre = tail.pre;
		this.removeNode(pre);
		return pre;	
	}

	public void put(int key, int value) {
		if(cache.containsKey(key)) {
			DNode temp = cache.get(key);
			temp.value = value;
			this.removeNode(temp);
			this.addNode(temp);
		}
		else {
			if(cache.size() >= cap) {
				DNode x = this.removeTail();
			    DNode temp = new DNode();
			    temp.key = key;
			    temp.value = value;
			    cache.remove(x.key);
			    cache.put(key, temp);
			    this.addNode(temp);
			}
			else {
				 DNode temp = new DNode();
				 temp.key = key;
				 temp.value = value;
				 cache.put(key, temp);
				 this.addNode(temp);
			}
		}
	}
	

	public int get(int key) {
		DNode temp = null;
		if(cache.containsKey(key)) {
			temp = cache.get(key);
			this.removeNode(temp);
			this.addNode(temp);
			return temp.value;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU cache = new LRU(2);
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
