package Lecture_03;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> li=new ArrayList<>();
		solve(n,0,0,"",li);
		System.out.println(li);
	}

	private static void solve(int n, int c, int o, String ans, List<String> li) {
		// TODO Auto-generated method stub
		if(o==n && c==n) {
//			System.out.println(ans);
			li.add(ans);
			
			return;
		}
		if(o>n || c>n || o<c) {
			return;
		}
		solve(n,c,o+1,ans+"(",li);
		solve(n,c+1,o,ans+")",li);
	}

}
