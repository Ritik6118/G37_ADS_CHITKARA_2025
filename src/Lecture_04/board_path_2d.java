package Lecture_04;

public class board_path_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fun(1,1,n,"");
		
	}

	private static void fun(int r, int c, int n, String s) {
		// TODO Auto-generated method stub
		if(r==n && c==n) {
			System.out.println(s);
			return ;
		}
		if(r>n || c>n) {
			return ;
		}
		fun(r,c+1,n,s+"R");
		fun(r+1,c,n,s+"D");
	}

}
