package Lecture_12;

public class House_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int rob(int[] nums) {
		dp=new Integer[nums.length];
		return rob(0,nums);
	}
	Integer dp[];
	private int rob(int i, int[] nums) {
		// TODO Auto-generated method stub
		if(i>=nums.length) {
			return 0;
		}
		if(dp[i]!=null) {
			return dp[i];
		}
		int p=nums[i]+rob(i+2,nums);
		int np=0+rob(i+1,nums);
		return dp[i]=Math.max(p,np);
	}

}
