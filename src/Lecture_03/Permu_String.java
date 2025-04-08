package Lecture_03;

public class Permu_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		solve(s,"");
	}

	private static void solve(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			solve(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
		}
	}

}
