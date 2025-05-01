package Lecture_12;

public class Lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLIS(int[] nums) {
		dp=new Integer[nums.length+1][nums.length];
		return lis(-1,0,nums);
	}
	Integer dp[][];
	private int lis(int prev, int idx, int[] arr) {
		// TODO Auto-generated method stub
		if(idx==arr.length) {
			return 0;
		}
		if(dp[prev+1][idx]!=null) {
			return dp[prev+1][idx];
		}
		int p=0;
		if(prev==-1 || arr[prev]<arr[idx]) {
			p=1+lis(idx,idx+1,arr);
		}
		int np=0+lis(prev,idx+1,arr);
		return dp[prev+1][idx]=Math.max(p, np);
	}

}
