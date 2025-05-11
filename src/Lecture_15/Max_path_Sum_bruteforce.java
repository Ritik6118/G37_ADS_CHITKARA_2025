package Lecture_15;

public class Max_path_Sum_bruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxPathSum(TreeNode root) {
	        // System.out.println(maxPath(root));
	        // System.out.println(trav(root));
	        return trav(root);

	    }
	    public int trav(TreeNode root){
	        if(root==null){
	            return -10000;
	        }
	        int l=trav(root.left);
	        int r=trav(root.right);

	        // calculate max
	        int leftsum=maxPath(root.left);
	        int rightsum=maxPath(root.right);
	        int ans=root.val;
	        ans=Math.max((root.val+leftsum+rightsum),ans);
	        ans=Math.max((root.val+leftsum),ans);
	        ans=Math.max((root.val+rightsum),ans);
	        //calculate max
	        return Math.max(ans,Math.max(l,r));
	    }
	    int maxPath(TreeNode root){
	        if(root==null){
	            return -10000;
	        }
	        int l=maxPath(root.left);
	        int r=maxPath(root.right);
	        return Math.max(root.val,Math.max(root.val+l,root.val+r));
	    }

}
