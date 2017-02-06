
public class PathSum {
	int n = 0; 
    public int pathSum(TreeNode root, int sum) {
         int [] path = new int[height(root)];   
         calPath(root, path,sum,0);
        return n;
    }
    
    public void calPath(TreeNode root, int []path,int sum, int len) {
         if(root == null)
            return;
          else {
               path[len++] = root.val;
               check(path,len,sum);
               calPath(root.left, path,sum,len);
               calPath(root.right, path,sum,len);
          }
    }
   
    // checking if there is any path in the tree with the given sum
    public void check(int[]path, int len, int sum) {
        int count = 0;
        for(int i = len -1; i>=0 ;i--) {
            count = count + path[i];
            if(count == sum) {
                n++;
            }
        }
    }
    
    //calculating height of the tree
    public int height(TreeNode root) {
        int left, right;
        if(root == null)
            return 0;
        return  (Math.max(height(root.left),height(root.right)) +1);
    }

	    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    	
	}

}
