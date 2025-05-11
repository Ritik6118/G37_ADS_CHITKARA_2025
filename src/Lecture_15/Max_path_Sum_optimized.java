package Lecture_15;

public class Max_path_Sum_optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int ans=-10000;
    public int maxPathSum(TreeNode root) {
        // System.out.println(maxPath(root));
        // System.out.println(trav(root));
        maxPath(root);
        return ans;
    }
   
    int maxPath(TreeNode root){
        if(root==null){
            return -10000;
        }
        int l=maxPath(root.left);
        int r=maxPath(root.right);
        ans=Math.max(ans,root.val);
        ans=Math.max(ans,root.val+l);
        ans=Math.max(ans,root.val+r);
        ans=Math.max(ans,root.val+l+r);
        return Math.max(root.val,Math.max(root.val+l,root.val+r));
    }

}
