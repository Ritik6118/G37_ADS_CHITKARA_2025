package Lecture_11;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minCostClimbingStairs(int[] cost) {
		dp=new Integer[cost.length];
        int a=mincost(0,cost);
        // dp[]=new Integr[cost.length];
		int b=mincost(1,cost);
		
        return Math.min(a, b);
	}
    Integer[] dp;
	private int mincost(int i, int[] arr) {
		// TODO Auto-generated method stub
		if(i>=arr.length) {
			return 0;
		}
        if(dp[i]!=null){
            return dp[i];
        }
		int a=mincost(i+1,arr)+arr[i];
		int b=mincost(i+2,arr)+arr[i];
		return dp[i]=Math.min(a, b);
	}

}
