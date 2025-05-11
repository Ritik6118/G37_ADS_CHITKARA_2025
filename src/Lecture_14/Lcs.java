package Lecture_14;

public class Lcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdef";
		String s2="acef";
		dp=new Integer[s1.length()][s2.length()];
		System.out.println(lcs(s1,s2,0,0));
	}
	static Integer[][] dp;

	private static int lcs(String s1, String s2, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=s1.length()  || j>=s2.length()) {
			return 0;
		}
//		System.out.println(i+" "+j +" "+ dp.length+ " "+dp[0].length);
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		int common=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			common=1+lcs(s1,s2,i+1,j+1);
		}
		int notCommon=0;
		if(s1.charAt(i)!=s2.charAt(j)) {
			notCommon=Math.max(lcs(s1,s2,i+1,j), lcs(s1,s2,i,j+1));
		}
		return dp[i][j]=Math.max(common, notCommon);
	}

}
