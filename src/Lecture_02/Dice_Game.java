package Lecture_02;

public class Dice_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6; // faces of dice
		int d=3;// distance on board
		solve(n,d,"");
	}

	private static void solve(int n, int d, String ans) {
		// TODO Auto-generated method stub
		if(d==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=1;i<=n;i++) {
			if(i<=d) {
				solve(n,d-i,ans+" "+i);				
			}
		}
	}

}
