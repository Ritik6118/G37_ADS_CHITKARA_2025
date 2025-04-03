package Lecture_01;

public class Coint_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		solve(n,"");
	}

	private static void solve(int n, String s) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(s);
			return;
		}
		solve(n-1,s+"H");
		solve(n-1,s+"T");
	}

}
